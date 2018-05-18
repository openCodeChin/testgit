package com.hschefu.car.provider.repository.mapper;

import org.apache.ibatis.annotations.Param;

import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;

public interface CarMapper {
	public int insertCar(DataItem dataItem);

	public int updateByKey(DataItem dataItem);

	public int deleteBykey(@Param("carId") long carId);

	public DataItem selectByKey(@Param("carid") long carid);
	
	public DataList getCarListByPager(DataItem dataItem);
	
	public long getCarListByPagerCount(DataItem  dataItem);
    
}