package com.crm.cust.service;

import java.util.List;

import com.crm.base.service.IBaseService;

import com.crm.bean.CstLinkman;

public interface ICstLinkmanService extends IBaseService<CstLinkman>{

	//���ݿͻ���custNo��ѯ��ϵ���б�
	List<CstLinkman> findLinkmansByCustNo(String custNo);



}
