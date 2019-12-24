package com.crm.sale.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.bean.SalPlan;
import com.crm.bean.SalPlanExample;
import com.crm.bean.SalPlanExample.Criteria;
import com.crm.mapper.SalPlanMapper;
import com.crm.sale.service.ISalePlanService;

@Service
public class ISalePlanServiceImpl implements ISalePlanService {

	@Resource
	private SalPlanMapper salPlanMapper;
	
	/**
	 * 可以用逆向工程的方法进行查询
	 * 注意熟练度的问题
	 */
	@Override
	public List<SalPlan> selectPlansByChcId(Long chcId) {
		// TODO Auto-generated method stub
		SalPlanExample example = new SalPlanExample();
		Criteria criteria =example.createCriteria();
		criteria.andPlaChcIdEqualTo(chcId);
		return salPlanMapper.selectByExample(example);
	}

	@Override
	public void add(SalPlan salPlan) {
		salPlanMapper.insertSelective(salPlan);
	}

	@Override
	public void delete(Long plaId) {
		salPlanMapper.deleteByPrimaryKey(plaId);
	}

	@Override
	public void update(SalPlan salPlan) {
		// TODO Auto-generated method stub
		salPlanMapper.updateByPrimaryKeySelective(salPlan);
	}

}
