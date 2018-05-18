package com.hschefu.car.provider.repository.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;

public interface CarSystemMapper {
	DataItem getCarSystemById(@Param("carSystemId") long carSystemId);

	/**
	 * 
	 * @param parameters
	 * @return
	 */
	DataList getCarSystemByPager(DataItem  dataItem);
	/**
	 * 查询总页数
	 * @param dataItem
	 * @return
	 */
	long getCarSystemByPagerCount(DataItem  dataItem);
	
	/**
	 * 
	 * @param parameters
	 * @return
	 */
	int insertCarSystem(DataItem dataItem);
	
	int findSellerCarSystemCount(Map<String, Object> parameters);
	
	int insertSelective(DataItem dataItem);
	int updateByPrimaryKeySelective(DataItem dataItem);
	int delCarSystemById(long carSystemid);
}