package com.hschefu.car.provider.repository.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;

public interface BrandMapper {
	  /**
		 * 
		 * @param userId
		 * @return
		 */
		DataItem getBrandById(@Param("brandId") long brandid);

		/**
		 * 
		 * @param mobile
		 * @return
		 */
		//DataItem getCarByMobile(@Param("mobile") String mobile);

		/**
		 * 
		 * @param parameters
		 * @return
		 */
		DataList getBrandByPager(DataItem  dataItem);
		/**
		 * 查询总页数
		 * @param dataItem
		 * @return
		 */
		long getBrandByPagerCount(DataItem  dataItem);
		
		/**
		 * 
		 * @param parameters
		 * @return
		 */
		int insertBrand(DataItem dataItem);
		
		int findSellerBrandCount(Map<String, Object> parameters);
		
		int insertSelective(DataItem dataItem);
		int delBrandById(DataItem dataItem);
		
}