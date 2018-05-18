package com.hschefu.car.provider.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hschefu.car.provider.service.CarService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataPager;

@RestController()
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarService carService;

	@RequestMapping(value = "/add")
	public DataContext<Integer> saveCar(@RequestBody DataItem obj, HttpServletRequest request) {
		//obj.put("createtime", new Date());
		return carService.insertCar(obj);
	}
	
	@RequestMapping(value = "/queryCarList")
	public DataContext<DataPager> queryCarList(@RequestBody DataItem dataItem, HttpServletRequest request) {
		DataContext<DataPager> datacontext = carService.getCarListByPager(dataItem);
		return datacontext;
	}
	
	@RequestMapping(value = "/getCarDetail")
	public DataItem getCarById(@RequestParam long carid, HttpServletRequest request) {
		DataItem datacontext = carService.getCarById(carid);
		return datacontext;
	}
}
