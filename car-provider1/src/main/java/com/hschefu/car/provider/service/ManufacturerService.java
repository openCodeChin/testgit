package com.hschefu.car.provider.service;


import java.util.Map;

import com.hschefu.car.provider.repository.entity.Car;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataPager;


public interface ManufacturerService {

	    DataContext<DataItem> getManufacturerById(long manufacturerId);

		//DataContext<DataItem> getCarByMobile(String mobile);

		DataContext<DataPager> getManufacturerByPager(DataItem  dataItem);
		int findSellerManufacturerCount (Map<String, Object> parameters);
		
		DataContext<DataPager> insertManufacturer(DataItem parameters);
		DataContext<DataPager> updateManufacturer(DataItem parameters);
		
		DataContext<DataPager> delManufacturerById(long manufacturerId) ;
}
