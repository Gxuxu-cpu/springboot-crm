package com.crm.cust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.base.service.impl.BaseServiceImpl;
import com.crm.bean.BasDict;
import com.crm.bean.BasDictExample;
import com.crm.bean.BasDictExample.Criteria;
import com.crm.bean.CstCustomer;
import com.crm.bean.CstCustomerExample;
import com.crm.bean.CstLinkmanExample;
import com.crm.bean.Orders;
import com.crm.bean.OrdersExample;
import com.crm.bean.OrdersLineExample;
import com.crm.cust.service.ICstCustomerService;
import com.crm.mapper.BasDictMapper;
import com.crm.mapper.CstCustomerMapper;
import com.crm.mapper.CstLinkmanMapper;
import com.crm.mapper.OrdersLineMapper;
import com.crm.mapper.OrdersMapper;


/**
 * 如何不写代码还不报错。
 * @author Lenovo
 *
 */
@Service
public class CstCustomerServiceImpl extends BaseServiceImpl<CstCustomer> implements ICstCustomerService {

	//@Resource
	//private CstCustomerMapper mapper;
	//如何在子类给父类中的属性注入值
	//当resource写到方法的上面给谁注入值=》参数 CstCustomerMapper mapper =ac.getBean("代理对象")
	//当@Resource写到属性上给谁注入值=》属性
	@Resource
	private BasDictMapper basDictMapper;
	
	private CstCustomerMapper customerMapper;
	
	@Resource
	public void SetMapper(CstCustomerMapper mapper) {
		super.setBaseMapper(mapper);
		this.customerMapper = mapper;
	}

	@Override
	//逆向工程自带的方法查询对应类型的列表
	public List<BasDict> selectByParam(String param) {
		BasDictExample basDictExample = new BasDictExample();
		Criteria criteria = basDictExample.createCriteria();
		criteria.andDictTypeEqualTo(param);
		return basDictMapper.selectByExample(basDictExample);
	}

	/**
	 * 使用逆向工程来删除
	 * linkman => linkmanMapper
	 * ordersline => orderslineMapper
	 * orders => ordersMapper
	 * cstCustomer => cstCustomerMapper
	 * 使用4个mapper分别进行删除
	 */
	@Resource
	private CstLinkmanMapper linkmanMapper;
	
	@Resource
	private OrdersLineMapper ordersLineMapper;
	
	@Resource
	private OrdersMapper ordersMapper;
	
	
	
	@Override
	public void deleteCustByCustNo(String custNo) {
		//先删除linkman
		CstLinkmanExample linkmanExample = new CstLinkmanExample();
		// 没有采用 Criteria criteria = linkmanExample.createCriteria()
		linkmanExample.createCriteria().andLkmCustNoEqualTo(custNo);
		linkmanMapper.deleteByExample(linkmanExample);
		

		// 删除ordersLine =>custno和ordersLine没有直接的关系，所以只能借助其他orders表进行删除
		//-- 只能custno==odr_cust_no=>查询集合 =》ordersMapper
		//-- 遍历集合 odr_id == odd_order_id =>进行删除 odersLineMapper
		//先查询，在遍历得到odr_id进行删除
		OrdersExample ordersExample = new OrdersExample();
		ordersExample.createCriteria().andOdrCustNoEqualTo(custNo);
		List<Orders> ordersList = ordersMapper.selectByExample(ordersExample);
		//遍历通过ordersLineMapper来删除
		
		for (Orders orders : ordersList) {
			OrdersLineExample ordersLineExample = new OrdersLineExample();
			ordersLineExample.createCriteria().andOddOrderIdEqualTo(orders.getOdrId());
			ordersLineMapper.deleteByExample(ordersLineExample);
		}
		//ordersLine删除完成之后再删除orders
		ordersMapper.deleteByExample(ordersExample);
		
		
		//最后在删除customer
		CstCustomerExample customerExample = new CstCustomerExample();
		customerExample.createCriteria().andCustNoEqualTo(custNo);
		customerMapper.deleteByExample(customerExample);
		
	}
}
