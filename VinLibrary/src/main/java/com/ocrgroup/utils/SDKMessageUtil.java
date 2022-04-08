package com.ocrgroup.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;

import com.ocrgroup.model.LicInfo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Author: gechen
 * Date:  2020/08/06 0006
 * Time:  下午 03:10
 */
public class SDKMessageUtil {

	private static String TAG = "(APP/DEVICE)-INFO";
	private static String HEAD_LOG = "|  ";
	private static String HEAD_TITLE_LOG = "|    ";

	/**
	 * 获取SDK信息
	 */
	public static String getSDKMassage(Context context, int nAultType, String nAultName, String ocrVersion) {
		String sdkMsg = "";
		// 硬件信息
		sdkMsg += "\n*设备信息*\n";
		sdkMsg += "android版本: " + Build.VERSION.RELEASE + "\n";
		sdkMsg += "android版本(code): " + Build.VERSION.SDK + "\n";
		sdkMsg += "手机厂商: " + Build.BRAND + "\n";
		sdkMsg += "手机型号: " + Build.MODEL + "\n";
		sdkMsg += "CPU: " + Build.HARDWARE + "\n";
		sdkMsg += "CPU: " + getCpuName() + "\n";
		sdkMsg += "CPU架构: " + Build.CPU_ABI + "\n";
		sdkMsg += "CPU架构2: " + Build.CPU_ABI2 + "\n";
		sdkMsg += "分辨率: " + getSizeNew(context) + "\n";
		// 打印app信息
		sdkMsg += "\n*APP信息*\n";
		sdkMsg += "APP包名: " + getPackageName(context) + "\n";
		sdkMsg += "APP名: " + getAppName(context) + "\n";
		// 授权信息
		sdkMsg += "\n*授权信息*\n";
		sdkMsg += "授权类型: " + nAultType + "\n";
		sdkMsg += "授权名称: " + nAultName + "\n";
		// 版本信息
		sdkMsg += "\n*版本信息*\n";
		sdkMsg += "核心版本: " + ocrVersion + "\n";
		return sdkMsg;
	}

	/**
	 * 打印SDK信息
	 */
	public static void logSDKMassage(Context context, LicInfo licInfo, int nAultType, String licenseId, String sdkVersion) {
		Log.w(TAG, "—————————————————————————————————————————————————————————————————————————————————————————————");
		Log.w(TAG, HEAD_TITLE_LOG + "设备信息");
		Log.w(TAG, "|—————————————————————————————————————————————————————————————————————————————————————————————");
		// 如果是绑定imei授权打印imei
		if (nAultType == 0x01)
			logDeviceId(context);
		// 打印硬件信息
		logSystemMsg(context);
		Log.w(TAG, "|—————————————————————————————————————————————————————————————————————————————————————————————");
		Log.w(TAG, HEAD_TITLE_LOG + "APP信息");
		Log.w(TAG, "|—————————————————————————————————————————————————————————————————————————————————————————————");
		// 打印app信息
		logAppInfo(context);
		Log.w(TAG, "|—————————————————————————————————————————————————————————————————————————————————————————————");
		Log.w(TAG, HEAD_TITLE_LOG + "授权信息");
		Log.w(TAG, "|—————————————————————————————————————————————————————————————————————————————————————————————");
		Log.w(TAG, HEAD_LOG + "SDK授权类型: " + nAultType);
		Log.w(TAG, HEAD_LOG + "SDK授权名称: " + licenseId);
		if (licInfo.platFrom == 1)
			Log.w(TAG, HEAD_LOG + "lic授权平台: " + "android");
		else if (licInfo.platFrom == 2)
			Log.w(TAG, HEAD_LOG + "lic授权平台: " + "ios");
		else
			Log.w(TAG, HEAD_LOG + "lic授权平台: " + "未知:" + licInfo.platFrom);
		Log.w(TAG, HEAD_LOG + "lic授权类型: " + licInfo.licType);
		Log.w(TAG, HEAD_LOG + "lic授权到期日期: " + licInfo.endTime);
		Log.w(TAG, HEAD_LOG + "lic授权包含产品id: " + licInfo.productStr);
		Log.w(TAG, "|—————————————————————————————————————————————————————————————————————————————————————————————");
		Log.w(TAG, HEAD_TITLE_LOG + "版本信息");
		Log.w(TAG, "|—————————————————————————————————————————————————————————————————————————————————————————————");
		Log.w(TAG, HEAD_LOG + "开发包版本: " + sdkVersion);
		Log.w(TAG, HEAD_LOG + "核心版本: " + licInfo.ocrVersion);
		Log.w(TAG, HEAD_LOG + "当前产品授权版本: " + licInfo.licVersion);
		Log.w(TAG, "———————————————————————————————————————————————————————————————————————————————————————————————");
	}

	/**
	 * 打印SDK信息
	 */
	public static void logSDKMassage(Context context, int nAultType, String nAultName, String SDK_VERSION) {
		Log.w(TAG, "—————————————————————————————————————————————————————————————————————————————————————————————");
		Log.w(TAG, HEAD_TITLE_LOG + "设备信息");
		Log.w(TAG, "|—————————————————————————————————————————————————————————————————————————————————————————————");
		// 如果是绑定imei授权打印imei
		if (nAultType == 0x01)
			logDeviceId(context);
		// 打印硬件信息
		logSystemMsg(context);
		Log.w(TAG, "|—————————————————————————————————————————————————————————————————————————————————————————————");
		Log.w(TAG, HEAD_TITLE_LOG + "APP信息");
		Log.w(TAG, "|—————————————————————————————————————————————————————————————————————————————————————————————");
		// 打印app信息
		logAppInfo(context);
		Log.w(TAG, "|—————————————————————————————————————————————————————————————————————————————————————————————");
		Log.w(TAG, HEAD_TITLE_LOG + "授权信息");
		Log.w(TAG, "|—————————————————————————————————————————————————————————————————————————————————————————————");
		Log.w(TAG, HEAD_LOG + "授权类型: " + nAultType);
		Log.w(TAG, HEAD_LOG + "授权名称: " + nAultName);
		Log.w(TAG, "|—————————————————————————————————————————————————————————————————————————————————————————————");
		Log.w(TAG, HEAD_TITLE_LOG + "版本信息");
		Log.w(TAG, "|—————————————————————————————————————————————————————————————————————————————————————————————");
		Log.w(TAG, HEAD_LOG + "开发包版本: " + SDK_VERSION);
		Log.w(TAG, "———————————————————————————————————————————————————————————————————————————————————————————————");
	}


	private static void logAppInfo(Context context) {
		//创建要返回的集合对象
		Log.w(TAG, HEAD_LOG + "APP包名: " + getPackageName(context));
		Log.w(TAG, HEAD_LOG + "APP名: " + getAppName(context));
	}

	/**
	 * 获取手机系统信息
	 */
	private static void logSystemMsg(Context context) {
		Log.w(TAG, HEAD_LOG + "android版本: " + Build.VERSION.RELEASE);
		Log.w(TAG, HEAD_LOG + "android版本(code): " + Build.VERSION.SDK);
		Log.w(TAG, HEAD_LOG + "手机厂商: " + Build.BRAND);
		Log.w(TAG, HEAD_LOG + "手机型号: " + Build.MODEL);
		Log.w(TAG, HEAD_LOG + "CPU: " + Build.HARDWARE);
		Log.w(TAG, HEAD_LOG + "CPU: " + getCpuName());
		Log.w(TAG, HEAD_LOG + "CPU架构: " + Build.CPU_ABI);
		Log.w(TAG, HEAD_LOG + "CPU架构2: " + Build.CPU_ABI2);
		Log.w(TAG, HEAD_LOG + "分辨率: " + getSizeNew(context));
	}

	/**
	 * 获取设备id
	 */
	@SuppressLint({"PrivateApi", "HardwareIds"})
	private static void logDeviceId(Context context) {
		String msg = "";
		String m_szAndroidID = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
		Log.w(TAG, HEAD_LOG + "androidId: " + m_szAndroidID);
		Class clazz = null;
		try {
			clazz = Class.forName("android.os.SystemProperties");
			Method MethodGet = clazz.getDeclaredMethod("get", String.class);
			String serialno = (String) MethodGet.invoke(null, "ro.serialno");
			Log.w(TAG, HEAD_LOG + "设备序列号: " + serialno);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
//		final TelephonyManager manager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
//		String deviceId = "null";
//		if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED) {
//			if (manager.getDeviceId() == null || manager.getDeviceId().equals("")) {
//				if (Build.VERSION.SDK_INT >= 23) {
//					deviceId = manager.getDeviceId(0);
//				}
//			} else {
//				deviceId = manager.getDeviceId();
//			}
//		}
//		Log.w(TAG, HEAD_LOG + "deviceId: " + deviceId);
//		String imei = "null";
//		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//			manager.getImei();
//			manager.getMeid();
//		}
//		Log.w(TAG, HEAD_LOG + "imei: " + imei);
	}

	/**
	 * 获取应用程序名称
	 */
	private static synchronized String getAppName(Context context) {
		try {
			PackageManager packageManager = context.getPackageManager();
			PackageInfo packageInfo = packageManager.getPackageInfo(
					context.getPackageName(), 0);
			int labelRes = packageInfo.applicationInfo.labelRes;
			return context.getResources().getString(labelRes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 获取包名信息
	 *
	 * @return 当前应用的版本名称
	 */
	private static synchronized String getPackageName(Context context) {
		try {
			PackageManager packageManager = context.getPackageManager();
			PackageInfo packageInfo = packageManager.getPackageInfo(
					context.getPackageName(), 0);
			return packageInfo.packageName;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	/**
	 * 获取CPU型号
	 */
	private static String getCpuName() {
		String str1 = "/proc/cpuinfo";
		String str2 = "";
		try {
			FileReader fr = new FileReader(str1);
			BufferedReader localBufferedReader = new BufferedReader(fr);
			while ((str2 = localBufferedReader.readLine()) != null) {
				if (str2.contains("Hardware")) {
					return str2.split(":")[1];
				}
			}
			localBufferedReader.close();
		} catch (IOException e) {
		}
		return null;
	}

	/**
	 * 获取屏幕分辨率
	 */
	private static String getSizeNew(Context ctx) {
		WindowManager wm = (WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
		DisplayMetrics dm = new DisplayMetrics();
		wm.getDefaultDisplay().getMetrics(dm);
		Point size = new Point();
		size.x = dm.widthPixels;
		size.y = dm.heightPixels;
		return size.x + "*" + size.y;
	}

}
