package com.crm.cust.service;

import java.util.List;

import com.crm.base.service.IBaseService;
import com.crm.bean.BasDict;
import com.crm.bean.CstCustomer;

public interface ICstCustomerService extends IBaseService<CstCustomer>{

	//增删查改，分页
	//因为查地区和客户等级的方法不通用，所以需要自己新增相关的方法
	List<BasDict> selectByParam(String param);

	void deleteCustByCustNo(String custNo);
}
