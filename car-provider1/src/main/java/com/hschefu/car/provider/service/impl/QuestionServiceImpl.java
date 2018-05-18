package com.hschefu.car.provider.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.hschefu.car.provider.repository.mapper.QuestionMapper;
import com.hschefu.car.provider.service.QuestionService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class QuestionServiceImpl implements  QuestionService{
@Autowired
public QuestionMapper questionMapper;
	
	public DataContext<DataItem> getQuestionById(long questionId) {
		DataContext<DataItem> result = new DataContext<DataItem>();
		result.setData(questionMapper.getQuestionById(questionId));
		return result;
	}

	@Override
	public DataContext<DataPager> getQuestionByPager(DataItem  dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		DataPager dataPager = new DataPager();
		DataList dl=new DataList();
		int pageIndex=(Integer)dataItem.get("pageIndex");
		int pageSize=(Integer)dataItem.get("pageSize");
		dataItem.put("offset",dataPager.getOffset(pageIndex, pageSize) );

		dl=questionMapper.getQuestionByPager(dataItem);
		dataPager.setDataList(dl);
		long total=questionMapper.getQuestionByPagerCount(dataItem);
		dataPager.setTotal(total);
		dataPager.setPageCount(dataPager.getPageCount(total, pageSize));
		result.setData(dataPager);
		return result;
	}
	
	
	public DataList getBrandByBrandCnName(DataItem  dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		DataPager dataPager = new DataPager();
		DataList dl=new DataList();
		
		dl=questionMapper.getQuestionByPager(dataItem);
		
		return dl;
	}
	public int findSellerQuestionCount (Map<String, Object> parameters){
		
		return questionMapper.findSellerQuestionCount(parameters);
	}

	
	@Override
	/*
	 * 删除车系信息
	 * @see com.hschefu.car.provider.service.BrandService#deleteByPrimaryKey(java.lang.Long)
	 */	
	public DataContext<DataPager> delQuestionByIds(DataItem dataItem) {
		// TODO Auto-generated method stub
		String questionIds=(String) dataItem.get("questionIds");

		System.out.println(questionIds+"================");
		JSONArray json = JSONArray.parseArray(questionIds); // 首先把字符串转成 JSONArray  对象

		List<String> questionIdsList =new ArrayList<String>();
		for (int i=0;i<json.size();i++){
			questionIdsList.add(json.get(i).toString());
		}
		dataItem.put("questionIdsList",questionIdsList);
		int isNotDel=questionMapper.delQuestionById(dataItem);
		if(isNotDel>0) {
			DataContext<DataPager> dataContext=new DataContext<DataPager>();
			return dataContext;
		}
		return null;
	}
	@Override
	public DataContext<DataPager> insertQuestion(DataItem dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		int count=questionMapper.insertSelective(dataItem);
		DataList dataList=new  DataList();
		dataList.add(dataItem);
		DataPager dataPager=new DataPager();
		dataPager.setDataList(dataList);
	
		if(count>0) {
			//查询
			result.setData(dataPager);
		}else {
			
		}
		return result;
	}
	public DataContext<DataPager> updateQuestion(DataItem dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		int count=questionMapper.updateByPrimaryKeySelective(dataItem);
		DataList dataList=new  DataList();
		dataList.add(dataItem);
		DataPager dataPager=new DataPager();
		dataPager.setDataList(dataList);
	
		if(count>0) {
			//查询
			result.setData(dataPager);
		}else {
			
		}
		return result;
	}
	
	
	
}
