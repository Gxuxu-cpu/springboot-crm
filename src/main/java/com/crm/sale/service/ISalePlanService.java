package com.crm.sale.service;

import java.util.List;

import com.crm.bean.SalPlan;

public interface ISalePlanService {

	//根据salChance的chcId查询sal_plan中的数据
	List<SalPlan> selectPlansByChcId(Long chcId);

	void add(SalPlan salPlan);

	void delete(Long plaId);

	void update(SalPlan salPlan);
}
