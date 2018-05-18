package com.hschefu.car.provider.service;


import java.util.Map;

import com.hschefu.car.provider.repository.entity.Car;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;


public interface CarModelService {

	    DataContext<DataItem> getCarModelById(long carModelId);

		//DataContext<DataItem> getCarByMobile(String mobile);

		DataContext<DataPager> getCarModelByPager(DataItem  dataItem);
		
		DataList getBrandByBrandCnName (DataItem  dataItem);
		int findSellerCarModelCount (Map<String, Object> parameters);
		
		DataContext<DataPager> insertCarModel(DataItem parameters);
		DataContext<DataPager> updateCarModel(DataItem parameters);
		
		DataContext<DataPager> delCarModelById(long carModelId) ;
}
