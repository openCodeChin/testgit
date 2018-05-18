package com.hschefu.car.provider.service;

import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataPager;

public interface BuyerService {

	//买车预约添加
	DataContext<Integer> addBuyer(DataItem dataItem);

	//买车预约列表
	DataContext<DataPager> getBuyerByPager(DataItem dataItem);

	//添加买车预约备注
	DataContext<Integer> addremark(DataItem dataItem);


	

}
