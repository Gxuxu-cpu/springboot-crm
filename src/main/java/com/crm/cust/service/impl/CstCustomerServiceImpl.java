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
 * ��β�д���뻹������
 * @author Lenovo
 *
 */
@Service
public class CstCustomerServiceImpl extends BaseServiceImpl<CstCustomer> implements ICstCustomerService {

	//@Resource
	//private CstCustomerMapper mapper;
	//���������������е�����ע��ֵ
	//��resourceд�������������˭ע��ֵ=������ CstCustomerMapper mapper =ac.getBean("�������")
	//��@Resourceд�������ϸ�˭ע��ֵ=������
	@Resource
	private BasDictMapper basDictMapper;
	
	private CstCustomerMapper customerMapper;
	
	@Resource
	public void SetMapper(CstCustomerMapper mapper) {
		super.setBaseMapper(mapper);
		this.customerMapper = mapper;
	}

	@Override
	//���򹤳��Դ��ķ�����ѯ��Ӧ���͵��б�
	public List<BasDict> selectByParam(String param) {
		BasDictExample basDictExample = new BasDictExample();
		Criteria criteria = basDictExample.createCriteria();
		criteria.andDictTypeEqualTo(param);
		return basDictMapper.selectByExample(basDictExample);
	}

	/**
	 * ʹ�����򹤳���ɾ��
	 * linkman => linkmanMapper
	 * ordersline => orderslineMapper
	 * orders => ordersMapper
	 * cstCustomer => cstCustomerMapper
	 * ʹ��4��mapper�ֱ����ɾ��
	 */
	@Resource
	private CstLinkmanMapper linkmanMapper;
	
	@Resource
	private OrdersLineMapper ordersLineMapper;
	
	@Resource
	private OrdersMapper ordersMapper;
	
	
	
	@Override
	public void deleteCustByCustNo(String custNo) {
		//��ɾ��linkman
		CstLinkmanExample linkmanExample = new CstLinkmanExample();
		// û�в��� Criteria criteria = linkmanExample.createCriteria()
		linkmanExample.createCriteria().andLkmCustNoEqualTo(custNo);
		linkmanMapper.deleteByExample(linkmanExample);
		

		// ɾ��ordersLine =>custno��ordersLineû��ֱ�ӵĹ�ϵ������ֻ�ܽ�������orders�����ɾ��
		//-- ֻ��custno==odr_cust_no=>��ѯ���� =��ordersMapper
		//-- �������� odr_id == odd_order_id =>����ɾ�� odersLineMapper
		//�Ȳ�ѯ���ڱ����õ�odr_id����ɾ��
		OrdersExample ordersExample = new OrdersExample();
		ordersExample.createCriteria().andOdrCustNoEqualTo(custNo);
		List<Orders> ordersList = ordersMapper.selectByExample(ordersExample);
		//����ͨ��ordersLineMapper��ɾ��
		
		for (Orders orders : ordersList) {
			OrdersLineExample ordersLineExample = new OrdersLineExample();
			ordersLineExample.createCriteria().andOddOrderIdEqualTo(orders.getOdrId());
			ordersLineMapper.deleteByExample(ordersLineExample);
		}
		//ordersLineɾ�����֮����ɾ��orders
		ordersMapper.deleteByExample(ordersExample);
		
		
		//�����ɾ��customer
		CstCustomerExample customerExample = new CstCustomerExample();
		customerExample.createCriteria().andCustNoEqualTo(custNo);
		customerMapper.deleteByExample(customerExample);
		
	}
}
