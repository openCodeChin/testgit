package com.hschefu.car.provider.service;

import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataPager;

public interface SellerService {

	DataContext<DataPager> getSellerByPager(DataItem dataItem);

	DataContext<Integer> addBuyer(DataItem dataItem);

	DataContext<Integer> addremark(DataItem dataItem);

}
