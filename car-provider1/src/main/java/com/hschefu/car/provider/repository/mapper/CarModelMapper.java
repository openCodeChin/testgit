package com.hschefu.car.provider.repository.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;

public interface CarModelMapper {
	DataItem getCarModelById(@Param("carModelId") long carModelId);

	/**
	 * 
	 * @param parameters
	 * @return
	 */
	DataList getCarModelByPager(DataItem  dataItem);
	/**
	 * 查询总页数
	 * @param dataItem
	 * @return
	 */
	long getCarModelByPagerCount(DataItem  dataItem);
	
	/**
	 * 
	 * @param parameters
	 * @return
	 */
	int insertCarModel(DataItem dataItem);
	
	int findSellerCarModelCount(Map<String, Object> parameters);
	
	int insertSelective(DataItem dataItem);
	int updateByPrimaryKeySelective(DataItem dataItem);
	int delCarModelById(long carModelid);
}