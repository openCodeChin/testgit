package com.hschefu.car.provider.repository.mapper;

import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;

public interface SellerTraceMapper {

	DataList getSellerByPager(DataItem dataItem);

	long getSellerByPagerCount(DataItem dataItem);

	int insertSelective(DataItem dataItem);


	
}