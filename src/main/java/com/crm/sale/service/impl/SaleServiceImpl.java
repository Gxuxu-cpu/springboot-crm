package com.crm.sale.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.SalChance;
import com.crm.bean.SalChanceExample;
import com.crm.bean.SalChanceExample.Criteria;
import com.crm.bean.SysUser;
import com.crm.bean.SysUserExample;
import com.crm.mapper.SalChanceMapper;
import com.crm.mapper.SysUserMapper;
import com.crm.sale.service.ISaleService;
import com.crm.support.PageInfo;

@Service
public class SaleServiceImpl implements ISaleService<SalChance> {

	@Resource
	private SalChanceMapper salChanceMapper;
	
	@Resource
	private SysUserMapper sysUserMapper;
	
	@Override
	public List<SalChance> selectSalChance(String status) {
		// TODO Auto-generated method stub
		SalChanceExample example = new SalChanceExample();
		Criteria criteria = example.createCriteria();
		criteria.andChcStatusEqualTo(status);
		return salChanceMapper.selectByExample(example);	
	}

	@Override
	public SalChance selectSalChanceById(Long id) {
		// TODO Auto-generated method stub
		return salChanceMapper.selectByPrimaryKey(id);
	}

	
	@Override
	public void updateSalChance(SalChance salChance) {
		salChanceMapper.updateByPrimaryKeySelective(salChance);
	}


	@Override
	public void deleteSalChance(Long id) {
		salChanceMapper.deleteByPrimaryKey(id);
	}

	
	/**
	 * service��������д�ģ�service��Ҫȥ���ò�ͬ��mapper����
	 * ��ǰ��ҳ�棬��ÿҳ����������ֵ��
	 * 
	 */
	@Override
	public PageInfo<SalChance> selectPageInfo(PageInfo<SalChance> pageInfo) {
		//��ѯ��Ŀ��ʱ��start �� pageSize������Ĭ��ֵ��
		List<SalChance> lists = salChanceMapper.selectSalChanceByPageInfo(pageInfo);
		//��������
		int count = salChanceMapper.selectCountByPageInfo(pageInfo);
		//����ҳ�� = > ������/ÿҳ������
		int totalPage = count%pageInfo.getPageSize()>0?count/pageInfo.getPageSize()+1:count/pageInfo.getPageSize();
		pageInfo.setLists(lists);
		pageInfo.setTotalCount(count);
		pageInfo.setTotalPage(totalPage);
		return pageInfo;
	}

	
	
	@Override
	public SalChance selectObjectById(Object id) {
		// TODO Auto-generated method stub
		return salChanceMapper.selectByPrimaryKey((Long) id);
	}
	
	/**
	 * ʵ���� ʵ�� �ӿڵ�ʱ��ָ�����͡�
	 */
	@Override
	public SalChance selectByPrimaryKey(Object id) {
		// TODO Auto-generated method stub
		return salChanceMapper.selectByPrimaryKey((Long) id);
	}

	@Override
	public void insert(SalChance salChance) {
		// TODO Auto-generated method stub
		salChanceMapper.insertSelective(salChance);
	}

	@Override
	public List<SysUser> findUsersByRoleId(Long roleId) {
		//ʹ��SysUserExample����ѯroleIdΪ3���û�
		SysUserExample example = new SysUserExample();
		com.crm.bean.SysUserExample.Criteria criteria = example.createCriteria();
		criteria.andUsrRoleIdEqualTo(roleId);
		return sysUserMapper.selectByExample(example);
	}

	

	

}
