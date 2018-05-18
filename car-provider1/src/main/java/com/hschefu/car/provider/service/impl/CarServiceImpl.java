package com.hschefu.car.provider.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hschefu.car.provider.repository.mapper.CarMapper;
import com.hschefu.car.provider.service.CarService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;

@Service
public class CarServiceImpl implements  CarService{
	@Autowired
	public CarMapper carMapper;
	
	@Override
	public DataContext<Integer> insertCar(DataItem parameters) {
		// TODO Auto-generated method stub
		DataContext<Integer> result = new DataContext<Integer>();
		result.setData(carMapper.insertCar(parameters));
		return result;
	}

	@Override
	public DataContext<DataPager> getCarListByPager(DataItem  dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		DataPager dataPager = new DataPager();
		DataList dl=new DataList();
		int pageIndex=(Integer)dataItem.get("pageIndex");
		int pageSize=(Integer)dataItem.get("pageSize");
		dataItem.put("offset", dataPager.getOffset(pageIndex, pageSize));

		dl=carMapper.getCarListByPager(dataItem);
		dataPager.setDataList(dl);
		long total=carMapper.getCarListByPagerCount(dataItem);
		dataPager.setTotal(total);
		dataPager.setPageCount(dataPager.getPageCount(total, pageSize));
		result.setData(dataPager);
		return result;
	}

	@Override
	public DataItem getCarById(long carid) {
		DataItem result = new DataItem();
		result = carMapper.selectByKey(carid);
		return result;
	}
	
}
