package com.hschefu.car.provider.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hschefu.car.provider.service.ManufacturerService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataPager;

/**
 * 
* @ClassName: ManufacturerController 
* @Description: TODO(厂商信息) 
* @author liuweiyi 
* @date 2018年5月11日 下午2:52:02 
*
 */
@RestController
@RequestMapping("/manufacturer")
public class ManufacturerController {

	@Autowired
	private ManufacturerService manufacturerService;
	/**
	 * 查询厂商信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/queryManufacturerList")
	public DataContext<DataPager> queryManufacturerList(@RequestBody DataItem dataItem, HttpServletRequest request) {
		DataContext<DataPager> datcontext = manufacturerService.getManufacturerByPager(dataItem);
		return datcontext;
	}

	/**
	 * 保存厂商信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/saveManufacturer")
	@ResponseBody
	public DataContext<DataPager> saveBrand(@RequestBody DataItem dataItem, HttpServletRequest request) {
		return manufacturerService.insertManufacturer(dataItem);
	}
	/**
	 * 修改厂商信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/updateManufacturer")
	@ResponseBody
	public DataContext<DataPager> updateManufacturer(@RequestBody DataItem dataItem, HttpServletRequest request) {
		return manufacturerService.updateManufacturer(dataItem);
	}
	
	
//	@RequestMapping(value = "/delBrandById")
//	@ResponseBody
//	public DataContext<DataPager> delBrandById(@RequestParam long brandId, HttpServletRequest request) {
//		return brandService.delBrandById(brandId);
//	}
//	
//	@RequestMapping(value = "/getBrandById/{brandid}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public DataContext<DataItem> getDemoById(@PathVariable(value = "brandid", required = true) Long carid,
//			HttpServletRequest request) {
//
//		return brandService.getBrandById(carid);
//	}


}
