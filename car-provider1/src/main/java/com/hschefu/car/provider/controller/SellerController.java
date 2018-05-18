package com.hschefu.car.provider.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hschefu.car.provider.service.SellerService;
import com.hschefu.common.DataContext;
import com.hschefu.common.DataItem;
import com.hschefu.common.DataPager;

@RestController
@RequestMapping("/sell")
public class SellerController {

	@Autowired
	private SellerService sellService;
	
	/**卖车预约列表
	 * 
	 * @param pageIndex
	 * @param pageSize
	 * @param mobile
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/list")
	public DataContext<DataPager> Employeelist(@RequestBody DataItem dataItem,HttpServletRequest request ){
		
		return sellService.getSellerByPager(dataItem);
	}
	
	/**卖车预约查询
	 * 
	 * @param dataItem
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/query")
	public DataContext<DataPager> queryBuyerList(@RequestBody DataItem dataItem, HttpServletRequest request) {
		DataContext<DataPager> datcontext =  sellService.getSellerByPager(dataItem);
		return datcontext;
	}
	
	/**卖车预约添加
	 * @author 张亚垚
	 */
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	public DataContext<Integer> addBuyer(@RequestBody DataItem dataItem) {
		return sellService.addBuyer(dataItem);		
	}
	
   
	/**卖车预约添加
	 * @author 张亚垚
	 */
	@RequestMapping(value = "/addremark",method=RequestMethod.POST)
	public DataContext<Integer> addremark(@RequestBody DataItem dataItem) {
		return sellService.addremark(dataItem);		
	}
	
	
	
}
