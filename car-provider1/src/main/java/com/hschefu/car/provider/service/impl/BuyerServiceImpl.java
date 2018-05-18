package com.hschefu.car.provider.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hschefu.car.provider.repository.mapper.BuyerTraceMapper;
import com.hschefu.car.provider.repository.mapper.BuyerTraceRemarkMapper;
import com.hschefu.car.provider.service.BuyerService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;

@Service
public class BuyerServiceImpl implements BuyerService {

	@Autowired
	private BuyerTraceMapper buyerMapper;
	
	@Autowired 
	private BuyerTraceRemarkMapper buyerTraceRemarkMapper;
	
	
	@Override
	public DataContext<Integer> addBuyer(DataItem dataItem) {
		// TODO Auto-generated method stub
		DataContext<Integer> result = new DataContext<Integer>();
		int count=buyerMapper.insertSelective(dataItem);
		result.setData(count);
		return result;
	}

	@Override
	public DataContext<DataPager> getBuyerByPager(DataItem dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		DataPager dataPager = new DataPager();
		DataList dl=new DataList();
		int pageIndex=(Integer)dataItem.get("pageIndex");
		int pageSize=(Integer)dataItem.get("pageSize");
		dataItem.put("offset",dataPager.getOffset(pageIndex, pageSize) );
		long total=buyerMapper.getBuyerByPagerCount(dataItem);
		dataPager.setPageCount(dataPager.getPageCount(total, pageSize));
		dataPager.setTotal(total);
		dl=buyerMapper.getBuyerByPager(dataItem);
		dataPager.setDataList(dl);
		result.setData(dataPager);
		return result;
	}

	
	
	@Override
	public DataContext<Integer> addremark(DataItem dataItem) {
		// TODO Auto-generated method stub
		DataContext<Integer> result = new DataContext<Integer>();
		int count=buyerTraceRemarkMapper.insertSelective(dataItem);
		result.setData(count);
		return result;
	}

}
