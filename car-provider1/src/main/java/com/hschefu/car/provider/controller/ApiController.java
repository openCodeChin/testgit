package com.hschefu.car.provider.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataPager;
import com.hschefu.common.component.SecurityAuthority;


/*
 * 
 * 给手机端体供 Api接口
 */
@RestController
@RequestMapping("/api")
public class ApiController {
	
 
	@SecurityAuthority()
	@RequestMapping(value = "/getCarByCarId/{carId}")
	public DataContext<DataItem> queryBrandList(@PathVariable("carId") Long carid, HttpServletRequest request) {
		DataContext<DataItem> dataContext = new DataContext<DataItem>();
		dataContext.setText("陈国成测式");
		System.out.println("#############"+carid);
		return dataContext;
	}
}
