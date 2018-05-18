package com.hschefu.car.provider.service;


import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;

import java.util.Map;


public interface DictService {

    DataContext<DataItem> getDictById(long dictId);

    //DataContext<DataItem> getCarByMobile(String mobile);

    DataContext<DataPager> getDictByPager(DataItem dataItem);

    int findSellerDictCount(Map<String, Object> parameters);

    DataContext<DataPager> insertDict(DataItem parameters);

    DataContext<DataPager> updateDict(DataItem parameters);

    DataContext<DataPager> delDictById(long dictId);
}
