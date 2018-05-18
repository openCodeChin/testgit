package com.hschefu.car.provider.service.impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hschefu.car.provider.repository.mapper.DictMapper;
import com.hschefu.car.provider.service.DictSrv;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;

@Service("dictSrv")
public class DictSrvImpl implements DictSrv{

	@Autowired
	private DictMapper dictMapper;
//
//	@Override
//	public Map<String,Object> getAll() {
//		Map<String, Object> newmap = new HashMap<>();
//		List<Map<String, Object>> all = dictMapper.getAll();
//		for (Map<String, Object> map : all) {
//			newmap.put(((String)map.get("dict_name")), map.get("dict_content"));
//		}
//		return newmap;
//	}
//
	@Override
	public DataItem getDictByType(long type) {
		return dictMapper.getDictByType(type);
	}
	
	@Override
	public LinkedHashMap<String, Object> getAll(long type) {
		LinkedHashMap<String, Object> newmap = new LinkedHashMap<>();
		DataList all = dictMapper.getAll(type);
		for (Map<String, Object> map : all) {
			newmap.put(((String)map.get("dictkey")), map.get("dictvalue"));
		}
		return newmap;
	}
//
//	@Override
//	public List<DictCity> getAreaCityByName(String cityName) {
//		return dictMapper.getAreaCityByName(cityName);
//	}
//
//	@Override
//	public Pager findAll(Pager pager) {
//		pager.setResult(dictMapper.findAll(pager));
//		pager.setTotalCount(dictMapper.findAllCount(pager));
//		return pager;
//	}
//
//	@Override
//	public Dict findById(String id) {
//		return dictMapper.findById(id);
//	}
//
//	@Transactional
//	@Override
//	public Dict updateContent(String id, String content) {
//		String op = LoginUserUtil.getLoginUser().getUserId();
//		int count = dictMapper.updateContent(id, content, op);
//		if(count > 0){
//			Dict dict = dictMapper.findById(id);
//			return dict;
//		}
//		return null;
//	}
//	
}
