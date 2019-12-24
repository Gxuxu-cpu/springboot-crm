package com.crm.cust.service;

import java.util.List;

import com.crm.base.service.IBaseService;
import com.crm.bean.BasDict;
import com.crm.bean.Orders;
import com.crm.bean.SalChance;
import com.crm.support.PageInfo;

/**
 * ��Ϊͨ��ģ����Ѿ�д����ҳ��ѯ������ֱ�Ӽ̳нӿڼ���
 * @author Lenovo
 *
 */
public interface IOrdersService extends IBaseService<Orders> {

	Orders findOrdersByOrdId(Long odrId);

	List<BasDict> selectByParam(String param);

	List<Orders> findOrders(PageInfo<Orders> pageInfo);

}
