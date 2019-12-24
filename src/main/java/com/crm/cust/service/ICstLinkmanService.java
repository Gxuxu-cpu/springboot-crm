package com.crm.cust.service;

import java.util.List;

import com.crm.base.service.IBaseService;

import com.crm.bean.CstLinkman;

public interface ICstLinkmanService extends IBaseService<CstLinkman>{

	//根据客户的custNo查询联系人列表
	List<CstLinkman> findLinkmansByCustNo(String custNo);



}
