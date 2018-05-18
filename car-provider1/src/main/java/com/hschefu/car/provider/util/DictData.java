package com.hschefu.car.provider.util;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class DictData {

	private DictData() {
	}

	private static class DictDataHolder {
		private static final DictData INSTANCE = new DictData();
	}

	public static final DictData getInstance() {
		return DictDataHolder.INSTANCE;
	}

	/**
	 * 国籍
	 */
	public LinkedHashMap<String, Object> brandNationality = new LinkedHashMap<>();

}
