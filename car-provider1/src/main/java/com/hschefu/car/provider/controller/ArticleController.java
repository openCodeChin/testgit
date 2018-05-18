package com.hschefu.car.provider.controller;

import com.hschefu.car.provider.service.ArticleService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;

/**
 * 
* @ClassName: ArticleController 
* @Description: TODO(厂商信息) 
* @author liuweiyi 
* @date 2018年5月11日 下午2:52:02 
*
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	/**
	 * 查询车系信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/queryArticleList")
	public DataContext<DataPager> queryArticleList(@RequestBody DataItem dataItem, HttpServletRequest request) {
		DataContext<DataPager> datcontext = articleService.getArticleByPager(dataItem);
		return datcontext;
	}

	@RequestMapping(value = "/getBrandByBrandCnName")
	public DataList getBrandByBrandCnName(@RequestBody DataItem dataItem, HttpServletRequest request) {
		DataList dataList = articleService.getBrandByBrandCnName(dataItem);
		return dataList;
	}
	
	/**
	 * 保存車系信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/saveArticle")
	@ResponseBody
	public DataContext<DataPager> saveBrand(@RequestBody DataItem dataItem, HttpServletRequest request) {
		return articleService.insertArticle(dataItem);
	}
	/**
	 * 修改車系信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/updateArticle")
	@ResponseBody
	public DataContext<DataPager> updateArticle(@RequestBody DataItem dataItem, HttpServletRequest request) {
		return articleService.updateArticle(dataItem);
	}
	
	
	@RequestMapping(value = "/delArticleByIds")
	@ResponseBody
	public DataContext<DataPager> delArticleByIds(@RequestBody DataItem dataItem, HttpServletRequest request) {
		return articleService.delArticleByIds(dataItem);
	}
//	
//	@RequestMapping(value = "/getBrandById/{brandid}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public DataContext<DataItem> getDemoById(@PathVariable(value = "brandid", required = true) Long carid,
//			HttpServletRequest request) {
//
//		return brandService.getBrandById(carid);
//	}


}
