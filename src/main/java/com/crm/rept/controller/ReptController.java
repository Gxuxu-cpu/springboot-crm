package com.crm.rept.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.basd.service.IBasdService;
import com.crm.bean.BasDict;
import com.crm.bean.CstLost;
import com.crm.cust.service.ICstLostService;
import com.crm.support.PageInfo;




@Controller
@RequestMapping("/rept")
public class ReptController {
	
	@Resource
	private IBasdService basdService;
	
	@Resource
	private ICstLostService cstLostService;
	
	@RequestMapping("cons")
	public String cons(Model model) {
		List<BasDict> basDict  = basdService.findBasDict();
		model.addAttribute("basDictList", basdService.selectByParam("企业客户等级"));
		model.addAttribute("basDictLists", basDict);
		return "rept/cons";
	}
	
	@RequestMapping("ser")
	public String ser(PageInfo<BasDict> pageInfo,BasDict basDict,Model model) {
		pageInfo.setEntity(basDict);// 放入查询条件
		pageInfo.setPageSize(20);
		PageInfo<BasDict> info = basdService.findListByPageInfo(pageInfo);
		model.addAttribute("fuwulist", basdService.selectByParam("服务类型"));
		model.addAttribute("pageInfo", info);
		return "rept/ser";
	}
	@RequestMapping("lost")
	public String lost(PageInfo<CstLost> pageInfo,CstLost cstLost,Model model) {
		pageInfo.setEntity(cstLost);
		pageInfo.setPageSize(20);
		PageInfo<CstLost> info = cstLostService.findListByPageInfo(pageInfo);
		model.addAttribute("pageInfo", info);
		//前缀是WEB-INF/jsp/   .jsp
		return "rept/lost";
	}
}
