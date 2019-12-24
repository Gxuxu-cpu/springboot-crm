package com.crm.service.controller;

import java.util.Date;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.crm.bean.CstService;
import com.crm.bean.SalChance;

import com.crm.sale.service.ISaleService;
import com.crm.service.service.ISvrService;
import com.crm.support.PageInfo;

@Controller
@RequestMapping("/service")
public class SvrController {

	@Resource
	private ISvrService<CstService> svrService;

	@Resource
	private ISaleService<SalChance> saleService;

	@RequestMapping("/list")
	public String list(PageInfo<CstService> pageInfo, CstService cstService, Model model,String ok) {
		pageInfo.setEntity(cstService);
		cstService.setSvrStatus("新创建");
		pageInfo.setOk(ok);
		PageInfo<CstService> info = svrService.findListByPageInfo(pageInfo);
		model.addAttribute("typeList", svrService.selectByParam("服务类型"));
		model.addAttribute("Statusl", svrService.selectByParam("状态"));
		// 查询出客户经理列表，放到model中,指派的时候已经写过查询客户经理的方法
		model.addAttribute("managerList", saleService.findUsersByRoleId(3L));
		cstService.setSvrDueDate(new Date());
		model.addAttribute("pageInfo", info);
		// 前缀是WEB-INF/jsp/ .jsp
		return "service/dispatch";
	}

	@RequestMapping("/deal")
	public String deal(PageInfo<CstService> pageInfo, CstService cstService, Model model,String ok) {
		pageInfo.setEntity(cstService);
		cstService.setSvrStatus("已分配");
		pageInfo.setOk(ok);
		PageInfo<CstService> info = svrService.findListByPageInfo(pageInfo);
		model.addAttribute("typeList", svrService.selectByParam("服务类型"));
		model.addAttribute("Statusl", svrService.selectByParam("状态"));
		model.addAttribute("pageInfo", info);
		// 前缀是WEB-INF/jsp/ .jsp
		return "service/deal";
	}

	@RequestMapping("/feedback")
	public String feedback(PageInfo<CstService> pageInfo, CstService cstService, Model model,String ok) {
		pageInfo.setEntity(cstService);
		cstService.setSvrStatus("已处理");
		pageInfo.setOk(ok);
		PageInfo<CstService> info = svrService.findListByPageInfo(pageInfo);
		model.addAttribute("typeList", svrService.selectByParam("服务类型"));
		model.addAttribute("Statusl", svrService.selectByParam("状态"));
		model.addAttribute("pageInfo", info);
		// 前缀是WEB-INF/jsp/ .jsp
		return "service/feedback";
	}
	
	@RequestMapping("/arch")
	public String arch(PageInfo<CstService> pageInfo, CstService cstService, Model model,String ok) {
		pageInfo.setEntity(cstService);
		pageInfo.setOk(ok);
		PageInfo<CstService> info = svrService.findListByPageInfo(pageInfo);
		model.addAttribute("typeList", svrService.selectByParam("服务类型"));
		model.addAttribute("Statusl", svrService.selectByParam("状态"));
		model.addAttribute("pageInfo", info);
		// 前缀是WEB-INF/jsp/ .jsp
		return "service/arch";
	}

	@RequestMapping("todetail")
	public String todetail(Model model, Long svrId) {
		CstService cstService = svrService.selectCstServiceById(svrId);
		// 跳转到哪个页面
		model.addAttribute("cstService", cstService);
		return "service/feedback_detail";
	}
	
	@RequestMapping("detail")
	public String detail(CstService cstService,HttpServletRequest request) {
		int sex =Integer.parseInt(request.getParameter("svrSatisfy"));
		if(sex>=3) {
			cstService.setSvrStatus("已归档");
		}else{
			cstService.setSvrStatus("已分配");
		}
		System.out.println(sex);
		svrService.updateCstService(cstService);
		return "redirect:../service/feedback";
	}
	
	
	@RequestMapping("toarch")
	public String toarch(Model model, Long svrId) {
		CstService cstService = svrService.selectCstServiceById(svrId);
		// 跳转到哪个页面
		model.addAttribute("cstService", cstService);
		return "service/detail";
	}
	
	@RequestMapping("toadd")
	public String toAdd(Model model) {
		// 为了时间的展示，把后台的时间传递到前端展示
		CstService cstService = new CstService();
		cstService.setSvrCreateDate(new Date());
		model.addAttribute("cstService", cstService);
		model.addAttribute("typeList", svrService.selectByParam("服务类型"));
		return "service/add";
	}

	/**
	 * 接受add.jsp传递来的参数
	 * 
	 * @param salChance
	 * @return
	 */
	@RequestMapping("add")
	public String add(CstService cstService) {
		svrService.insert(cstService);
		return "redirect:/service/toadd";
	}

	@RequestMapping("dispatch")
	public String dispatch(CstService cstService) {
		// 应该先修改状态，再进行更新
		cstService.setSvrStatus("已分配");
		cstService.setSvrDueDate(new Date());
		svrService.updateCstService(cstService);
		return "redirect:/service/list";
	}

	/**
	 * 跳转到更新界面 /sale/toEdit 更新页面需要显示销售机会信息，所以说仍然需要传值。
	 * 前端页面会传递一个id，销售机会的id，我们需要根据id进行查询 还需要在service中添加相关的方法
	 */
	@RequestMapping("toEdit")
	public String toEdit(Model model, Long svrId) {
		CstService cstService = svrService.selectCstServiceById(svrId);
		// 跳转到哪个页面？销售机会展示页面
		cstService.setSvrDealDate(new Date());
		model.addAttribute("cstService", cstService);
		return "service/deal_detail";
	}

	@RequestMapping("edit")
	public String edit(CstService cstService) {
		cstService.setSvrStatus("已处理");
		svrService.updateCstService(cstService);
		return "redirect:../service/deal";
	}

	@RequestMapping("delete")
	public String delete(Long svrId) {
		svrService.deleteCstService(svrId);
		return "redirect:/service/list";
	}
}
