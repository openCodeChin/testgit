package com.hschefu.car.provider.controller;

import com.hschefu.car.provider.service.QuestionService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataList;
import com.hschefu.common.DataPager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 
* @ClassName: QuestionController 
* @Description: TODO(问答信息) 
* @author liuweiyi 
* @date 2018年5月11日 下午2:52:02 
*
 */
@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	/**
	 * 查询问答信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/queryQuestionList")
	public DataContext<DataPager> queryQuestionList(@RequestBody DataItem dataItem, HttpServletRequest request) {
		DataContext<DataPager> datcontext = questionService.getQuestionByPager(dataItem);
		return datcontext;
	}

	@RequestMapping(value = "/getBrandByBrandCnName")
	public DataList getBrandByBrandCnName(@RequestBody DataItem dataItem, HttpServletRequest request) {
		DataList dataList = questionService.getBrandByBrandCnName(dataItem);
		return dataList;
	}
	
	/**
	 * 保存问答信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/saveQuestion")
	@ResponseBody
	public DataContext<DataPager> saveBrand(@RequestBody DataItem dataItem, HttpServletRequest request) {
		return questionService.insertQuestion(dataItem);
	}
	/**
	 * 修改问答信息
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/updateQuestion")
	@ResponseBody
	public DataContext<DataPager> updateQuestion(@RequestBody DataItem dataItem, HttpServletRequest request) {
		return questionService.updateQuestion(dataItem);
	}
	
	
	@RequestMapping(value = "/delQuestionByIds")
	@ResponseBody
	public DataContext<DataPager> delQuestionByIds(@RequestBody DataItem dataItem, HttpServletRequest request) {
		return questionService.delQuestionByIds(dataItem);
	}
//	
//	@RequestMapping(value = "/getBrandById/{brandid}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public DataContext<DataItem> getDemoById(@PathVariable(value = "brandid", required = true) Long carid,
//			HttpServletRequest request) {
//
//		return brandService.getBrandById(carid);
//	}


}
