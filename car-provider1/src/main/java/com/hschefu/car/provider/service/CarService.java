package com.hschefu.car.provider.service;


import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataPager;

public interface CarService {
		
		DataContext<Integer> insertCar(DataItem parameters);
		
		DataContext<DataPager> getCarListByPager(DataItem  dataItem);
		
		DataItem getCarById(long carid);
}
