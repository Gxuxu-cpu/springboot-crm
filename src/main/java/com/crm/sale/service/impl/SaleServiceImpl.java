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
	 * service层是最难写的，service需要去调用不同的mapper方法
	 * 当前的页面，和每页的条数是有值的
	 * 
	 */
	@Override
	public PageInfo<SalChance> selectPageInfo(PageInfo<SalChance> pageInfo) {
		//查询条目的时候，start 和 pageSize都是有默认值的
		List<SalChance> lists = salChanceMapper.selectSalChanceByPageInfo(pageInfo);
		//查总条数
		int count = salChanceMapper.selectCountByPageInfo(pageInfo);
		//算总页数 = > 总条数/每页的条数
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
	 * 实现类 实现 接口的时候指定泛型。
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
		//使用SysUserExample啦查询roleId为3的用户
		SysUserExample example = new SysUserExample();
		com.crm.bean.SysUserExample.Criteria criteria = example.createCriteria();
		criteria.andUsrRoleIdEqualTo(roleId);
		return sysUserMapper.selectByExample(example);
	}

	

	

}
