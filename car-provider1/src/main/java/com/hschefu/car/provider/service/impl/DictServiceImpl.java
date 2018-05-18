package com.hschefu.car.provider.service.impl;

import com.hschefu.car.provider.repository.mapper.DictMapper;
import com.hschefu.car.provider.service.DictService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DictServiceImpl implements  DictService{
@Autowired
public DictMapper dictMapper;
	
	public DataContext<DataItem> getDictById(long dictId) {
		DataContext<DataItem> result = new DataContext<DataItem>();
		result.setData(dictMapper.getDictById(dictId));
		return result;
	}

	@Override
	public DataContext<DataPager> getDictByPager(DataItem  dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		DataPager dataPager = new DataPager();
		DataList dl=new DataList();
		int pageIndex=(Integer)dataItem.get("pageIndex");
		int pageSize=(Integer)dataItem.get("pageSize");
		dataItem.put("offset",dataPager.getOffset(pageIndex, pageSize) );

		dl=dictMapper.getDictByPager(dataItem);
		dataPager.setDataList(dl);
		long total=dictMapper.getDictByPagerCount(dataItem);
		dataPager.setTotal(total);
		dataPager.setPageCount(dataPager.getPageCount(total, pageSize));
		result.setData(dataPager);
		return result;
	}
	

	public int findSellerDictCount (Map<String, Object> parameters){

		return dictMapper.findSellerDictCount(parameters);
	}

	
	@Override
	/*
	 * 删除车系信息
	 * @see com.hschefu.car.provider.service.BrandService#deleteByPrimaryKey(java.lang.Long)
	 */	
	public DataContext<DataPager> delDictById(long dictId) {
		// TODO Auto-generated method stub
		
		int isNotDel=dictMapper.delDictById(dictId);
		if(isNotDel>0) {
			DataContext<DataPager> dataContext=new DataContext<DataPager>();
			return dataContext;
		}
		return null;
	}
	@Override
	public DataContext<DataPager> insertDict(DataItem dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		int count=dictMapper.insertSelective(dataItem);
		DataList dataList=new  DataList();
		dataList.add(dataItem);
		DataPager dataPager=new DataPager();
		dataPager.setDataList(dataList);
	
		if(count>0) {
			//查询
			result.setData(dataPager);
		}else {
			
		}
		return result;
	}
	public DataContext<DataPager> updateDict(DataItem dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		int count=dictMapper.updateByPrimaryKeySelective(dataItem);
		DataList dataList=new  DataList();
		dataList.add(dataItem);
		DataPager dataPager=new DataPager();
		dataPager.setDataList(dataList);
	
		if(count>0) {
			//查询
			result.setData(dataPager);
		}else {
			
		}
		return result;
	}
	
	
	
}
