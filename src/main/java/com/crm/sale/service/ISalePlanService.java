package com.crm.sale.service;

import java.util.List;

import com.crm.bean.SalPlan;

public interface ISalePlanService {

	//����salChance��chcId��ѯsal_plan�е�����
	List<SalPlan> selectPlansByChcId(Long chcId);

	void add(SalPlan salPlan);

	void delete(Long plaId);

	void update(SalPlan salPlan);
}
