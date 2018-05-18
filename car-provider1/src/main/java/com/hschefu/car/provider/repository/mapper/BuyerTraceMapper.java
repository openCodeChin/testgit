package com.hschefu.car.provider.repository.mapper;

import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;

public interface BuyerTraceMapper {
	
    int deleteByPrimaryKey(Long buyertraceid);

    int insertSelective(DataItem dataItem);

	DataList getBuyerByPager(DataItem dataItem);

	long getBuyerByPagerCount(DataItem dataItem);

	
}