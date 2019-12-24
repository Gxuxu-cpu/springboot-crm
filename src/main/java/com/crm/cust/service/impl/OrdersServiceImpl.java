package com.crm.cust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.base.service.impl.BaseServiceImpl;
import com.crm.bean.BasDict;
import com.crm.bean.BasDictExample;
import com.crm.bean.Orders;
import com.crm.bean.SalChance;
import com.crm.bean.BasDictExample.Criteria;
import com.crm.cust.service.IOrdersService;
import com.crm.mapper.BasDictMapper;
import com.crm.mapper.OrdersMapper;
import com.crm.support.PageInfo;


@Service
public class OrdersServiceImpl extends BaseServiceImpl<Orders> implements IOrdersService {
	
	@Resource
	private BasDictMapper basDictMapper;
	
	private OrdersMapper ordersmapper;
	
	@Resource
	public void setMapper(OrdersMapper mapper) {
		super.setBaseMapper(mapper);
		this.ordersmapper = mapper;
	}

	
	/**
	 * 不是通用模块儿的方法，必须要重新实现。=》在 OrdersMapper中添加新的方法
	 */
	@Override
	public Orders findOrdersByOrdId(Long odrId) {
		// TODO Auto-generated method stub
		return ordersmapper.findOrdersByOrdId(odrId);
	}


	@Override
	public List<BasDict> selectByParam(String param) {
		// TODO Auto-generated method stub
		BasDictExample basDictExample = new BasDictExample();
		Criteria criteria = basDictExample.createCriteria();
		criteria.andDictTypeEqualTo(param);
		return basDictMapper.selectByExample(basDictExample);
	}


	@Override
	public List<Orders> findOrders(PageInfo<Orders> pageInfo) {
		// TODO Auto-generated method stub
		return ordersmapper.selectListsByPageInfo(pageInfo);
	}
	
	

}
