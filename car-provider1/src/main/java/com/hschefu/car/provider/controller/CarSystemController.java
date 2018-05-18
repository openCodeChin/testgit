package com.hschefu.car.provider.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hschefu.car.provider.service.CarSystemService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;

/**
 * 
* @ClassName: CarSystemController 
* @Description: TODO(车系信息) 
* @author liuweiyi 
* @date 2018年5月11日 下午2:52:02 
*
 */
@RestController
@RequestMapping("/carSystem")
public class CarSystemController {

	@Autowired
	private CarSystemService carSystemService;
	/**
	 * 查询车系信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/queryCarSystemList")
	public DataContext<DataPager> queryCarSystemList(@RequestBody DataItem dataItem, HttpServletRequest request) {
		DataContext<DataPager> datcontext = carSystemService.getCarSystemByPager(dataItem);
		return datcontext;
	}

	@RequestMapping(value = "/getBrandByBrandCnName")
	public DataList getBrandByBrandCnName(@RequestBody DataItem dataItem, HttpServletRequest request) {
		DataList dataList = carSystemService.getBrandByBrandCnName(dataItem);
		return dataList;
	}
	
	/**
	 * 保存車系信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/saveCarSystem")
	@ResponseBody
	public DataContext<DataPager> saveBrand(@RequestBody DataItem dataItem, HttpServletRequest request) {
		return carSystemService.insertCarSystem(dataItem);
	}
	/**
	 * 修改車系信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/updateCarSystem")
	@ResponseBody
	public DataContext<DataPager> updateCarSystem(@RequestBody DataItem dataItem, HttpServletRequest request) {
		return carSystemService.updateCarSystem(dataItem);
	}
	
	
	@RequestMapping(value = "/delCarSystemById")
	@ResponseBody
	public DataContext<DataPager> delCarSystemById(@RequestParam long carSystemId, HttpServletRequest request) {
		return carSystemService.delCarSystemById(carSystemId);
	}
//	
//	@RequestMapping(value = "/getBrandById/{brandid}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public DataContext<DataItem> getDemoById(@PathVariable(value = "brandid", required = true) Long carid,
//			HttpServletRequest request) {
//
//		return brandService.getBrandById(carid);
//	}


}
