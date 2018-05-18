package com.hschefu.car.provider.service;


import java.util.Map;

import com.hschefu.car.provider.repository.entity.Car;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;


public interface CarSystemService {

	    DataContext<DataItem> getCarSystemById(long carSystemId);

		//DataContext<DataItem> getCarByMobile(String mobile);

		DataContext<DataPager> getCarSystemByPager(DataItem  dataItem);
		
		DataList getBrandByBrandCnName (DataItem  dataItem);
		int findSellerCarSystemCount (Map<String, Object> parameters);
		
		DataContext<DataPager> insertCarSystem(DataItem parameters);
		DataContext<DataPager> updateCarSystem(DataItem parameters);
		
		DataContext<DataPager> delCarSystemById(long carSystemId) ;
}
