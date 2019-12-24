package com.crm.role.service;

import java.util.List;

import com.crm.base.service.IBaseService;
import com.crm.bean.SysRole;

public interface IRoleService extends IBaseService<SysRole>{

	List<SysRole> findAllRoles();

	void deleteAllByRoleId(Long roleId);

}
