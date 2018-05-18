package com.hschefu.car.provider.repository.mapper;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;


@Mapper
public interface DictMapper {


	DataItem getDictByType(long type);
	
	DataList getAll(long type);
	DataItem getDictById(@Param("dictId") long dictId);

	/**
	 *
	 * @return
	 */
	DataList getDictByPager(DataItem  dataItem);
	/**
	 * 查询总页数
	 * @param dataItem
	 * @return
	 */
	long getDictByPagerCount(DataItem  dataItem);

	/**
	 *
	 * @return
	 */
	int insertDict(DataItem dataItem);

	int findSellerDictCount(Map<String, Object> parameters);

	int insertSelective(DataItem dataItem);
	int updateByPrimaryKeySelective(DataItem dataItem);
	int delDictById(long dictid);
}
