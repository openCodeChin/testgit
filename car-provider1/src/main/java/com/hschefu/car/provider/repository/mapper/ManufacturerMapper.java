package com.hschefu.car.provider.repository.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;

public interface ManufacturerMapper {

	DataItem getManufacturerById(@Param("manufacturerId") long manufacturerId);

	/**
	 * 
	 * @param parameters
	 * @return
	 */
	DataList getManufacturerByPager(DataItem  dataItem);
	/**
	 * 查询总页数
	 * @param dataItem
	 * @return
	 */
	long getManufacturerByPagerCount(DataItem  dataItem);
	
	/**
	 * 
	 * @param parameters
	 * @return
	 */
	int insertManufacturer(DataItem dataItem);
	
	int findSellerManufacturerCount(Map<String, Object> parameters);
	
	int insertSelective(DataItem dataItem);
	int updateByPrimaryKeySelective(DataItem dataItem);
	int delManufacturerById(long manufacturerid);
}