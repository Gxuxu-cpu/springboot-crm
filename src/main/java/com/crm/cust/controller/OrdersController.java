package com.crm.cust.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.bean.Orders;
import com.crm.cust.service.IOrdersService;
import com.crm.support.PageInfo;

@Controller
@RequestMapping("orders")
public class OrdersController {

	@Resource
	private IOrdersService ordersService;
	
	/**
	 * 使用pageInfo可以显示所有的信息，所以只需要放入PageInfo<Orders>就行了
	 * 如果说还是用CstCustomer对象接收的话，不能放入pageInfo对象，能否用Orders接收，
	 * @return
	 */
	@RequestMapping("list")
	public String list(PageInfo<Orders> pageInfo,Orders orders,Model model) {
		pageInfo.setEntity(orders);//放入查询条件
		PageInfo<Orders> info = ordersService.findListByPageInfo(pageInfo);
		model.addAttribute("pageInfo", info);
		return "cust/cust/orders";
	}
	
	/**
	 * 传入订单号，查询出Orders就完成了
	 */
	@RequestMapping("show")
	public String showDetail(Long odrId,Model model) {
		//我们需要重新新建一个查询方法，把Orders查询出来
		Orders orders = ordersService.findOrdersByOrdId(odrId);
		model.addAttribute("orders", orders);
		return "cust/cust/orders_detail";
	}
	
	
}
