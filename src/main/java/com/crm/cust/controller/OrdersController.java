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
	 * ʹ��pageInfo������ʾ���е���Ϣ������ֻ��Ҫ����PageInfo<Orders>������
	 * ���˵������CstCustomer������յĻ������ܷ���pageInfo�����ܷ���Orders���գ�
	 * @return
	 */
	@RequestMapping("list")
	public String list(PageInfo<Orders> pageInfo,Orders orders,Model model) {
		pageInfo.setEntity(orders);//�����ѯ����
		PageInfo<Orders> info = ordersService.findListByPageInfo(pageInfo);
		model.addAttribute("pageInfo", info);
		return "cust/cust/orders";
	}
	
	/**
	 * ���붩���ţ���ѯ��Orders�������
	 */
	@RequestMapping("show")
	public String showDetail(Long odrId,Model model) {
		//������Ҫ�����½�һ����ѯ��������Orders��ѯ����
		Orders orders = ordersService.findOrdersByOrdId(odrId);
		model.addAttribute("orders", orders);
		return "cust/cust/orders_detail";
	}
	
	
}
