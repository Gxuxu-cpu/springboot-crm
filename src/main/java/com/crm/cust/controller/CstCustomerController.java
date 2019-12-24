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
	//ʹ��pageInfo������״̬�µĿͻ�ȫ����������ٷ���pageInfo��ǰ̨��
	public String list(PageInfo<CstCustomer> pageInfo,CstCustomer cstCustomer,Model model) {
		pageInfo.setEntity(cstCustomer);
		PageInfo<CstCustomer> info = cstCustomerService.findListByPageInfo(pageInfo);
		model.addAttribute("regionList", cstCustomerService.selectByParam("����"));//��ҵ�ͻ��ȼ�
		model.addAttribute("levels", cstCustomerService.selectByParam("��ҵ�ͻ��ȼ�"));
		model.addAttribute("pageInfo", info);
		//ǰ׺��WEB-INF/jsp/   .jsp
		return "cust/cust/list";
	}
	
	/**
	 * ��ת�����ҳ�棬�ѵ����б��ͻ��ȼ��б��ͻ�������Ҫ�������
	 * @param model
	 * @return
	 */
	@RequestMapping("/toAdd")
	public String toAdd(Model model) {
		//��̨���ù�������id�����ظ����ҳ��
		CstCustomer cstCustomer= new CstCustomer();
		cstCustomer.setCustNo(StrUtil.createId("KH"));
		model.addAttribute("cstCustomer", cstCustomer);
		model.addAttribute("regionList", cstCustomerService.selectByParam("����"));//��ҵ�ͻ��ȼ�
		model.addAttribute("levels", cstCustomerService.selectByParam("��ҵ�ͻ��ȼ�"));	
		//��ѯ���ͻ������б��ŵ�model��,ָ�ɵ�ʱ���Ѿ�д����ѯ�ͻ�����ķ���
		model.addAttribute("managerList", saleService.findUsersByRoleId(3L));
		//ǰ׺��WEB-INF/jsp/   .jsp
		return "cust/cust/add";
	}
	
	
	@RequestMapping("/add")
	public String add(Model model,CstCustomer cstCustomer) {
		cstCustomer.setCustStatus("1");
		//������߼�
		cstCustomerService.saveEntity(cstCustomer);
		return "redirect:../cust/list";
	}
	
	
	/**
	 * ��Ϊ�Ǳ༭����˵�����id��ѯ��Ӧ���û�������һ����Ҫ����һ��id
	 * ��ת���༭ҳ�棬�ѵ����б��ͻ��ȼ��б��ͻ�������Ҫ�������
	 * @param model
	 * @return
	 */
	@RequestMapping("/toEdit")
	public String toEdit(Model model,String custNo) {
		//��̨���ù�������id�����ظ����ҳ��
		CstCustomer cstCustomer= cstCustomerService.findEntityById(custNo);
		model.addAttribute("cstCustomer", cstCustomer);
		model.addAttribute("regionList", cstCustomerService.selectByParam("����"));//��ҵ�ͻ��ȼ�
		model.addAttribute("levels", cstCustomerService.selectByParam("��ҵ�ͻ��ȼ�"));	
		//��ѯ���ͻ������б��ŵ�model��,ָ�ɵ�ʱ���Ѿ�д����ѯ�ͻ�����ķ���
		model.addAttribute("managerList", saleService.findUsersByRoleId(3L));
		//ǰ׺��WEB-INF/jsp/   .jsp
		return "cust/cust/edit";
	}
	
	
	@RequestMapping("/edit")
	public String edit(Model model,CstCustomer cstCustomer) {
		cstCustomer.setCustStatus("1");
		//������߼�
		cstCustomerService.updateEntity(cstCustomer);
		return "redirect:../cust/list";
	}
	
	
	@RequestMapping("/delete")
	public String delete(String custNo) {
		//��̨���ù�������id�����ظ����ҳ��
		cstCustomerService.deleteCustByCustNo(custNo);
		return "redirect:../cust/list";
	}
}
