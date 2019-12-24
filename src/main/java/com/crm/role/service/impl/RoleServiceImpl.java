package com.crm.role.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.base.service.impl.BaseServiceImpl;
import com.crm.bean.SysRole;
import com.crm.bean.SysRoleExample;
import com.crm.bean.SysRoleRightExample;
import com.crm.bean.SysUserExample;
import com.crm.mapper.SysRoleMapper;
import com.crm.mapper.SysRoleRightMapper;
import com.crm.mapper.SysUserMapper;
import com.crm.role.service.IRoleService;
import com.crm.support.PageInfo;

@Service
public class RoleServiceImpl extends BaseServiceImpl<SysRole> implements IRoleService {

	private SysRoleMapper roleMapper;
	
	@Resource
	private SysUserMapper userMapper;
	
	@Resource
	private SysRoleRightMapper roleRightMapper;
	
	
	@Resource
	public void setSuperMapper(SysRoleMapper mapper) {
		super.setBaseMapper(mapper);
		this.roleMapper = mapper;
	}

	/**
	 * 可以用逆向工程自带的查询来查询列表 roleMapper.selectByExample(null)
	 */
	public List<SysRole> findAllRoles() {

		return roleMapper.selectByExample(null);
	}

	
	/**
	 * 
	 *  先删用户表
		再删角色权限表
		最后再删角色表
	 */
	public void deleteAllByRoleId(Long roleId) {
		//用户的删除
		SysUserExample userExample = new SysUserExample();
		userExample.createCriteria().andUsrRoleIdEqualTo(roleId);
		userMapper.deleteByExample(userExample);
		//角色权限的删除
		SysRoleRightExample rrExample = new SysRoleRightExample();
		rrExample.createCriteria().andRfRoleIdEqualTo(roleId);
		roleRightMapper.deleteByExample(rrExample);
		//角色的删除
		roleMapper.deleteByPrimaryKey(roleId);
		
	}

}
