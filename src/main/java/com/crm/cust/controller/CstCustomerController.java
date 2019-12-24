package com.crm.cust.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.bean.CstCustomer;
import com.crm.bean.SalChance;
import com.crm.cust.service.ICstCustomerService;
import com.crm.sale.service.ISaleService;
import com.crm.support.PageInfo;
import com.crm.support.StrUtil;

@Controller
@RequestMapping("/cust")
public class CstCustomerController {
	
	@Resource
	private ICstCustomerService cstCustomerService;
	
	@Resource
	private ISaleService<SalChance> saleService;
	
	@RequestMapping("/list")
	//使用pageInfo把所有状态下的客户全部查出来，再返回pageInfo到前台。
	public String list(PageInfo<CstCustomer> pageInfo,CstCustomer cstCustomer,Model model) {
		pageInfo.setEntity(cstCustomer);
		PageInfo<CstCustomer> info = cstCustomerService.findListByPageInfo(pageInfo);
		model.addAttribute("regionList", cstCustomerService.selectByParam("地区"));//企业客户等级
		model.addAttribute("levels", cstCustomerService.selectByParam("企业客户等级"));
		model.addAttribute("pageInfo", info);
		//前缀是WEB-INF/jsp/   .jsp
		return "cust/cust/list";
	}
	
	/**
	 * 跳转到添加页面，把地区列表，客户等级列表，客户经理都需要查出来。
	 * @param model
	 * @return
	 */
	@RequestMapping("/toAdd")
	public String toAdd(Model model) {
		//后台调用工具生成id，返回给添加页面
		CstCustomer cstCustomer= new CstCustomer();
		cstCustomer.setCustNo(StrUtil.createId("KH"));
		model.addAttribute("cstCustomer", cstCustomer);
		model.addAttribute("regionList", cstCustomerService.selectByParam("地区"));//企业客户等级
		model.addAttribute("levels", cstCustomerService.selectByParam("企业客户等级"));	
		//查询出客户经理列表，放到model中,指派的时候已经写过查询客户经理的方法
		model.addAttribute("managerList", saleService.findUsersByRoleId(3L));
		//前缀是WEB-INF/jsp/   .jsp
		return "cust/cust/add";
	}
	
	
	@RequestMapping("/add")
	public String add(Model model,CstCustomer cstCustomer) {
		cstCustomer.setCustStatus("1");
		//保存的逻辑
		cstCustomerService.saveEntity(cstCustomer);
		return "redirect:../cust/list";
	}
	
	
	/**
	 * 因为是编辑所有说会根据id查询对应的用户，所有一定需要传递一个id
	 * 跳转到编辑页面，把地区列表，客户等级列表，客户经理都需要查出来。
	 * @param model
	 * @return
	 */
	@RequestMapping("/toEdit")
	public String toEdit(Model model,String custNo) {
		//后台调用工具生成id，返回给添加页面
		CstCustomer cstCustomer= cstCustomerService.findEntityById(custNo);
		model.addAttribute("cstCustomer", cstCustomer);
		model.addAttribute("regionList", cstCustomerService.selectByParam("地区"));//企业客户等级
		model.addAttribute("levels", cstCustomerService.selectByParam("企业客户等级"));	
		//查询出客户经理列表，放到model中,指派的时候已经写过查询客户经理的方法
		model.addAttribute("managerList", saleService.findUsersByRoleId(3L));
		//前缀是WEB-INF/jsp/   .jsp
		return "cust/cust/edit";
	}
	
	
	@RequestMapping("/edit")
	public String edit(Model model,CstCustomer cstCustomer) {
		cstCustomer.setCustStatus("1");
		//保存的逻辑
		cstCustomerService.updateEntity(cstCustomer);
		return "redirect:../cust/list";
	}
	
	
	@RequestMapping("/delete")
	public String delete(String custNo) {
		//后台调用工具生成id，返回给添加页面
		cstCustomerService.deleteCustByCustNo(custNo);
		return "redirect:../cust/list";
	}
}
