package com.hschefu.car.provider.config;
import com.hschefu.car.provider.util.DictData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hschefu.car.provider.service.DictSrv;

import java.util.LinkedHashMap;

/**
 * 功能描述: <br>
 * 〈数据字典缓存管理器〉
 *
 * @param null
 * @return:
 * @Author:liuweiyi
 * @Date: 2018/5/16 14:49
 */
@Component
public class CacheDictManager {

   private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DictSrv dictSrv;


    /**
     * 数据字典缓存初始化
     */
    public void init() {
        logger.info("------- > 初始化数据字典开始");
        setDicts();
        logger.info("------- > 初始化数据字典结束");
    }

   /**
     * 刷新数据字典缓存
     */
//    public void refresh() {
//        logger.info("------- > 重新加载数据字典开始");
//        setDicts();
//        logger.info("------- > 重新加载数据字典结束");
//    }

    /**
     * 设置数据库缓存
     */
    @SuppressWarnings("unchecked")
    private void setDicts() {
    	//国籍
    	LinkedHashMap<String, Object> brandNationality =  dictSrv.getAll(1);


//        HashMap<String, LinkedHashMap<String, Object>> carTypeMap = new HashMap<>(carType.size());
//        for (LinkedHashMap<String, Object> map : carType) {
//            carTypeMap.put(String.valueOf(map.get("type")), map);
//        }

        //加载字典数据到内存
        DictData.getInstance().brandNationality = (LinkedHashMap<String, Object>)brandNationality;
      

     
    }

}
