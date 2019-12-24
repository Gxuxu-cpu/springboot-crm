package com.crm.cust.service;

import java.util.List;

import com.crm.base.service.IBaseService;
import com.crm.bean.BasDict;
import com.crm.bean.CstCustomer;

public interface ICstCustomerService extends IBaseService<CstCustomer>{

	//��ɾ��ģ���ҳ
	//��Ϊ������Ϳͻ��ȼ��ķ�����ͨ�ã�������Ҫ�Լ�������صķ���
	List<BasDict> selectByParam(String param);

	void deleteCustByCustNo(String custNo);
}
