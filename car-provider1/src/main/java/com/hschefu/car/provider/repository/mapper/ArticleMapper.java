package com.hschefu.car.provider.repository.mapper;

import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import org.apache.ibatis.annotations.Param;

import java.awt.*;
import java.util.List;
import java.util.Map;

public interface ArticleMapper {
	DataItem getArticleById(@Param("articleId") long articleId);

	/**
	 * 
	 * @return
	 */
	DataList getArticleByPager(DataItem dataItem);
	/**
	 * 查询总页数
	 * @param dataItem
	 * @return
	 */
	long getArticleByPagerCount(DataItem dataItem);
	
	/**
	 * 
	 * @return
	 */
	int insertArticle(DataItem dataItem);
	
	int findSellerArticleCount(Map<String, Object> parameters);
	
	int insertSelective(DataItem dataItem);
	int updateByPrimaryKeySelective(DataItem dataItem);
	int delArticleByIds(DataItem articleIdsList);
}