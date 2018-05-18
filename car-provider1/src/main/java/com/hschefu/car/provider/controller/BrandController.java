package com.hschefu.car.provider.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hschefu.car.provider.service.BrandService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataPager;

/**
 * 
 * @ClassName: BrandController
 * @Description: 车品牌
 * @author liuweiyi
 * @date 2018年5月7日 下午8:47:33
 *
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

	@Autowired
	private BrandService brandService;
	/**
	 * 查询车品牌
	 * 
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/queryBrandList")
	public DataContext<DataPager> queryBrandList(@RequestBody DataItem dataItem, HttpServletRequest request) {
		DataContext<DataPager> datcontext = brandService.getBrandByPager(dataItem);
		return datcontext;
	}

	/**
	 * 保存品牌信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/saveBrand")
	@ResponseBody
	public DataContext<DataPager> saveBrand(@RequestBody DataItem dataItem, HttpServletRequest request) {
		return brandService.insertBrand(dataItem);
	}
	@RequestMapping(value = "/delBrandById")
	@ResponseBody
	public DataContext<DataPager> delBrandById(@RequestParam long brandId, HttpServletRequest request) {
		return brandService.delBrandById(brandId);
	}
	
	@RequestMapping(value = "/getBrandById/{brandid}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public DataContext<DataItem> getDemoById(@PathVariable(value = "brandid", required = true) Long carid,
			HttpServletRequest request) {

		return brandService.getBrandById(carid);
	}


}
