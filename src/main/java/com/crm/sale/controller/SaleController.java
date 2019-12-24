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
	 * дһ��������ҳ��ѯ�ķ���������ѯsalChance
	 * springmvc���Զ�ʵ�ֻ��β�
	 * ʹ��pageInfo���ղ��������� private T entity;
	 * ��취�Լ�ʵ��������set��ȥ
	 * 
	 */
	@RequestMapping("list")
	public String list(PageInfo<SalChance> pageInfo,SalChance salChance,Model model) {
		salChance.setChcStatus("1");
		//��Ϊ�β��е�pageInfo��salChanceû����ϵ����Ҫ�ֶ��Ľ�����ϵ
		pageInfo.setEntity(salChance);
		PageInfo<SalChance> info = saleService.selectPageInfo(pageInfo);
		model.addAttribute("pageInfo", info);
		return "sale/list";  
	}
	
	@RequestMapping("devList")
	public String devList(PageInfo<SalChance> pageInfo,SalChance salChance,Model model) {
		//��Ϊ�β��е�pageInfo��salChanceû����ϵ����Ҫ�ֶ��Ľ�����ϵ
		pageInfo.setEntity(salChance);
		PageInfo<SalChance> info = saleService.selectPageInfo(pageInfo);
		model.addAttribute("pageInfo", info);
		return "sale/dev";  
	}
	
	/**
	 * ��ѯ�б�
	 * /WEB-INF/jsp/    .jsp
	 */
//	@RequestMapping("list")
//	public String list(Model model) {
//		List<SalChance> salChances = saleService.selectSalChance("1");
//		model.addAttribute("saleChanceLists", salChances);
//		return "sale/list";
//	}
	
	/**
	 * ��ת�����½���  /sale/toEdit
	 * ����ҳ����Ҫ��ʾ���ۻ�����Ϣ������˵��Ȼ��Ҫ��ֵ��
	 * ǰ��ҳ��ᴫ��һ��id�����ۻ����id��������Ҫ����id���в�ѯ
	 * ����Ҫ��service�������صķ���
	 */
	@RequestMapping("toEdit")
	public String toEdit(Model model,Long chcId) {
		SalChance salChance = saleService.selectSalChanceById(chcId);
		//SalChance salChance = saleService.selectObjectById(chcId);
		//SalChance salChance = saleService.selectByPrimaryKey(chcId);
		//��ת���ĸ�ҳ�棿���ۻ���չʾҳ��
		model.addAttribute("salChance", salChance);
		return "sale/edit";
	}
	
	/**
	 * ���¾���Ҫ���ݶ����ˡ�SalChance 
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
	 * ɾ������Ҫ����id�ˡ�SalChance 
	 * ƥ��ǰ�˴��ݵ� sale/delete
	 * ���մ��ݵ�id��
	 * �ڵ���ɾ������
	 * @param chcId
	 * @return
	 */
	@RequestMapping("delete")
	public String delete(Long chcId) {
		saleService.deleteSalChance(chcId);
		return "redirect:/sale/list";  
	}
	
	/**
	 * ��ת�����ҳ�棬�����߼���ͼ�������ͼ������������ת
	 * @param model
	 * @return
	 */
	@RequestMapping("toAdd")
	public String toAdd(Model model) {
		//Ϊ��ʱ���չʾ���Ѻ�̨��ʱ�䴫�ݵ�ǰ��չʾ
		SalChance salChance = new SalChance();
		salChance.setChcCreateDate(new Date());
		model.addAttribute("salChance", salChance);
		return "sale/add";  
	}
	
	/**
	 * ����add.jsp�������Ĳ���
	 * ���Ұ�״̬�����ó�1
	 * @param salChance
	 * @return
	 */
	@RequestMapping("add")
	public String add(SalChance salChance) {
		salChance.setChcStatus("1");
		saleService.insert(salChance);
		return "redirect:/sale/list";  
	}
	
	
	//��ת��ָ��ҳ��ķ���
	@RequestMapping("toDispatch")
	public String toDispatch(Model model,Long chcId) {
		SalChance salChance = saleService.selectSalChanceById(chcId);
		//��ѯ��role_idΪ3��Ҳ���ǿͻ���������model�У�ǰ��ҳ�����չʾ
		List<SysUser> users = saleService.findUsersByRoleId(3L);
		salChance.setChcDueDate(new Date());
		model.addAttribute("users", users);
		//�����jspҳ���б���users������ƴ��
		model.addAttribute("salChance", salChance);
		return "sale/dispatch";  
	}
	
	//ָ�ɸ��ͻ��������״̬��Ҫ�����ı䣬״̬��Ϊ2
	@RequestMapping("dispatch")
	public String dispatch(SalChance salChance) {
		//Ӧ�����޸�״̬���ٽ��и���
		salChance.setChcStatus("2");
		saleService.updateSalChance(salChance);
		return "redirect:../sale/list";
	}
}
