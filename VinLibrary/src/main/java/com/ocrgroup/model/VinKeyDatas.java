package com.ocrgroup.model;

/**
 * Author: gechen
 * Date:  2020/08/28 0028
 * Time:  下午 06:10
 */
public class VinKeyDatas {


	/**
	 * 常用参数
	 */
	public static String OCR_ERROR = "ocrError";
	public static String OCR_CODE = "ocrCode";

	/**
	 * 传递Intent参数
	 */
	public static String RECOG_RESULT_JSON = "resultJson";
	public static String RECOG_RESULT_HASHMAP = "resultHash";
	public static String RECOG_RESULT_LIST = "resultlist";
	public static String RECOG_CODE = "recogCode";
	public static String RECOG_TYPE = "recogType";
	public static String IMAGE_PATH = "imagePath";
	public static String HEAD_PATH = "headPath";
	public static String CROP_PATH = "cropPath";
	public static String TITLE = "title";

	/**
	 * 身份证正面
	 */
	public static String[] FRONT_NAME = {"姓名", "性别", "民族", "出生日期", "住址", "身份证号", "是否反光", "是否原件"};
	public static String[] FRONT_KEY = {"name", "sex", "nation", "birth", "address", "idnum", "checkLight", "checkCopy"};

	/**
	 * 身份证背面
	 */
	public static String[] SIDE_NAME = {"签发机关", "有效期限", "是否反光", "是否原件"};
	public static String[] SIDE_KEY = {"sign", "valid", "checkLight", "checkCopy"};

	/**
	 * 环境监测
	 */
	public static String[] CHECK_KEY = {"checkLight", "checkCopy"};
	public static String[] CHECK_NAME = {"是否反光", "是否原件"};

}
