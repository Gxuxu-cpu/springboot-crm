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
     *  1 点击制定计划按钮，跳转到制定计划页面
		2 需要查询对应SalChance 以及 对应SalPlan
		3 在页面中对SalChance进行展示，对SalPlan进行遍历展示。
		放到model中
     */
	@RequestMapping("/toDevPlan")
	public String toDevPlan(Model model,Long chcId) {
		//需要查询对应SalChance
		model.addAttribute("salChance", saleService.selectByPrimaryKey(chcId));
		//需要查询对应SalPlan
		model.addAttribute("plans",salePlanService.selectPlansByChcId(chcId));
		return "sale/devPlan";
	}
	
	/**
	 * 点击执行计划，跳转到执行计划页面，
		需要取出sal_chance和sal_plan列表
	 * @param model
	 * @param chcId
	 * @return
	 */
	@RequestMapping("/toDevExecute")
	public String toDevExecute(Model model,Long chcId) {
		//需要查询对应SalChance
		model.addAttribute("salChance", saleService.selectByPrimaryKey(chcId));
		//需要查询对应SalPlan
		model.addAttribute("plans",salePlanService.selectPlansByChcId(chcId));
		return "sale/devExecute";
	}
	
	/**
	 * 点击查看，跳转detail页面
		需要取出sal_chance和sal_plan列表
	 * @param model
	 * @param chcId
	 * @return
	 */
	@RequestMapping("/toDevDetail")
	public String toDevDetail(Model model,Long chcId) {
		//需要查询对应SalChance
		model.addAttribute("salChance", saleService.selectByPrimaryKey(chcId));
		//需要查询对应SalPlan
		model.addAttribute("plans",salePlanService.selectPlansByChcId(chcId));
		return "sale/devDetail";
	}
	
	/**
	 * 添加完成之后，把所有相关的salPlan查出来，@ResponseBody转成json串
	 * @param chcId
	 * @param salPlan
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public List<SalPlan> add(Long chcId,SalPlan salPlan){
		//把传递过来的salPlan保存到数据库中
		salPlan.setPlaChcId(chcId);
		salePlanService.add(salPlan);
		return salePlanService.selectPlansByChcId(chcId);
	}
	
	/**
	 * 删除完成之后，把所有相关的salPlan查出来，@ResponseBody转成json串
	 * @param chcId
	 * @param salPlan
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public List<SalPlan> delete(Long plaId,Long chcId){
		//把传递过来的salPlan保存到数据库中
		salePlanService.delete(plaId);
		return salePlanService.selectPlansByChcId(chcId);
	}
	
	/**
	 * 跟新完成之后，直接返回保存成功就可以了
	 * produces="text/html;charset=UTF-8;" 可以指定返回的编码集。
	 * @param chcId
	 * @param salPlan
	 * @return
	 */
	@RequestMapping(value="/update",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String update(SalPlan salPlan){
		//把传递过来的salPlan保存到数据库中
		salePlanService.update(salPlan);
		return "保存成功";
	}
	
	/**
	 * 开发成功或者开发失败都会调用这个方法
	 * 成功是3，失败是4
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
