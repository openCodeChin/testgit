package com.hschefu.car.provider.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hschefu.car.provider.repository.mapper.ManufacturerMapper;
import com.hschefu.car.provider.service.ManufacturerService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;

@Service
public class ManufacturerServiceImpl implements  ManufacturerService{
@Autowired
public ManufacturerMapper manufacturerMapper;
	
	public DataContext<DataItem> getManufacturerById(long manufacturerId) {
		DataContext<DataItem> result = new DataContext<DataItem>();
		result.setData(manufacturerMapper.getManufacturerById(manufacturerId));
		return result;
	}

	@Override
	public DataContext<DataPager> getManufacturerByPager(DataItem  dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		DataPager dataPager = new DataPager();
		DataList dl=new DataList();
		int pageIndex=(Integer)dataItem.get("pageIndex");
		int pageSize=(Integer)dataItem.get("pageSize");
		dataItem.put("offset",dataPager.getOffset(pageIndex, pageSize) );

		dl=manufacturerMapper.getManufacturerByPager(dataItem);
		dataPager.setDataList(dl);
		long total=manufacturerMapper.getManufacturerByPagerCount(dataItem);
		dataPager.setTotal(total);
		dataPager.setPageCount(dataPager.getPageCount(total, pageSize));
		result.setData(dataPager);
		return result;
	}
	public int findSellerManufacturerCount (Map<String, Object> parameters){
		
		return manufacturerMapper.findSellerManufacturerCount(parameters);
	}

	
	@Override
	/*
	 * 删除品牌信息
	 * @see com.hschefu.car.provider.service.BrandService#deleteByPrimaryKey(java.lang.Long)
	 */	
	public DataContext<DataPager> delManufacturerById(long manufacturerid) {
		// TODO Auto-generated method stub
		
		int isNotDel=manufacturerMapper.delManufacturerById(manufacturerid);
		if(isNotDel>0) {
			DataContext<DataPager> dataContext=new DataContext<DataPager>();
			return dataContext;
		}
		return null;
	}
	@Override
	public DataContext<DataPager> insertManufacturer(DataItem dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		int count=manufacturerMapper.insertSelective(dataItem);
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
	public DataContext<DataPager> updateManufacturer(DataItem dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		int count=manufacturerMapper.updateByPrimaryKeySelective(dataItem);
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
