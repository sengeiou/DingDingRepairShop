package com.ocrgroup.utils;

import android.content.Context;

import com.ocrgroup.model.LicInfo;
import com.ocrgroup.vin.VINAPI;

/**
 * Author: gechen
 * Date:  2021/01/07 0007
 * Time:  下午 05:33
 */

public class VinOcrUtils {
	/**
	 * 获取授权/核心相关信息
	 */
	public static void getOcrInfo(Context context, VINAPI vinapi) {
		LicInfo licInfo = new LicInfo();
		// 获取核心版本号
		licInfo.ocrVersion = vinapi.VinGetVersionInfo();
		// 获取授权结束日期
		licInfo.endTime = vinapi.VinGetEndTime();
		// 获取授权文件-授权类型
		licInfo.licType = vinapi.VinGetLicType();
		// 获取授权文件-授权平台
		licInfo.platFrom = vinapi.VinGetPlatFrom();
		// 获取授权文件-产品数量
		licInfo.productCount = vinapi.VinGetLicProductCount();
		// 此产品授权版本
		licInfo.licVersion = vinapi.VinGetLicVersion();
		// 获取授权文件-产品id
		StringBuilder productStr = new StringBuilder();
		for (int i = 0; i < licInfo.productCount; i++) {
			productStr.append(vinapi.VinGetLicProduct(i)).append(",");
		}
		licInfo.productStr = productStr.toString();
		SDKMessageUtil.logSDKMassage(context, licInfo, VinConfig.nAultType, VinConfig.licenseId, VINAPI.getVinInstance().VERSION_CODE);
	}
}
