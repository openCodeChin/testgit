package com.hschefu.car.provider.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hschefu.car.provider.repository.mapper.CarSystemMapper;
import com.hschefu.car.provider.service.CarSystemService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;

@Service
public class CarSystemServiceImpl implements  CarSystemService{
@Autowired
public CarSystemMapper carSystemMapper;
	
	public DataContext<DataItem> getCarSystemById(long carSystemId) {
		DataContext<DataItem> result = new DataContext<DataItem>();
		result.setData(carSystemMapper.getCarSystemById(carSystemId));
		return result;
	}

	@Override
	public DataContext<DataPager> getCarSystemByPager(DataItem  dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		DataPager dataPager = new DataPager();
		DataList dl=new DataList();
		
		if(null!=dataItem.get("pageIndex")) {
			int pageIndex=(Integer)dataItem.get("pageIndex");
			int pageSize=(Integer)dataItem.get("pageSize");
			dataItem.put("offset",dataPager.getOffset(pageIndex, pageSize) );
			long total=carSystemMapper.getCarSystemByPagerCount(dataItem);
			dataPager.setPageCount(dataPager.getPageCount(total, pageSize));
			dataPager.setTotal(total);
		}
		

		dl=carSystemMapper.getCarSystemByPager(dataItem);
		dataPager.setDataList(dl);
		result.setData(dataPager);
		return result;
	}
	
	
	public DataList getBrandByBrandCnName(DataItem  dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		DataPager dataPager = new DataPager();
		DataList dl=new DataList();
		
		dl=carSystemMapper.getCarSystemByPager(dataItem);
		
		return dl;
	}
	public int findSellerCarSystemCount (Map<String, Object> parameters){
		
		return carSystemMapper.findSellerCarSystemCount(parameters);
	}

	
	@Override
	/*
	 * 删除车系信息
	 * @see com.hschefu.car.provider.service.BrandService#deleteByPrimaryKey(java.lang.Long)
	 */	
	public DataContext<DataPager> delCarSystemById(long carSystemid) {
		// TODO Auto-generated method stub
		
		int isNotDel=carSystemMapper.delCarSystemById(carSystemid);
		if(isNotDel>0) {
			DataContext<DataPager> dataContext=new DataContext<DataPager>();
			return dataContext;
		}
		return null;
	}
	@Override
	public DataContext<DataPager> insertCarSystem(DataItem dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		int count=carSystemMapper.insertSelective(dataItem);
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
	public DataContext<DataPager> updateCarSystem(DataItem dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		int count=carSystemMapper.updateByPrimaryKeySelective(dataItem);
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
