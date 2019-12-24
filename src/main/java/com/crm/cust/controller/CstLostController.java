package com.crm.cust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.crm.bean.CstLost;
import com.crm.cust.service.ICstLostService;
import com.crm.support.PageInfo;


@Controller
@RequestMapping("/lost")
public class CstLostController {
	
	@Resource
	private ICstLostService cstLostService;
	
	
	@RequestMapping("/list")
	//使用pageInfo把所有状态下的流失客户全部查出来，再返回pageInfo到前台。
	public String list(PageInfo<CstLost> pageInfo,CstLost cstLost,Model model) {
		pageInfo.setEntity(cstLost);
		PageInfo<CstLost> info = cstLostService.findListByPageInfo(pageInfo);
		model.addAttribute("pageInfo", info);
		//前缀是WEB-INF/jsp/   .jsp
		return "cust/lost/list";
	}
	
	
	/**
	 * @RequestMapping如何匹配多个url?value= {"toRelay","toDetail","toConfirm"}
	 * 一 传逻辑视图
	 * 二 获取请求路径，在进行判断=》request
	 * @param lstId
	 * @param model
	 * @return
	 */
	@RequestMapping(value= {"toRelay","toDetail","toConfirm"})
	public String toRelay(Long lstId,Model model,String page,HttpServletRequest request) {
		model.addAttribute("lost", cstLostService.findEntityById(lstId));
//		String requestURI = request.getRequestURI().toString();
//		System.out.println(requestURI);
//		if(requestURI.contains("lay")) {
//			return "cust/lost/relay";
//		}else if(requestURI.contains("tail")) {
//			return "cust/lost/detail";
//		}else {
//			return "cust/lost/confirm";
//		}
		return "cust/lost/"+page;
	}
	
	/**
	 * 更新追加暂缓之后，跳转到列表页面
	 * @return
	 */
	@RequestMapping(value= {"relay"})
	public String relay(CstLost lost,String addRelay) {
		//追加暂缓不是CstLost的属性。怎么接受？新加一个参数进行接收
		//暂缓措施 = 暂缓措施+<br/>+追加;如果暂缓措施不是空的在进行追加，否则会多增加一个换行符到数据库中
		if(addRelay.length()>0) {
			lost.setLstDelay(lost.getLstDelay()+"<br/>"+addRelay);
		}
		cstLostService.updateEntity(lost);
		return "redirect:../lost/list";
	}
	
	/**
	 * 更新追加暂缓之后，跳转到列表页面
	 * @return
	 */
	@RequestMapping(value= {"confirm"})
	public String confirm(CstLost lost) {
		cstLostService.updateEntity(lost);
		return "redirect:../lost/list";
	}
	
}
