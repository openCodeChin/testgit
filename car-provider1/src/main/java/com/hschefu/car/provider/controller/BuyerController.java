package com.hschefu.car.provider.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hschefu.car.provider.service.BuyerService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataPager;

@RestController
@RequestMapping("/buy")
public class BuyerController {
	
	@Autowired
	private BuyerService buyerService;
	
	
	/**买车预约列表
	 * 
	 * @param pageIndex
	 * @param pageSize
	 * @param mobile
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/list")
	public DataContext<DataPager> Employeelist(@RequestBody DataItem dataItem,HttpServletRequest request ){
		
		return buyerService.getBuyerByPager(dataItem);
	}
	
	
	@RequestMapping(value = "/query")
	public DataContext<DataPager> queryBuyerList(@RequestBody DataItem dataItem, HttpServletRequest request) {
		//System.out.println("query######"+dataItem.toString()+"");
		DataContext<DataPager> datcontext =  buyerService.getBuyerByPager(dataItem);
		return datcontext;
	}
	
	/**买车预约添加
	 * @author 张亚垚
	 */
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	public DataContext<Integer> addBuyer(@RequestBody DataItem dataItem) {
		return buyerService.addBuyer(dataItem);		
	}
	
	/**买车预约添加
	 * @author 张亚垚
	 */
	@RequestMapping(value = "/addremark",method=RequestMethod.POST)
	public DataContext<Integer> addremark(@RequestBody DataItem dataItem) {
		return buyerService.addremark(dataItem);		
	}
	
	
	

}
