package com.hschefu.car.provider.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hschefu.car.provider.config.CacheDictManager;

/**
 * 功能描述: <br>
 * 〈初始化数据字典〉
 *
 * @param null
 * @return:
 * @Author:liuweiyi
 * @Date: 2018/5/16 14:49
 */
@Component
public class DataStartupRunner implements CommandLineRunner {

    @Autowired
    private CacheDictManager cacheDictManager;

    @SuppressWarnings("unchecked")
    @Override
    public void run(String... args) throws Exception {
       // cacheDictManager.init();
    }

}
