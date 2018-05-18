package com.hschefu.car.provider.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hschefu.car.provider.service.CarModelService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;

/**
 * 
* @ClassName: CarModelController 
* @Description: TODO(厂商信息) 
* @author liuweiyi 
* @date 2018年5月11日 下午2:52:02 
*
 */
@RestController
@RequestMapping("/carModel")
public class CarModelController {

	@Autowired
	private CarModelService carModelService;
	/**
	 * 查询车系信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/queryCarModelList")
	public DataContext<DataPager> queryCarModelList(@RequestBody DataItem dataItem, HttpServletRequest request) {
		DataContext<DataPager> datcontext = carModelService.getCarModelByPager(dataItem);
		return datcontext;
	}

	@RequestMapping(value = "/getBrandByBrandCnName")
	public DataList getBrandByBrandCnName(@RequestBody DataItem dataItem, HttpServletRequest request) {
		DataList dataList = carModelService.getBrandByBrandCnName(dataItem);
		return dataList;
	}
	
	/**
	 * 保存車系信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/saveCarModel")
	@ResponseBody
	public DataContext<DataPager> saveBrand(@RequestBody DataItem dataItem, HttpServletRequest request) {
		return carModelService.insertCarModel(dataItem);
	}
	/**
	 * 修改車系信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/updateCarModel")
	@ResponseBody
	public DataContext<DataPager> updateCarModel(@RequestBody DataItem dataItem, HttpServletRequest request) {
		return carModelService.updateCarModel(dataItem);
	}
	
	
	@RequestMapping(value = "/delCarModelById")
	@ResponseBody
	public DataContext<DataPager> delCarModelById(@RequestParam long carModelId, HttpServletRequest request) {
		return carModelService.delCarModelById(carModelId);
	}
//	
//	@RequestMapping(value = "/getBrandById/{brandid}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public DataContext<DataItem> getDemoById(@PathVariable(value = "brandid", required = true) Long carid,
//			HttpServletRequest request) {
//
//		return brandService.getBrandById(carid);
//	}


}
