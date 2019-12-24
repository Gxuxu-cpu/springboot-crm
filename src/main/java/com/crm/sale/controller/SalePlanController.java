package com.crm.sale.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.bean.SalChance;
import com.crm.bean.SalPlan;
import com.crm.sale.service.ISalePlanService;
import com.crm.sale.service.ISaleService;

@Controller
@RequestMapping("/plan")
public class SalePlanController {
	
	@Resource
	private ISaleService<SalChance> saleService;
	
	@Resource
	private ISalePlanService salePlanService;
    /**
     *  1 ����ƶ��ƻ���ť����ת���ƶ��ƻ�ҳ��
		2 ��Ҫ��ѯ��ӦSalChance �Լ� ��ӦSalPlan
		3 ��ҳ���ж�SalChance����չʾ����SalPlan���б���չʾ��
		�ŵ�model��
     */
	@RequestMapping("/toDevPlan")
	public String toDevPlan(Model model,Long chcId) {
		//��Ҫ��ѯ��ӦSalChance
		model.addAttribute("salChance", saleService.selectByPrimaryKey(chcId));
		//��Ҫ��ѯ��ӦSalPlan
		model.addAttribute("plans",salePlanService.selectPlansByChcId(chcId));
		return "sale/devPlan";
	}
	
	/**
	 * ���ִ�мƻ�����ת��ִ�мƻ�ҳ�棬
		��Ҫȡ��sal_chance��sal_plan�б�
	 * @param model
	 * @param chcId
	 * @return
	 */
	@RequestMapping("/toDevExecute")
	public String toDevExecute(Model model,Long chcId) {
		//��Ҫ��ѯ��ӦSalChance
		model.addAttribute("salChance", saleService.selectByPrimaryKey(chcId));
		//��Ҫ��ѯ��ӦSalPlan
		model.addAttribute("plans",salePlanService.selectPlansByChcId(chcId));
		return "sale/devExecute";
	}
	
	/**
	 * ����鿴����תdetailҳ��
		��Ҫȡ��sal_chance��sal_plan�б�
	 * @param model
	 * @param chcId
	 * @return
	 */
	@RequestMapping("/toDevDetail")
	public String toDevDetail(Model model,Long chcId) {
		//��Ҫ��ѯ��ӦSalChance
		model.addAttribute("salChance", saleService.selectByPrimaryKey(chcId));
		//��Ҫ��ѯ��ӦSalPlan
		model.addAttribute("plans",salePlanService.selectPlansByChcId(chcId));
		return "sale/devDetail";
	}
	
	/**
	 * ������֮�󣬰�������ص�salPlan�������@ResponseBodyת��json��
	 * @param chcId
	 * @param salPlan
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public List<SalPlan> add(Long chcId,SalPlan salPlan){
		//�Ѵ��ݹ�����salPlan���浽���ݿ���
		salPlan.setPlaChcId(chcId);
		salePlanService.add(salPlan);
		return salePlanService.selectPlansByChcId(chcId);
	}
	
	/**
	 * ɾ�����֮�󣬰�������ص�salPlan�������@ResponseBodyת��json��
	 * @param chcId
	 * @param salPlan
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public List<SalPlan> delete(Long plaId,Long chcId){
		//�Ѵ��ݹ�����salPlan���浽���ݿ���
		salePlanService.delete(plaId);
		return salePlanService.selectPlansByChcId(chcId);
	}
	
	/**
	 * �������֮��ֱ�ӷ��ر���ɹ��Ϳ�����
	 * produces="text/html;charset=UTF-8;" ����ָ�����صı��뼯��
	 * @param chcId
	 * @param salPlan
	 * @return
	 */
	@RequestMapping(value="/update",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String update(SalPlan salPlan){
		//�Ѵ��ݹ�����salPlan���浽���ݿ���
		salePlanService.update(salPlan);
		return "����ɹ�";
	}
	
	/**
	 * �����ɹ����߿���ʧ�ܶ�������������
	 * �ɹ���3��ʧ����4
	 * @param model
	 * @param salChance
	 * @return
	 */
	@RequestMapping("result")
	public String result(Model model,SalChance salChance) {
		saleService.updateSalChance(salChance);		
		return "redirect:../sale/devList";
	}
}
