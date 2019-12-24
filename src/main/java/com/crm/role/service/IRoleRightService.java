package com.crm.role.service;

import java.util.List;

import com.crm.base.service.IBaseService;
import com.crm.bean.SysRoleRightKey;

public interface IRoleRightService extends IBaseService<SysRoleRightKey>{

	List<SysRoleRightKey> findRightsByRoleId(Long roleId);

	//��ɾ��������ӡ����½�ɫ��Ȩ��
	void manage(Long roleId, String[] selectedRights);

}
