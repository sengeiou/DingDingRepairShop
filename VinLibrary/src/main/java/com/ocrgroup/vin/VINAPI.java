package com.ocrgroup.vin;

import android.content.Context;
import android.graphics.Bitmap;
import android.telephony.TelephonyManager;

import com.ocrgroup.utils.VinConfig;
import com.ocrgroup.utils.SDKMessageUtil;

import java.io.File;

/**
 * 注意：这个类是关联底层C++函数名
 * 只能在 com.ocrgroup.vin 包名下面，修改包名会导致异常闪退，原因无法加载该类
 */
public class VINAPI {
	static {
		System.loadLibrary("AndroidVinKernal");
	}

	/**
	 * 当前开发包版本号(请勿修改)
	 */
	public String VERSION_CODE = "20210603";

	//初始化核心，仅本类调用
	private native int VinKernalInit(String szSysPath, String FilePath, String CommpanyName, int nProductType, int nAultType, TelephonyManager telephonyManager, Context context);

	//释放识别核心，仅本类调用
	private native void VinKernalUnInit();

	//设置识别区域接口
	public native void VinSetROI(int[] borders, int imgWidth, int imgHeight);

	//nType:0默认模式，1只校验本身VIN码规则
	public native void VinSetRecogParam(int nType);

	//基于NV21视频流扫描识别接口
	public native int VinRecognizeNV21Android(byte[] ImageStreamNV21, int Width, int Height, char[] Buffer, int BufferLen, int[] pLine, int type);

	//导入图像识别接口
	public native int VinRecognizeImageFile(String filepath);

	//wrapLine参数与预览识别返回的数组一样，调用在导入识别之后
	public native int VinGetRecogImgData(int[] wrapLine);

	//导入图像识别，并选择图像的识别区域(无校验规则)
	public native int VinRecogFile(String imagePath, int left, int top, int right, int bottom);

	//导入图像识别，传bitmap方式
	public native int VinRecognizeBitmapImage(Bitmap bitmap);

	//获取识别结果接口
	public native String VinGetResult();

	/**
	 * 获取授权\版本信息
	 */

	// 获取核心版本号 V1.2.001.20210104---V1.产品id.核心版本.前端版本
	public native String VinGetVersionInfo();

	//获取授权截止时间
	public native String VinGetEndTime();

	// 获取授权文件授权类型
	public native int VinGetLicType();

	// 获取授权文件授权平台
	public native int VinGetPlatFrom();

	// 获取授权文件产品数量
	public native int VinGetLicProductCount();

	// 获取授权文件产品id
	public native int VinGetLicProduct(int nIndex);

	// 获取授权文件产品对应版本号
	public native String VinGetLicVersion();



	private int nRet = -10;  //返回-10，说明vinApi的对象为空，调用初始化核心方法之前，先调用getVinInstance()获取对象
	private static VINAPI vinApi = null;
	private static boolean isInitKernal = false;


	public static VINAPI getVinInstance() {
		synchronized (VINAPI.class) {
			if (vinApi == null) {
				vinApi = new VINAPI();
			}
		}
		return vinApi;
	}

	/**
	 * 外部调用初始化核心的方法
	 *
	 * @param context
	 * @return
	 */
	public int initVinKernal(Context context) {
		if (!isInitKernal && vinApi != null) {
			// 适配api-29
			VinConfig.saveImagePath(context);
			File userIdFile = new File(context.getCacheDir(), VinConfig.licenseId);
			if (!userIdFile.exists()) {
				return -9; //TODO 授权文件不存在
			}
			// TODO 显示调试信息
			SDKMessageUtil.logSDKMassage(context, VinConfig.nAultType, VinConfig.licenseId,
					VERSION_CODE);
			// 授权文件初始化
			String userIdPath = userIdFile.getAbsoluteFile().toString();
			TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
			String[] useNameArr = VinConfig.licenseId.split("\\.");
			String syspPath = context.getCacheDir().toString();
			//syspPath=syspPath .substring(0,syspPath.length()-1);
			nRet = vinApi.VinKernalInit(syspPath, userIdPath, useNameArr[0], 0x01,
					VinConfig.nAultType, telephonyManager, context);
			if (nRet == 0) isInitKernal = true;
		} else if (isInitKernal && vinApi != null) {
			return 0;
		}
		return nRet;
	}


	/**
	 * 获取初始化code
	 */
	public int getInitCode() {
		return nRet;
	}

	/**
	 * 外部调用释放识别核心的方法
	 */
	public void releaseKernal() {
		if (vinApi != null) {
			vinApi.VinKernalUnInit();
			vinApi = null;
			isInitKernal = false;
		}
	}
}
