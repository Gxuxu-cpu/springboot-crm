package com.crm.cust.service;

import java.util.List;

import com.crm.base.service.IBaseService;
import com.crm.bean.BasDict;
import com.crm.bean.Orders;
import com.crm.bean.SalChance;
import com.crm.support.PageInfo;

/**
 * 因为通用模块儿已经写过分页查询，所以直接继承接口即可
 * @author Lenovo
 *
 */
public interface IOrdersService extends IBaseService<Orders> {

	Orders findOrdersByOrdId(Long odrId);

	List<BasDict> selectByParam(String param);

	List<Orders> findOrders(PageInfo<Orders> pageInfo);

}
