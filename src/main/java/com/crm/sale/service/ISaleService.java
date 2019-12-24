package com.crm.sale.service;

import java.util.List;

import com.crm.bean.SalChance;
import com.crm.bean.SysUser;
import com.crm.support.PageInfo;

public interface ISaleService<T> {

	List<SalChance> selectSalChance(String status);
	
	//����id��ѯ���ۻ���
	SalChance selectSalChanceById(Long id);
	
	//����SalChance�������
	void updateSalChance(SalChance salChance);
	
	//�ڽӿ������ɾ������
	void deleteSalChance(Long id);
	
	
	//��ʾ��ѯ�����ݣ���������ǰҳ������ѯ�������ǲ��Ƕ����Էŵ�pageInfo��
	//����Ϊʲô��PageInfo<SalChance> pageInfo ,����ֻ��������list��û��ֵ��
	//���ص�ʱ��һ���������ݵ�
	PageInfo<SalChance> selectPageInfo(PageInfo<SalChance> pageInfo);
	
	
	//selectSalChanceById = > selectObjectById
	//Long id ,Integer id,String id => Object id;
	//�Ȱѷ�����ͨ���ˣ�����ͨ����
	SalChance selectObjectById(Object id);
	
	//SalChance ��ͨ�ã���ô�÷���ֵ����ͨ����
	//�ȴ�Ԥ���룬Ϊ��һ����ȡ�����ӿ���׼��
	//��ȷ��������ʲô���͵ģ�����������ʵ����ȷ�����ص����ͣ����Ҳ���ǿת
	T selectByPrimaryKey(Object id);

	void insert(SalChance salChance);
	
	//��ѯroleid��3���û�
	List<SysUser> findUsersByRoleId(Long roleId);
}
