package com.hschefu.car.provider.controller;

import com.hschefu.car.provider.util.DictData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * 描述:
 * 获取缓存信息（数据字典）
 *
 * @author liuweiyi
 * @create 2018-05-16 11:04
 */
@RestController

public class GetDictDataController {

    @RequestMapping("/getDict")
    @ResponseBody
    public DictData getDict() {
        return DictData.getInstance();
    }
}
