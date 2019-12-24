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
		cstService.setSvrStatus("�´���");
		pageInfo.setOk(ok);
		PageInfo<CstService> info = svrService.findListByPageInfo(pageInfo);
		model.addAttribute("typeList", svrService.selectByParam("��������"));
		model.addAttribute("Statusl", svrService.selectByParam("״̬"));
		// ��ѯ���ͻ������б��ŵ�model��,ָ�ɵ�ʱ���Ѿ�д����ѯ�ͻ�����ķ���
		model.addAttribute("managerList", saleService.findUsersByRoleId(3L));
		cstService.setSvrDueDate(new Date());
		model.addAttribute("pageInfo", info);
		// ǰ׺��WEB-INF/jsp/ .jsp
		return "service/dispatch";
	}

	@RequestMapping("/deal")
	public String deal(PageInfo<CstService> pageInfo, CstService cstService, Model model,String ok) {
		pageInfo.setEntity(cstService);
		cstService.setSvrStatus("�ѷ���");
		pageInfo.setOk(ok);
		PageInfo<CstService> info = svrService.findListByPageInfo(pageInfo);
		model.addAttribute("typeList", svrService.selectByParam("��������"));
		model.addAttribute("Statusl", svrService.selectByParam("״̬"));
		model.addAttribute("pageInfo", info);
		// ǰ׺��WEB-INF/jsp/ .jsp
		return "service/deal";
	}

	@RequestMapping("/feedback")
	public String feedback(PageInfo<CstService> pageInfo, CstService cstService, Model model,String ok) {
		pageInfo.setEntity(cstService);
		cstService.setSvrStatus("�Ѵ���");
		pageInfo.setOk(ok);
		PageInfo<CstService> info = svrService.findListByPageInfo(pageInfo);
		model.addAttribute("typeList", svrService.selectByParam("��������"));
		model.addAttribute("Statusl", svrService.selectByParam("״̬"));
		model.addAttribute("pageInfo", info);
		// ǰ׺��WEB-INF/jsp/ .jsp
		return "service/feedback";
	}
	
	@RequestMapping("/arch")
	public String arch(PageInfo<CstService> pageInfo, CstService cstService, Model model,String ok) {
		pageInfo.setEntity(cstService);
		pageInfo.setOk(ok);
		PageInfo<CstService> info = svrService.findListByPageInfo(pageInfo);
		model.addAttribute("typeList", svrService.selectByParam("��������"));
		model.addAttribute("Statusl", svrService.selectByParam("״̬"));
		model.addAttribute("pageInfo", info);
		// ǰ׺��WEB-INF/jsp/ .jsp
		return "service/arch";
	}

	@RequestMapping("todetail")
	public String todetail(Model model, Long svrId) {
		CstService cstService = svrService.selectCstServiceById(svrId);
		// ��ת���ĸ�ҳ��
		model.addAttribute("cstService", cstService);
		return "service/feedback_detail";
	}
	
	@RequestMapping("detail")
	public String detail(CstService cstService,HttpServletRequest request) {
		int sex =Integer.parseInt(request.getParameter("svrSatisfy"));
		if(sex>=3) {
			cstService.setSvrStatus("�ѹ鵵");
		}else{
			cstService.setSvrStatus("�ѷ���");
		}
		System.out.println(sex);
		svrService.updateCstService(cstService);
		return "redirect:../service/feedback";
	}
	
	
	@RequestMapping("toarch")
	public String toarch(Model model, Long svrId) {
		CstService cstService = svrService.selectCstServiceById(svrId);
		// ��ת���ĸ�ҳ��
		model.addAttribute("cstService", cstService);
		return "service/detail";
	}
	
	@RequestMapping("toadd")
	public String toAdd(Model model) {
		// Ϊ��ʱ���չʾ���Ѻ�̨��ʱ�䴫�ݵ�ǰ��չʾ
		CstService cstService = new CstService();
		cstService.setSvrCreateDate(new Date());
		model.addAttribute("cstService", cstService);
		model.addAttribute("typeList", svrService.selectByParam("��������"));
		return "service/add";
	}

	/**
	 * ����add.jsp�������Ĳ���
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
		// Ӧ�����޸�״̬���ٽ��и���
		cstService.setSvrStatus("�ѷ���");
		cstService.setSvrDueDate(new Date());
		svrService.updateCstService(cstService);
		return "redirect:/service/list";
	}

	/**
	 * ��ת�����½��� /sale/toEdit ����ҳ����Ҫ��ʾ���ۻ�����Ϣ������˵��Ȼ��Ҫ��ֵ��
	 * ǰ��ҳ��ᴫ��һ��id�����ۻ����id��������Ҫ����id���в�ѯ ����Ҫ��service�������صķ���
	 */
	@RequestMapping("toEdit")
	public String toEdit(Model model, Long svrId) {
		CstService cstService = svrService.selectCstServiceById(svrId);
		// ��ת���ĸ�ҳ�棿���ۻ���չʾҳ��
		cstService.setSvrDealDate(new Date());
		model.addAttribute("cstService", cstService);
		return "service/deal_detail";
	}

	@RequestMapping("edit")
	public String edit(CstService cstService) {
		cstService.setSvrStatus("�Ѵ���");
		svrService.updateCstService(cstService);
		return "redirect:../service/deal";
	}

	@RequestMapping("delete")
	public String delete(Long svrId) {
		svrService.deleteCstService(svrId);
		return "redirect:/service/list";
	}
}
