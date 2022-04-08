package com.android.ctgapp.entity.home;

import java.io.Serializable;

/**
 * Author: gechen
 * Date:  2020/09/02 0002
 * Time:  上午 10:20
 */
public class ResultListInfo implements Serializable {

	private String key;
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
