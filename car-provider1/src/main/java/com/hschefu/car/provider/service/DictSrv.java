package com.hschefu.car.provider.service;

import java.util.LinkedHashMap;
import java.util.Map;

import com.hschefu.common.DataItem;

public interface DictSrv {


	DataItem getDictByType(long type);
	public LinkedHashMap<String, Object> getAll(long type) ;
	
}
