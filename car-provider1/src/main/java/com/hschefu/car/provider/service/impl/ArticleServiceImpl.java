package com.hschefu.car.provider.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.hschefu.car.provider.repository.mapper.ArticleMapper;
import com.hschefu.car.provider.service.ArticleService;
import com.hschefu.common.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImpl implements  ArticleService{
@Autowired
public ArticleMapper articleMapper;
	
	public DataContext<DataItem> getArticleById(long articleId) {
		DataContext<DataItem> result = new DataContext<DataItem>();
		result.setData(articleMapper.getArticleById(articleId));
		return result;
	}

	@Override
	public DataContext<DataPager> getArticleByPager(DataItem  dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		DataPager dataPager = new DataPager();
		DataList dl=new DataList();
		int pageIndex=(Integer)dataItem.get("pageIndex");
		int pageSize=(Integer)dataItem.get("pageSize");
		dataItem.put("offset",dataPager.getOffset(pageIndex, pageSize) );

		dl=articleMapper.getArticleByPager(dataItem);
		dataPager.setDataList(dl);
		long total=articleMapper.getArticleByPagerCount(dataItem);
		dataPager.setTotal(total);
		dataPager.setPageCount(dataPager.getPageCount(total, pageSize));
		result.setData(dataPager);
		return result;
	}
	
	
	public DataList getBrandByBrandCnName(DataItem  dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		DataPager dataPager = new DataPager();
		DataList dl=new DataList();
		
		dl=articleMapper.getArticleByPager(dataItem);
		
		return dl;
	}
	public int findSellerArticleCount (Map<String, Object> parameters){
		
		return articleMapper.findSellerArticleCount(parameters);
	}

	
	@Override
	/*
	 * 删除信息
	 * @see com.hschefu.car.provider.service.BrandService#deleteByPrimaryKey(java.lang.Long)
	 */	
	public DataContext<DataPager> delArticleByIds(DataItem dataItem) {
		// TODO Auto-generated method stub
		String articleIds=(String) dataItem.get("articleIds");


		JSONArray json = JSONArray.parseArray(articleIds); // 首先把字符串转成 JSONArray  对象

		List<String> articleIdsList =new ArrayList<String>();
		for (int i=0;i<json.size();i++){
			articleIdsList.add(json.get(i).toString());
		}
		dataItem.put("articleIdsList",articleIdsList);
		int isNotDel=articleMapper.delArticleByIds(dataItem);
		if(isNotDel>0) {
			DataContext<DataPager> dataContext=new DataContext<DataPager>();
			return dataContext;
		}
		return null;
	}
	@Override
	public DataContext<DataPager> insertArticle(DataItem dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		int count=articleMapper.insertSelective(dataItem);
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
	public DataContext<DataPager> updateArticle(DataItem dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		int count=articleMapper.updateByPrimaryKeySelective(dataItem);
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
