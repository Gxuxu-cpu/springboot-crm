package com.crm.role.service;

import java.util.List;

import com.crm.base.service.IBaseService;
import com.crm.bean.SysRight;

public interface IRightService extends IBaseService<SysRight>{

	//��ѯ���е�Ȩ��
	List<SysRight> findAllRights();

	String createCode(String rightParentCode);
	
}
