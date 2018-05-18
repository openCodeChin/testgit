package com.hschefu.car.provider.repository.mapper;

import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface QuestionMapper {
	DataItem getQuestionById(@Param("questionId") long questionId);

	/**
	 * 
	 * @return
	 */
	DataList getQuestionByPager(DataItem dataItem);
	/**
	 * 查询总页数
	 * @param dataItem
	 * @return
	 */
	long getQuestionByPagerCount(DataItem dataItem);
	
	/**
	 * 
	 * @return
	 */
	int insertQuestion(DataItem dataItem);
	
	int findSellerQuestionCount(Map<String, Object> parameters);
	
	int insertSelective(DataItem dataItem);
	int updateByPrimaryKeySelective(DataItem dataItem);
	int delQuestionById(DataItem dataItem);
}