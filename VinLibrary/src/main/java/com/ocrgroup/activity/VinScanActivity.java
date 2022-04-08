package com.ocrgroup.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ocrgroup.camera.CommonCameraView;
import com.ocrgroup.utils.DetectStateUtil;
import com.ocrgroup.utils.NV21ToARGBUtil;
import com.ocrgroup.utils.PhotoFromPhotoAlbum;
import com.ocrgroup.utils.StreamUtil;
import com.ocrgroup.utils.ToastUtil;
import com.ocrgroup.utils.VinConfig;
import com.ocrgroup.utils.VinOcrUtils;
import com.ocrgroup.view.OcrProgressDialog;
import com.ocrgroup.view.VinScanRectView;
import com.ocrgroup.vin.VINAPI;
import com.ocrgroup.vinlibrary.R;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 视频流识别vin
 */
public class VinScanActivity extends Activity implements CommonCameraView.PreviewFrameListener, View.OnClickListener {

    private int screenHeight;
    private int screenWidth;
    private CommonCameraView mCameraView;
    private ImageButton mTitleIbBack;
    private TextView mTitleTvHead;
    private TextView mImageTV;
    private ImageButton mTitleIbChange;
    private boolean isVertical = true;
    private boolean isOpenFlash = false;
    private TranslateAnimation horizontalAnimation;
    private TranslateAnimation verticalAnimation;
    private VinScanRectView mRectview;
    private ImageView mIvvScanLine;
    private ImageView mIvhScanLine;
    private LinearLayout mLlFlashLight;
    private ImageView mIvFlashLight;
    private TextView mTvCue;
    private FrameLayout mFrameLayout;
    private VINAPI vinApi;
    private int orientation;
    public int preWidth = 0;
    public int preHeight = 0;
    private int[] borders;
    private RelativeLayout mRootLayout;
    private boolean isRecogVin = true;

    private DetectStateUtil detectStateUtil; //环境监测工具

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_vin);
        // 初始化view
        initView();
        // 初始化竖向识别
        initVerticalView();
        // 初始化监听
        initListener();
        //创建保存图像的文件夹
        File file = new File(VinConfig.saveImgPath);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        detectStateUtil = new DetectStateUtil();
    }

    @Override
    protected void onStart() {
        super.onStart();
        isRecogVin = true;
        vinApi = VINAPI.getVinInstance();
        //获取初始化核心的错误码：解决方案详见开发文档
        int initKernalCode = vinApi.getInitCode();
        Log.e("initKernalCode", initKernalCode + "");
        // 获取授权/核心信息
        VinOcrUtils.getOcrInfo(this, vinApi);
        if (initKernalCode == 0) {
            if (VinConfig.isCheckMotorbike) {
                vinApi.VinSetRecogParam(1);
            } else {
                vinApi.VinSetRecogParam(0);
            }
        } else {
            mTvCue.setText("OCR核心激活失败，ErrorCode:" + initKernalCode + "\r\n错误信息：" + VinConfig.getErrorInfo(initKernalCode));
        }
    }

    /**
     * 初始化view
     */
    private void initView() {
        mFrameLayout = (FrameLayout) findViewById(R.id.aevs_vin_frame_layout);
        mRootLayout = (RelativeLayout) findViewById(R.id.vin_root_layout);
        mTitleIbBack = (ImageButton) findViewById(R.id.title_ib_left);
        mTitleTvHead = (TextView) findViewById(R.id.title_tv_head);
        mTitleIbChange = (ImageButton) findViewById(R.id.title_ib_right);
        mRectview = (VinScanRectView) findViewById(R.id.aevs_vsrv_rectview);

        mIvvScanLine = (ImageView) findViewById(R.id.aevs_ivv_scanline);
        mIvhScanLine = (ImageView) findViewById(R.id.aevs_ivh_scanline);
        mLlFlashLight = (LinearLayout) findViewById(R.id.aevs_ll_flashlight);
        mIvFlashLight = (ImageView) findViewById(R.id.aevs_iv_flashlight);
        mTvCue = (TextView) findViewById(R.id.aevs_tv_cue);
        mImageTV = (TextView) findViewById(R.id.mImageTV);
        mImageTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //调用系统相册
                Intent selectIntent = new Intent(Intent.ACTION_PICK, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
                selectIntent.setType("image/*");
                if (selectIntent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(selectIntent, 1000);
                }
                if (VinConfig.isCheckMotorbike) {
                    vinApi.VinSetRecogParam(1);
                } else {
                    vinApi.VinSetRecogParam(0);
                }

//                Intent intent = new Intent(Intent.ACTION_PICK,
//                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                startActivityForResult(intent, 1000); //打开相册
            }
        });


        // 获取屏幕宽高
        DisplayMetrics metrics = new DisplayMetrics();
        // 获取Manager对象后获取Display对象，然后调用getMetrics()方法
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        // 从DisplayMetrics对象中获取宽、高
        screenHeight = metrics.heightPixels;
        screenWidth = metrics.widthPixels;
        // 设置标题
        mTitleTvHead.setText("车架号VIN码识别");
        // 初始化相机view
        mCameraView = new CommonCameraView(this, screenWidth, screenHeight, CommonCameraView.LOW, 0);
        mFrameLayout.addView(mCameraView);
    }
    private OcrProgressDialog progress;
    private String vinResult = "识别失败";
    private String vinThumbPath = "";
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
                            setResult(RESULT_OK, intent);
                            finish();
//								}
                        }
                    });

                }
            }).start();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null && requestCode == 1000) {
            Uri uri = data.getData();
            Log.d("日志", "图片uri:" + uri);
            try {
                //拿到选择的图片路径 ：imageFilePath
                final String imageFilePath = PhotoFromPhotoAlbum.getRealPathFromUri(this, data.getData());
                Log.e("imagepath", imageFilePath);
                // 判断是否开启编辑-跳转编辑
//                if (VinConfig.isImportCrop && !TextUtils.isEmpty(imageFilePath)) {
//                    Intent intent = new Intent(VinRecogActivity.this, VinCropActivity.class);
//                    intent.putExtra("imgpath", imageFilePath);
//                    startActivityForResult(intent, CROP_PHOTO);
//                    return;
//                }
                // 识别
                importRecog(imageFilePath);




//                Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), uri);
////                Bitmap bitmap = BitmapFactory.decodeStream(this.getContentResolver().openInputStream(uri));
//                ProgressDialog dialog = new ProgressDialog(this);
//                dialog.setMessage("识别中请稍后");
//                dialog.show();
//                new Thread() {
//                    @Override
//                    public void run() {
//                        long time = System.currentTimeMillis();
//                        Log.d("日志", "图片uri:" + uri);
//                        int result = vinApi.VinRecognizeBitmapImage(bitmap);
////                        vinApi.VinRecogFile()
//                        long useTime = System.currentTimeMillis() - time;
//                        Log.d("日志", "处理了多久:" + useTime);
//                        runOnUiThread(() -> {
//                            dialog.dismiss();
//                            String s = vinApi.VinGetResult();
//                            Log.d("日志", "结果:" + s);
//                            Log.d("日志", "结果Code:" + result);
//                            Intent intent = new Intent();
//                            if (result == 0&&!s.isEmpty()) {
//                                //扫描成功
//                                intent.putExtra("vinResult", s);
//                                intent.putExtra("recogCode", 0);
//                                setResult(RESULT_OK, intent);
//                                finish();
//                            } else if (result == -2) {
//                                //扫描失败
//                                Toast.makeText(VinScanActivity.this, "未发现Vin码请重新选择", Toast.LENGTH_SHORT).show();
//                            } else {
//                                Toast.makeText(VinScanActivity.this, "扫描失败请重试", Toast.LENGTH_SHORT).show();
//                            }
//                        });
//                    }
//                }.start();

//                handler.post(() -> {
//                    long time= System.currentTimeMillis();
//                    Log.d("日志", "图片uri:" + uri);
//                    int result = vinApi.VinRecognizeBitmapImage(bitmap);
//                    long useTime= System.currentTimeMillis()-time;
//                    Log.d("日志", "处理了多久:" + useTime);
//
//                    runOnUiThread(() -> {
//                        String s = vinApi.VinGetResult();
//                        Log.d("日志", "结果:" + s);
//                        Log.d("日志", "结果Code:" + result);
//                        Intent intent = new Intent();
//                        if (result == 0) {
//                            //扫描成功
//                            intent.putExtra("vinResult", s);
//                            intent.putExtra("recogCode", 0);
//                            setResult(RESULT_OK, intent);
//                            finish();
//                        } else if (result == -2) {
//                            //扫描失败
//                            Toast.makeText(VinScanActivity.this, "未发现Vin码请重新选择", Toast.LENGTH_SHORT).show();
//                        } else {
//                            Toast.makeText(VinScanActivity.this, "未知错误,请稍后再试", Toast.LENGTH_SHORT).show();
//                        }
//
//                    });
//                });


            } catch (Exception e) {
                Log.d("日志", "出错了:" + e.getMessage().toString());
                Toast.makeText(this, e.getMessage().toString(), Toast.LENGTH_SHORT).show();
                finish();
            }
        }
    }


    /**
     * 初始化监听
     */
    private void initListener() {
        mTitleIbBack.setOnClickListener(this);
        mTitleIbChange.setOnClickListener(this);
        mLlFlashLight.setOnClickListener(this);

        mCameraView.setOnCameraSizeListener(new CommonCameraView.CameraSizeListener() {
            @Override
            public void setCameraSize(int[] size) {
                if (size != null) {
                    preWidth = size[0];
                    preHeight = size[1];
                    setIsVerticalRecog(true);
                    mCameraView.setOnPreviewFrameListener(VinScanActivity.this);
                    //拿到适配的相机预览比例
                    double previewScale = preHeight / (double) preWidth;
                    //拿到真实的屏幕比例
                    double screenScale = screenWidth / (double) screenHeight;
                    //预览的和实际显示的差距较大
                    if (Math.abs(previewScale - screenScale) > 0) {
                        //说明屏幕长，适配的预览比例大（比如三星S系列）
                        if (previewScale > screenScale) {
                            ViewGroup.LayoutParams layoutParams = mRootLayout.getLayoutParams();
                            int height = (int) (screenWidth / previewScale);
                            layoutParams.height = height;
                            mRootLayout.setLayoutParams(layoutParams);
                            screenHeight = height;
                        }
                    }
                } else {
                    Toast.makeText(VinScanActivity.this, "请开启相机权限", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    /**
     * 监听
     *
     * @param view
     */
    public void onClick(View view) {
        int mId = view.getId();
        if (mId == R.id.title_ib_left) {
            finish();
        } else if (mId == R.id.title_ib_right) {//切换横竖屏，识别模式
            if (isVertical) {
                //已为竖向，变横向
                initHorizontalView();
                setIsVerticalRecog(false);
                isVertical = false;
            } else {
                //已为横向，变竖向
                initVerticalView();
                setIsVerticalRecog(true);
                isVertical = true;
            }

        } else if (mId == R.id.aevs_ll_flashlight) {//手电筒
            isOpenFlash = !isOpenFlash;
            boolean isSupport = mCameraView.alterFlash(isOpenFlash ? 3 : 2);
            if (isSupport) {
                mIvFlashLight.setBackgroundResource(isOpenFlash ? R.mipmap.vin_flash_light_on : R.mipmap.vin_flash_light);
            } else {
                ToastUtil.show(this, "当前设备不支持闪光灯");
            }

        }
    }

    /**
     * 检线初始化
     */
    private ThreadPoolExecutor recogTPE = new ThreadPoolExecutor(1, 1, 1,
            TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
    private int buffl = 30;
    private char recogval[] = new char[buffl];
    private int pLineWarp[] = new int[32000];

    @Override
    public void setPreviewFrame(final byte[] data) {
        if (isRecogVin) {
            isRecogVin = false;
            recogTPE.execute(new Runnable() {
                                 @Override
                                 public void run() {
                                     synchronized (this) {
                                         processFrame(data);
                                     }
                                 }
                             }
            );
        }
    }

    /**
     * 获取视频流数据
     */
    private void processFrame(byte[] frameData) {
        // 判断光强度设置曝光
        int exposure = detectStateUtil.detectExposureLight(frameData, preWidth, preHeight);
        // 根据亮度设置曝光级别
        if (exposure == 1 || exposure == 0 || exposure == -1) {
            mCameraView.setExposureCompensationLevel(exposure);
        }
        // 识别
        int recogCode = vinApi.VinRecognizeNV21Android(frameData, preWidth, preHeight, recogval, buffl, pLineWarp, orientation);
        Log.e("recogCode", recogCode + "");
        if (recogCode == 0) {
            isRecogVin = false;
            Vibrator mVibrator = (Vibrator) getSystemService(Service.VIBRATOR_SERVICE);
            mVibrator.vibrate(100);
            final String recogResult = vinApi.VinGetResult();
            Log.e("recogResult", recogResult);
            String vinThumbPath = "";
            String vinAreaPath = "";

            File file = new File(VinConfig.saveImgPath);
            if (VinConfig.isSaveThume && file.exists() && file.isDirectory()) {
                //生成灰度的小缩略图（只有VIN码）
                Bitmap bitmapThumb = Bitmap.createBitmap(pLineWarp, 400, 80, Bitmap.Config.RGB_565);
                vinThumbPath = new StreamUtil().saveBitmapFile(bitmapThumb, VinConfig.saveImgPath, "VIN");
                bitmapThumb.recycle();
            }
            if (VinConfig.isSaveArea && file.exists() && file.isDirectory()) {
                int[] argb8888 = new NV21ToARGBUtil().convertYUV420_NV21toARGB8888(frameData, preWidth, preHeight);
                Bitmap bitmap = Bitmap.createBitmap(argb8888, preWidth, preHeight, Bitmap.Config.RGB_565);
                if (orientation == 0) {
                    Bitmap bitmapRegion = Bitmap.createBitmap(bitmap, borders[0], borders[1], borders[2] - borders[0], borders[3] - borders[1]);
                    bitmap.recycle();
                    vinAreaPath = new StreamUtil().saveBitmapFile(bitmapRegion, VinConfig.saveImgPath, "VIN_Y");
                } else {
                    Bitmap bitmapRegion = Bitmap.createBitmap(bitmap, borders[1], borders[0], borders[3] - borders[1], borders[2] - borders[0]);
                    bitmap.recycle();
                    vinAreaPath = new StreamUtil().saveBitmapFile2(bitmapRegion, VinConfig.saveImgPath, "VIN_Y");
                }
            }
            Intent intent = new Intent();
            intent.putExtra("vinResult", recogResult);
            intent.putExtra("recogCode", recogCode);
            if (VinConfig.isSaveThume)
                intent.putExtra("vinThumbPath", vinThumbPath);
            if (VinConfig.isSaveArea)
                intent.putExtra("vinAreaPath", vinAreaPath);
            setResult(RESULT_OK, intent);
            finish();
        } else {
            isRecogVin = true;
        }
    }

    /**
     * 设置识别区域
     */
    public void setIsVerticalRecog(boolean isVerticalRecog) {
        int t, b, l, r;
        if (isVerticalRecog) {
            orientation = 1;
            //设置竖向识别区域
            t = (int) (preWidth * VinConfig.TOP_V_SCALE);
            b = (int) (preWidth * VinConfig.BUTTOM_V_SCALE);
            l = 0;
            r = preHeight;
            borders = new int[]{l, t, r, b};
            vinApi.VinSetROI(borders, preWidth, preHeight);
        } else {
            orientation = 0;
            //设置横向识别区域
            l = (int) (preWidth * VinConfig.LEFT_H_SCALE);
            r = (int) (preWidth * VinConfig.RIGHT_H_SCALE);
            t = (int) (preHeight * VinConfig.TOP_H_SCALE);
            b = preHeight - t;
            borders = new int[]{l, t, r, b};
            vinApi.VinSetROI(borders, preWidth, preHeight);
        }
    }

    /**
     * 初始化横向布局
     */
    private void initHorizontalView() {
        RelativeLayout.LayoutParams lpll = (RelativeLayout.LayoutParams) mLlFlashLight.getLayoutParams();
        lpll.topMargin = (int) (screenHeight * 0.83);
        mLlFlashLight.setLayoutParams(lpll);

        RelativeLayout.LayoutParams lpTv = (RelativeLayout.LayoutParams) mTvCue.getLayoutParams();
        lpTv.topMargin = (int) (screenHeight * 0.435);
        mTvCue.setLayoutParams(lpTv);
        mTvCue.setRotation(90);
        RelativeLayout.LayoutParams lphScan = (RelativeLayout.LayoutParams) mIvhScanLine.getLayoutParams();
        lphScan.topMargin = (int) (screenHeight * 0.45);
        mIvhScanLine.setLayoutParams(lphScan);

        if (verticalAnimation != null) {//如果已开启垂直动画，则，关闭，隐藏控件
            verticalAnimation.cancel();
            mIvvScanLine.clearAnimation();
            mIvvScanLine.invalidate();
            mIvvScanLine.setVisibility(View.GONE);
        }

        // y轴移动距离
        horizontalAnimation = new TranslateAnimation( // y轴移动距离
                Animation.RELATIVE_TO_PARENT, -0.125f, Animation.RELATIVE_TO_PARENT, 0.125f,
                Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0);
        horizontalAnimation.setDuration(950); // 动画持续时间
        horizontalAnimation.setRepeatMode(Animation.REVERSE);//反转位移
        horizontalAnimation.setRepeatCount(Animation.INFINITE); // 无限循环
        //播放动画
        mIvhScanLine.startAnimation(horizontalAnimation);
        mIvhScanLine.setVisibility(View.VISIBLE);//显示动画

        mRectview.setIsVertical(false);

    }

    /**
     * 初始化竖向布局
     */
    private void initVerticalView() {
        RelativeLayout.LayoutParams lpll = (RelativeLayout.LayoutParams) mLlFlashLight.getLayoutParams();
        lpll.topMargin = (int) (screenHeight * 0.52);
        mLlFlashLight.setLayoutParams(lpll);

        RelativeLayout.LayoutParams lpTv = (RelativeLayout.LayoutParams) mTvCue.getLayoutParams();
        lpTv.topMargin = (int) (screenHeight * 0.41);
        mTvCue.setLayoutParams(lpTv);
        mTvCue.setRotation(0);
        mRectview.setIsVertical(true);
        RelativeLayout.LayoutParams lpScan = (RelativeLayout.LayoutParams) mIvvScanLine.getLayoutParams();
        lpScan.topMargin = (int) (screenHeight * 0.417);
        mIvvScanLine.setLayoutParams(lpScan);

        if (horizontalAnimation != null) {//如果已开启垂直动画，则，关闭，隐藏控件
            horizontalAnimation.cancel();
            mIvhScanLine.clearAnimation();
            mIvhScanLine.invalidate();
            mIvhScanLine.setVisibility(View.GONE);
        }
        // y轴移动距离
        verticalAnimation = new TranslateAnimation( // y轴移动距离
                Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0f,
                Animation.RELATIVE_TO_PARENT, -0.07f, Animation.RELATIVE_TO_PARENT, 0.07f);
        verticalAnimation.setDuration(1000); // 动画持续时间
        verticalAnimation.setRepeatMode(Animation.REVERSE);//反转位移
        verticalAnimation.setRepeatCount(Animation.INFINITE); // 无限循环
        //播放动画
        mIvvScanLine.startAnimation(verticalAnimation);
        mIvvScanLine.setVisibility(View.VISIBLE);//显示动画

    }
    public static File uriToFile(Uri uri,Context context) {
        String path = null;
        if ("file".equals(uri.getScheme())) {
            path = uri.getEncodedPath();
            if (path != null) {
                path = Uri.decode(path);
                ContentResolver cr = context.getContentResolver();
                StringBuffer buff = new StringBuffer();
                buff.append("(").append(MediaStore.Images.ImageColumns.DATA).append("=").append("'" + path + "'").append(")");
                Cursor cur = cr.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[] { MediaStore.Images.ImageColumns._ID, MediaStore.Images.ImageColumns.DATA }, buff.toString(), null, null);
                int index = 0;
                int dataIdx = 0;
                for (cur.moveToFirst(); !cur.isAfterLast(); cur.moveToNext()) {
                    index = cur.getColumnIndex(MediaStore.Images.ImageColumns._ID);
                    index = cur.getInt(index);
                    dataIdx = cur.getColumnIndex(MediaStore.Images.ImageColumns.DATA);
                    path = cur.getString(dataIdx);
                }
                cur.close();
                if (index == 0) {
                } else {
                    Uri u = Uri.parse("content://media/external/images/media/" + index);
                    System.out.println("temp uri is :" + u);
                }
            }
            if (path != null) {
                return new File(path);
            }
        } else if ("content".equals(uri.getScheme())) {
            // 4.2.2以后
            String[] proj = { MediaStore.Images.Media.DATA };
            Cursor cursor = context.getContentResolver().query(uri, proj, null, null, null);
            if (cursor.moveToFirst()) {
                int columnIndex = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
                path = cursor.getString(columnIndex);
            }
            cursor.close();

            return new File(path);
        } else {
            //Log.i(TAG, "Uri Scheme:" + uri.getScheme());
        }
        return null;
    }

}
