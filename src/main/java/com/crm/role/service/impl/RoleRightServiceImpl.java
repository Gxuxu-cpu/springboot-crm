package com.crm.role.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.base.service.impl.BaseServiceImpl;
import com.crm.bean.SysRight;
import com.crm.bean.SysRole;
import com.crm.bean.SysRoleExample;
import com.crm.bean.SysRoleRightExample;
import com.crm.bean.SysRoleRightKey;
import com.crm.mapper.SysRightMapper;
import com.crm.mapper.SysRoleMapper;
import com.crm.mapper.SysRoleRightMapper;
import com.crm.role.service.IRightService;
import com.crm.role.service.IRoleRightService;
import com.crm.role.service.IRoleService;
import com.crm.support.PageInfo;

@Service
public class RoleRightServiceImpl extends BaseServiceImpl<SysRoleRightKey> implements IRoleRightService {

	private SysRoleRightMapper roleRightMapper;
	
	@Resource
	public void setSuperMapper(SysRoleRightMapper mapper) {
		super.setBaseMapper(mapper);
		this.roleRightMapper = mapper;
	}


	/**
	 * ���������򹤳��Դ��Ĳ�ѯ����ѯ�б�,������ѯ =>example
	 */
	public List<SysRoleRightKey> findRightsByRoleId(Long roleId) {
		SysRoleRightExample example = new SysRoleRightExample();
		example.createCriteria().andRfRoleIdEqualTo(roleId);
		return roleRightMapper.selectByExample(example);
	}

	/**
	 * ��service�����ɾ������ӣ����������
	 * ʹ�����򹤳���ʵ��
	 */
	public void manage(Long roleId, String[] selectedRights) {
		// TODO Auto-generated method stub
		//��ɾ��
		SysRoleRightExample example = new SysRoleRightExample();
		example.createCriteria().andRfRoleIdEqualTo(roleId);
		roleRightMapper.deleteByExample(example);
		//�����
		for (String right : selectedRights) {
			SysRoleRightKey roleRight = new SysRoleRightKey();
			roleRight.setRfRoleId(roleId);
			roleRight.setRfRightCode(right);
			roleRightMapper.insert(roleRight);
		}
	}

	

	
	

}
