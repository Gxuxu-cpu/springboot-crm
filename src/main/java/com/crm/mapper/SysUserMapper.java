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

	// �����򹤳̵�mapper�����Ӹ����û����������ѯ�ķ���
	SysUser selectUser(SysUser user);

	// �����û���ѯ�û���Ӧ��Ȩ��
	List<SysRight> selectUserRights(SysUser user);

	// �����ѯ�û���ɫ
	List<SysUser> findAllUsers();

}