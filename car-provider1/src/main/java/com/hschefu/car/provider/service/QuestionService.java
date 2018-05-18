package com.hschefu.car.provider.service;


import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;

import java.util.Map;


public interface QuestionService {

	    DataContext<DataItem> getQuestionById(long questionlId);

		//DataContext<DataItem> getCarByMobile(String mobile);

		DataContext<DataPager> getQuestionByPager(DataItem dataItem);
		
		DataList getBrandByBrandCnName(DataItem dataItem);
		int findSellerQuestionCount(Map<String, Object> parameters);
		
		DataContext<DataPager> insertQuestion(DataItem dataItem);
		DataContext<DataPager> updateQuestion(DataItem dataItem);
		
		DataContext<DataPager> delQuestionByIds(DataItem dataItem) ;
}
