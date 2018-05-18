package com.hschefu.car.provider.service;


import java.util.Map;

import com.hschefu.car.provider.repository.entity.Car;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataPager;


public interface BrandService {

	    DataContext<DataItem> getBrandById(long brandId);

		//DataContext<DataItem> getCarByMobile(String mobile);

		DataContext<DataPager> getBrandByPager(DataItem  dataItem);
		int findSellerBrandCount (Map<String, Object> parameters);
		
		DataContext<DataPager> insertBrand(DataItem parameters);
		
		DataContext<DataPager> delBrandById(long brandId) ;
}
