package com.ocrgroup.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ocrgroup.utils.VinConfig;
import com.ocrgroup.utils.VinOcrUtils;
import com.ocrgroup.utils.PhotoFromPhotoAlbum;
import com.ocrgroup.utils.StreamUtil;
import com.ocrgroup.view.OcrProgressDialog;
import com.ocrgroup.vin.VINAPI;

import java.io.File;

/**
 * 识别图像的Activity
 * 从相册选择的图像
 */
public class VinRecogActivity extends Activity {

	private VINAPI vinApi;
	private OcrProgressDialog progress;
	private String vinThumbPath = "";
	private String vinResult = "识别失败";
	//导入识别
	private static final int IMPORT_PHOTO = 105;
	// 编辑识别
	private static final int CROP_PHOTO = 106;
	private int screenWidth;
	private int screenHeight;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		screenWidth = getWindowManager().getDefaultDisplay().getWidth();
		screenHeight = getWindowManager().getDefaultDisplay().getHeight();
		//创建保存图像的文件夹
		File dir = new File(VinConfig.saveImgPath);
		if (!dir.exists() && !dir.isDirectory()) {
			dir.mkdirs();
		}
		//初始化识别核心
		vinApi = VINAPI.getVinInstance();
		int initKernalCode = vinApi.getInitCode();
		// 获取授权/核心信息
		VinOcrUtils.getOcrInfo(this, vinApi);
		if (initKernalCode != 0) {//其他值代表激活失败，具体请参考开发文档
			LinearLayout linearLayout = new LinearLayout(this);
			setContentView(linearLayout);
			TextView mTvTishi = new TextView(this);
			mTvTishi.setText("OCR核心激活失败:" + initKernalCode + "\r\n错误信息：" + VinConfig.getErrorInfo(initKernalCode));
			mTvTishi.setTextColor(Color.BLACK);
			linearLayout.addView(mTvTishi);
		} else {
			//调用系统相册
			Intent selectIntent = new Intent(Intent.ACTION_PICK, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
			selectIntent.setType("image/*");
			if (selectIntent.resolveActivity(getPackageManager()) != null) {
				startActivityForResult(selectIntent, IMPORT_PHOTO);
			}
			if (VinConfig.isCheckMotorbike) {
				vinApi.VinSetRecogParam(1);
			} else {
				vinApi.VinSetRecogParam(0);
			}
		}
	}

	/**
	 * 接收系统相册的回调
	 *
	 * @param requestCode
	 * @param resultCode
	 * @param data
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		// 编辑识别
		if (data != null && requestCode == CROP_PHOTO) {
			final String imageFilePath = data.getStringExtra("imgpath");
			Log.e("imagepath", imageFilePath);
			// 识别
			importRecog(imageFilePath);
		} else if (data != null && requestCode == IMPORT_PHOTO) {  // 导入识别
			//拿到选择的图片路径 ：imageFilePath
			final String imageFilePath = PhotoFromPhotoAlbum.getRealPathFromUri(this, data.getData());
			Log.e("imagepath", imageFilePath);
			// 判断是否开启编辑-跳转编辑
			if (VinConfig.isImportCrop && !TextUtils.isEmpty(imageFilePath)) {
				Intent intent = new Intent(VinRecogActivity.this, VinCropActivity.class);
				intent.putExtra("imgpath", imageFilePath);
				startActivityForResult(intent, CROP_PHOTO);
				return;
			}
			// 识别
			importRecog(imageFilePath);
		} else {//如果未选择图片，则页面退出
			finish();
		}

	}

	/**
	 * 导入识别方法
	 */
	private void importRecog(final String imageFilePath) {
		// 识别流程
		if (!TextUtils.isEmpty(imageFilePath)) {
			progress = new OcrProgressDialog(this);
			progress.show();
			new Thread(new Runnable() {
				@Override
				public void run() {
					//调用识别接口
//					final int nRet = vinApi.VinRecognizeImageFile(imageFilePath);
//					Bitmap bitmap = getSmallBitmap(imageFilePath, screenWidth, screenHeight);
					Bitmap bitmap = BitmapFactory.decodeFile(imageFilePath);
					//识别bitmap图像
					final int nRet = vinApi.VinRecognizeBitmapImage(bitmap);
					if (nRet == 0) {
						//获取识别结果
						vinResult = vinApi.VinGetResult();
						File file = new File(VinConfig.saveImgPath);
						if (file.exists() && file.isDirectory() && VinConfig.isSaveThume) {
							//生成纯VIN码小图。
							int pLineWarp[] = new int[32000];
							vinApi.VinGetRecogImgData(pLineWarp);
							//这个bitmap就是纯VIN码小图
							Bitmap bitmapThumb = Bitmap.createBitmap(pLineWarp, 400, 80, Bitmap.Config.ARGB_8888);
							vinThumbPath = new StreamUtil().saveBitmapFile(bitmapThumb, VinConfig.saveImgPath, "VIN");
						}
					} else {
						vinThumbPath = imageFilePath;
						vinResult = "识别失败,图像中未发现VIN码 errocode = " + nRet;
					}
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							if (progress != null) progress.dismiss();
							Intent intent = new Intent();
							Log.e("RecogActivity", vinThumbPath);
							intent.putExtra("vinResult", vinResult);
							intent.putExtra("vinThumbPath", vinThumbPath);
							intent.putExtra("recogCode", nRet);
							VinRecogActivity.this.setResult(RESULT_OK, intent);
							VinRecogActivity.this.finish();
//								}
						}
					});

				}
			}).start();
		}
	}

	public Bitmap getSmallBitmap(String filePath, int reqWidth, int reqHeight) {
		final BitmapFactory.Options options = new BitmapFactory.Options();
		options.inJustDecodeBounds = true;
		BitmapFactory.decodeFile(filePath, options);

		// Calculate inSampleSize
		options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

		// Decode bitmap with inSampleSize set
		options.inJustDecodeBounds = false;
		//避免出现内存溢出的情况，进行相应的属性设置。
		options.inPreferredConfig = Bitmap.Config.ARGB_8888;
		options.inDither = true;

		return BitmapFactory.decodeFile(filePath, options);
	}

	/**
	 * <li> 计算图片的缩放值 </li>
	 *
	 * @param options   options
	 * @param reqWidth  宽
	 * @param reqHeight 高
	 * @return inSampleSize
	 */
	public int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
		final int height = options.outHeight;
		final int width = options.outWidth;
		int inSampleSize = 1;

		if (height > reqHeight || width > reqWidth) {
			final int heightRatio = Math.round((float) height / (float) reqHeight);
			final int widthRatio = Math.round((float) width / (float) reqWidth);
			inSampleSize = heightRatio < widthRatio ? heightRatio : widthRatio;
		}
		return inSampleSize;
	}

	@Override
	protected void onDestroy() {
//		if (vinApi != null) {
//			vinApi.releaseKernal();
//		}
		if (progress != null) {
			progress.dismiss();
			progress = null;
		}
		super.onDestroy();
	}
}
