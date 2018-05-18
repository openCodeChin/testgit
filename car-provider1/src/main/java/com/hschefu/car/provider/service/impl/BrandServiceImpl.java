package com.hschefu.car.provider.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hschefu.car.provider.repository.mapper.BrandMapper;
import com.hschefu.car.provider.service.BrandService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;
import com.hschefu.common.GetPinyin;

@Service
public class BrandServiceImpl implements  BrandService{
	@Autowired
	public BrandMapper brandMapper;

	public DataContext<DataItem> getBrandById(long brandId) {
		DataContext<DataItem> result = new DataContext<DataItem>();
		result.setData(brandMapper.getBrandById(brandId));
		return result;
	}

	@Override
	public DataContext<DataPager> getBrandByPager(DataItem  dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		DataPager dataPager = new DataPager();
		DataList dl=new DataList();
		if(null!=dataItem.get("pageIndex")) {
			int pageIndex=(Integer)dataItem.get("pageIndex");
			int pageSize=(Integer)dataItem.get("pageSize");
			dataItem.put("offset",dataPager.getOffset(pageIndex, pageSize) );
			long total=brandMapper.getBrandByPagerCount(dataItem);
			dataPager.setPageCount(dataPager.getPageCount(total, pageSize));
			dataPager.setTotal(total);
		}

		dl=brandMapper.getBrandByPager(dataItem);
		dataPager.setDataList(dl);
		result.setData(dataPager);
		return result;
	}
	public int findSellerBrandCount (Map<String, Object> parameters){

		return brandMapper.findSellerBrandCount(parameters);
	}


	@Override
	/*
	 * 删除品牌信息
	 * @see com.hschefu.car.provider.service.BrandService#deleteByPrimaryKey(java.lang.Long)
	 */
	public DataContext<DataPager> delBrandById(long brandid) {
		// TODO Auto-generated method stub
		DataItem dataItem=new DataItem();
		dataItem.put("brandId", brandid);
		dataItem.put("brandStatus", 1);
		dataItem.put("modifyTime", new Timestamp(new Date().getTime()));
		int isNotDel=brandMapper.delBrandById(dataItem);
		if(isNotDel>0) {
			DataContext<DataPager> dataContext=new DataContext<DataPager>();
			return dataContext;
		}
		return null;
	}
	@Override
	public DataContext<DataPager> insertBrand(DataItem dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		if(dataItem!=null) {
			dataItem.put("brandInitial", GetPinyin.getPingYin(dataItem.get("brandCnName").toString()));
		}

		int count=brandMapper.insertSelective(dataItem);
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
