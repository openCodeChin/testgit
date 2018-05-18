package com.hschefu.car.provider.controller;

import com.hschefu.car.provider.service.DictService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 
* @ClassName: DictController 
* @Description: TODO(字典信息) 
* @author liuweiyi 
* @date 2018年5月11日 下午2:52:02 
*
 */
@RestController
@RequestMapping("/dict")
public class DictController {

	@Autowired
	private DictService dictService;
	/**
	 * 查询字典信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/queryDictList")
	public DataContext<DataPager> queryDictList(@RequestBody DataItem dataItem, HttpServletRequest request) {
		DataContext<DataPager> datcontext = dictService.getDictByPager(dataItem);
		return datcontext;
	}


	/**
	 * 保存字典信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/saveDict")
	@ResponseBody
	public DataContext<DataPager> saveBrand(@RequestBody DataItem dataItem, HttpServletRequest request) {
		return dictService.insertDict(dataItem);
	}
	/**
	 * 修改字典信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/updateDict")
	@ResponseBody
	public DataContext<DataPager> updateDict(@RequestBody DataItem dataItem, HttpServletRequest request) {
		return dictService.updateDict(dataItem);
	}
	
	
	@RequestMapping(value = "/delDictById")
	@ResponseBody
	public DataContext<DataPager> delDictById(@RequestParam long dictId, HttpServletRequest request) {
		return dictService.delDictById(dictId);
	}
//	
//	@RequestMapping(value = "/getBrandById/{brandid}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public DataContext<DataItem> getDemoById(@PathVariable(value = "brandid", required = true) Long carid,
//			HttpServletRequest request) {
//
//		return brandService.getBrandById(carid);
//	}


}
