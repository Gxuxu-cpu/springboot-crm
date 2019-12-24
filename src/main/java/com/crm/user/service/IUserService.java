package com.crm.user.service;

import java.util.List;

import com.crm.base.service.IBaseService;
import com.crm.bean.SysRight;
import com.crm.bean.SysUser;

public interface IUserService extends IBaseService<SysUser> {

	SysUser selectUser(SysUser user);

	// 添加方法根据用户查询用户对应的权限List<SysRole>
	List<SysRight> selectUserRights(SysUser user);

	// 联表查询用户，角色
	List<SysUser> findAllUsers();

	SysUser findSysUserByUsrId(Long usrId);

	SysUser wxLogin(SysUser sysUser);

}
