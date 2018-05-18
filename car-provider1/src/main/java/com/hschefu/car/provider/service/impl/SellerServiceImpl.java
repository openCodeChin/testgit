package com.hschefu.car.provider.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hschefu.car.provider.repository.mapper.SellerTraceMapper;
import com.hschefu.car.provider.repository.mapper.SellerTraceRemarkMapper;
import com.hschefu.car.provider.service.SellerService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;

@Service
public class SellerServiceImpl implements SellerService {

	
	@Autowired
	private SellerTraceMapper sellerMapper;
	
	@Autowired
	private SellerTraceRemarkMapper sellerTraceRemarkMapper;

	@Override
	public DataContext<DataPager> getSellerByPager(DataItem dataItem) {
		DataContext<DataPager> result = new DataContext<DataPager>();
		DataPager dataPager = new DataPager();
		DataList dl=new DataList();
		int pageIndex=(Integer)dataItem.get("pageIndex");
		int pageSize=(Integer)dataItem.get("pageSize");
		dataItem.put("offset",dataPager.getOffset(pageIndex, pageSize) );
		long total=sellerMapper.getSellerByPagerCount(dataItem);
		dataPager.setPageCount(dataPager.getPageCount(total, pageSize));
		dataPager.setTotal(total);

		dl=sellerMapper.getSellerByPager(dataItem);
		dataPager.setDataList(dl);
		result.setData(dataPager);
		return result;
		
	}

	@Override
	public DataContext<Integer> addBuyer(DataItem dataItem) {
		DataContext<Integer> result = new DataContext<Integer>();
		int count=sellerMapper.insertSelective(dataItem);
		result.setData(count);
		return result;
	}

	@Override
	public DataContext<Integer> addremark(DataItem dataItem) {
		// TODO Auto-generated method stub
		DataContext<Integer> result = new DataContext<Integer>();
		int count=sellerTraceRemarkMapper.insertSelective(dataItem);
		result.setData(count);
		return result;
	}
	
}
