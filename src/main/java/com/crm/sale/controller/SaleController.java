package com.crm.sale.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.bean.SalChance;
import com.crm.bean.SysUser;
import com.crm.sale.service.ISaleService;
import com.crm.support.PageInfo;

@Controller
@RequestMapping("/sale")
public class SaleController {

	@Resource
	private ISaleService<SalChance> saleService;
	//private ISaleService saleService;
	
	/**
	 * 写一个条件分页查询的方法，来查询salChance
	 * springmvc会自动实现化形参
	 * 使用pageInfo接收参数，但是 private T entity;
	 * 向办法自己实例化，在set进去
	 * 
	 */
	@RequestMapping("list")
	public String list(PageInfo<SalChance> pageInfo,SalChance salChance,Model model) {
		salChance.setChcStatus("1");
		//因为形参中的pageInfo和salChance没有联系，需要手动的建立联系
		pageInfo.setEntity(salChance);
		PageInfo<SalChance> info = saleService.selectPageInfo(pageInfo);
		model.addAttribute("pageInfo", info);
		return "sale/list";  
	}
	
	@RequestMapping("devList")
	public String devList(PageInfo<SalChance> pageInfo,SalChance salChance,Model model) {
		//因为形参中的pageInfo和salChance没有联系，需要手动的建立联系
		pageInfo.setEntity(salChance);
		PageInfo<SalChance> info = saleService.selectPageInfo(pageInfo);
		model.addAttribute("pageInfo", info);
		return "sale/dev";  
	}
	
	/**
	 * 查询列表
	 * /WEB-INF/jsp/    .jsp
	 */
//	@RequestMapping("list")
//	public String list(Model model) {
//		List<SalChance> salChances = saleService.selectSalChance("1");
//		model.addAttribute("saleChanceLists", salChances);
//		return "sale/list";
//	}
	
	/**
	 * 跳转到更新界面  /sale/toEdit
	 * 更新页面需要显示销售机会信息，所以说仍然需要传值。
	 * 前端页面会传递一个id，销售机会的id，我们需要根据id进行查询
	 * 还需要在service中添加相关的方法
	 */
	@RequestMapping("toEdit")
	public String toEdit(Model model,Long chcId) {
		SalChance salChance = saleService.selectSalChanceById(chcId);
		//SalChance salChance = saleService.selectObjectById(chcId);
		//SalChance salChance = saleService.selectByPrimaryKey(chcId);
		//跳转到哪个页面？销售机会展示页面
		model.addAttribute("salChance", salChance);
		return "sale/edit";
	}
	
	/**
	 * 更新就需要传递对象了。SalChance 
	 * @param model
	 * @param chcId
	 * @return
	 */
	@RequestMapping("edit")
	public String edit(Model model,SalChance salChance) {
		saleService.updateSalChance(salChance);		
		return "redirect:../sale/list";
	}
	
	/**
	 * 删除就需要传递id了。SalChance 
	 * 匹配前端传递的 sale/delete
	 * 接收传递的id，
	 * 在调用删除方法
	 * @param chcId
	 * @return
	 */
	@RequestMapping("delete")
	public String delete(Long chcId) {
		saleService.deleteSalChance(chcId);
		return "redirect:/sale/list";  
	}
	
	/**
	 * 跳转到添加页面，返回逻辑视图，结合视图解析器进行跳转
	 * @param model
	 * @return
	 */
	@RequestMapping("toAdd")
	public String toAdd(Model model) {
		//为了时间的展示，把后台的时间传递到前端展示
		SalChance salChance = new SalChance();
		salChance.setChcCreateDate(new Date());
		model.addAttribute("salChance", salChance);
		return "sale/add";  
	}
	
	/**
	 * 接受add.jsp传递来的参数
	 * 并且把状态都设置成1
	 * @param salChance
	 * @return
	 */
	@RequestMapping("add")
	public String add(SalChance salChance) {
		salChance.setChcStatus("1");
		saleService.insert(salChance);
		return "redirect:/sale/list";  
	}
	
	
	//跳转到指派页面的方法
	@RequestMapping("toDispatch")
	public String toDispatch(Model model,Long chcId) {
		SalChance salChance = saleService.selectSalChanceById(chcId);
		//查询出role_id为3，也就是客户经理，放入model中，前端页面进行展示
		List<SysUser> users = saleService.findUsersByRoleId(3L);
		salChance.setChcDueDate(new Date());
		model.addAttribute("users", users);
		//如何在jsp页面中遍历users，并且拼接
		model.addAttribute("salChance", salChance);
		return "sale/dispatch";  
	}
	
	//指派给客户经理过后，状态需要发生改变，状态变为2
	@RequestMapping("dispatch")
	public String dispatch(SalChance salChance) {
		//应该先修改状态，再进行更新
		salChance.setChcStatus("2");
		saleService.updateSalChance(salChance);
		return "redirect:../sale/list";
	}
}
