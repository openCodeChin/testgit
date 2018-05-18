package com.hschefu.car.provider.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hschefu.car.provider.repository.mapper.CarModelMapper;
import com.hschefu.car.provider.service.CarModelService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;

@Service
public class CarModelServiceImpl implements  CarModelService{
@Autowired
public CarModelMapper carModelMapper;
	
	public DataContext<DataItem> getCarModelById(long carModelId) {
		DataContext<DataItem> result = new DataContext<DataItem>();
		result.setData(carModelMapper.getCarModelById(carModelId));
		return result;
	}

	@Override
	public DataContext<DataPager> getCarModelByPager(DataItem  dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		DataPager dataPager = new DataPager();
		DataList dl=new DataList();
		int pageIndex=(Integer)dataItem.get("pageIndex");
		int pageSize=(Integer)dataItem.get("pageSize");
		dataItem.put("offset",dataPager.getOffset(pageIndex, pageSize) );

		dl=carModelMapper.getCarModelByPager(dataItem);
		dataPager.setDataList(dl);
		long total=carModelMapper.getCarModelByPagerCount(dataItem);
		dataPager.setTotal(total);
		dataPager.setPageCount(dataPager.getPageCount(total, pageSize));
		result.setData(dataPager);
		return result;
	}
	
	
	public DataList getBrandByBrandCnName(DataItem  dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		DataPager dataPager = new DataPager();
		DataList dl=new DataList();
		
		dl=carModelMapper.getCarModelByPager(dataItem);
		
		return dl;
	}
	public int findSellerCarModelCount (Map<String, Object> parameters){
		
		return carModelMapper.findSellerCarModelCount(parameters);
	}

	
	@Override
	/*
	 * 删除车系信息
	 * @see com.hschefu.car.provider.service.BrandService#deleteByPrimaryKey(java.lang.Long)
	 */	
	public DataContext<DataPager> delCarModelById(long carModelId) {
		// TODO Auto-generated method stub
		
		int isNotDel=carModelMapper.delCarModelById(carModelId);
		if(isNotDel>0) {
			DataContext<DataPager> dataContext=new DataContext<DataPager>();
			return dataContext;
		}
		return null;
	}
	@Override
	public DataContext<DataPager> insertCarModel(DataItem dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		int count=carModelMapper.insertSelective(dataItem);
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
	public DataContext<DataPager> updateCarModel(DataItem dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		int count=carModelMapper.updateByPrimaryKeySelective(dataItem);
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
