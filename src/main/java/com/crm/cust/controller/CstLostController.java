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
	//ʹ��pageInfo������״̬�µ���ʧ�ͻ�ȫ����������ٷ���pageInfo��ǰ̨��
	public String list(PageInfo<CstLost> pageInfo,CstLost cstLost,Model model) {
		pageInfo.setEntity(cstLost);
		PageInfo<CstLost> info = cstLostService.findListByPageInfo(pageInfo);
		model.addAttribute("pageInfo", info);
		//ǰ׺��WEB-INF/jsp/   .jsp
		return "cust/lost/list";
	}
	
	
	/**
	 * @RequestMapping���ƥ����url?value= {"toRelay","toDetail","toConfirm"}
	 * һ ���߼���ͼ
	 * �� ��ȡ����·�����ڽ����ж�=��request
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
	 * ����׷���ݻ�֮����ת���б�ҳ��
	 * @return
	 */
	@RequestMapping(value= {"relay"})
	public String relay(CstLost lost,String addRelay) {
		//׷���ݻ�����CstLost�����ԡ���ô���ܣ��¼�һ���������н���
		//�ݻ���ʩ = �ݻ���ʩ+<br/>+׷��;����ݻ���ʩ���ǿյ��ڽ���׷�ӣ�����������һ�����з������ݿ���
		if(addRelay.length()>0) {
			lost.setLstDelay(lost.getLstDelay()+"<br/>"+addRelay);
		}
		cstLostService.updateEntity(lost);
		return "redirect:../lost/list";
	}
	
	/**
	 * ����׷���ݻ�֮����ת���б�ҳ��
	 * @return
	 */
	@RequestMapping(value= {"confirm"})
	public String confirm(CstLost lost) {
		cstLostService.updateEntity(lost);
		return "redirect:../lost/list";
	}
	
}
