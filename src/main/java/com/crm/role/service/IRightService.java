package com.crm.role.service;

import java.util.List;

import com.crm.base.service.IBaseService;
import com.crm.bean.SysRight;

public interface IRightService extends IBaseService<SysRight>{

	//查询所有的权限
	List<SysRight> findAllRights();

	String createCode(String rightParentCode);
	
}
