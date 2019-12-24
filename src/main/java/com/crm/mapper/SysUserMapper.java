package com.crm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.bean.SysRight;
import com.crm.bean.SysUser;
import com.crm.bean.SysUserExample;

public interface SysUserMapper extends IBaseMapper<SysUser> {
	int countByExample(SysUserExample example);

	int deleteByExample(SysUserExample example);

	int deleteByPrimaryKey(Long usrId);

	int insert(SysUser record);

	int insertSelective(SysUser record);

	List<SysUser> selectByExample(SysUserExample example);

	SysUser selectByPrimaryKey(Long usrId);

	int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

	int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

	int updateByPrimaryKeySelective(SysUser record);

	int updateByPrimaryKey(SysUser record);

	// 在逆向工程的mapper中增加根据用户名，密码查询的方法
	SysUser selectUser(SysUser user);

	// 根据用户查询用户对应的权限
	List<SysRight> selectUserRights(SysUser user);

	// 联表查询用户角色
	List<SysUser> findAllUsers();

}