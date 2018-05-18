package com.hschefu.car.provider.service;


import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;

import java.awt.*;
import java.util.Map;


public interface ArticleService {

	    DataContext<DataItem> getArticleById(long articlelId);

		//DataContext<DataItem> getCarByMobile(String mobile);

		DataContext<DataPager> getArticleByPager(DataItem dataItem);
		
		DataList getBrandByBrandCnName(DataItem dataItem);
		int findSellerArticleCount(Map<String, Object> parameters);
		
		DataContext<DataPager> insertArticle(DataItem dataItem);
		DataContext<DataPager> updateArticle(DataItem dataItem);
		
		DataContext<DataPager> delArticleByIds(DataItem dataItem) ;
}
