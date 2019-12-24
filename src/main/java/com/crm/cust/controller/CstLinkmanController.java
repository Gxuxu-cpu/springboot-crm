package com.crm.cust.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.bean.CstCustomer;
import com.crm.bean.CstLinkman;

import com.crm.cust.service.ICstLinkmanService;
import com.crm.support.StrUtil;


@Controller
@RequestMapping("/linkman")
public class CstLinkmanController {
	
	@Resource
	private ICstLinkmanService cstLinkmanService;
	
	@RequestMapping("/list")
	/**
	 * ��Ҫ��ѯl��ϵ�˵��б��Լ��û���������ϵ��ҳ����ʾ�Ŀͻ���Ϣ���٣�
	 * ֱ�Ӵ��б�ҳ���ֵ���ݹ�ȥ,�������ݿ�Ĳ�ѯ������
	 * @param cstCustomer
	 * @param model
	 * @return
	 */
	public String list(CstCustomer cstCustomer,Model model) {
		//��ϵ���б��ѯ
		List<CstLinkman> linkmans = cstLinkmanService.findLinkmansByCustNo(cstCustomer.getCustNo());
		model.addAttribute("linkmans", linkmans);
		//�ѿͻ��б��ݹ����Ĳ���ֱ�ӷ���model�ٴν��д���
		model.addAttribute("cstCustomer", cstCustomer);
		return "cust/cust/linkman";
	}
	
	
	//��ת����ϵ�����ҳ��
	//�����Ӱ�ť��ʱ��Ӧ�ð� 
	//�ͻ������ƺͱ��ͬʱ���ݵ����ҳ�� =>model.addAttribute("cstCustomer", cstCustomer);
	//�����������򱣴�������
	@RequestMapping("/toAdd")
	public String toAdd(Model model,CstCustomer cstCustomer) {		
		model.addAttribute("cstCustomer", cstCustomer);
		return "cust/cust/linkman_add";
	}
	
	
	/**
	 * 
	 * @param model
	 * @param 
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/add")
	public String add(Model model,CstLinkman linkman) throws UnsupportedEncodingException {
		cstLinkmanService.saveEntity(linkman);
		//����������������
		linkman.setLkmCustName(URLEncoder.encode(linkman.getLkmCustName(), "utf-8"));
		//������ݿͻ���Ϣ�����⣬�ͻ�id�Ϳͻ����ƣ�ƴ�ӵ���ַ����
		return "redirect:../linkman/list?custNo="+linkman.getLkmCustNo()+"&custName="+linkman.getLkmCustName();
	}
	
	
	/**
	 * ������°�ť��ת������ҳ�棬����id����ѯ����=���β�����lmkId���ռ���
	 * ��ʾ��ϵ����Ϣ
	 * @param model
	 * @param cstCustomer
	 * @return
	 */
	@RequestMapping("/toEdit")
	public String toEdit(Model model,Long lkmId) {		
		model.addAttribute("linkman", cstLinkmanService.findEntityById(lkmId));
		return "cust/cust/linkman_edit";
	}
	
	
	/**
	 * ���ձ༭ҳ�洫������linkman��Ϣ������ͨ�÷����ĸ��¼���ʵ�֡�
	 * @param model
	 * @param 
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/edit")
	public String edit(CstLinkman linkman) throws UnsupportedEncodingException {
		cstLinkmanService.updateEntity(linkman);
		//����������������
		linkman.setLkmCustName(URLEncoder.encode(linkman.getLkmCustName(), "utf-8"));
		//������ݿͻ���Ϣ�����⣬�ͻ�id�Ϳͻ����ƣ�ƴ�ӵ���ַ����
		return "redirect:../linkman/list?custNo="+linkman.getLkmCustNo()+"&custName="+linkman.getLkmCustName();
	}
	
	/**
	 * <img onclick="to('../linkman/delete?lkmId=${linkman.lkmId}&lkmCustNo=${linkman.lkmCustNo}&lkmCustName=${linkman.lkmCustName}');" />
	 * ǰ̨ҳ�洫������������
	 * lkmId����ɾ��
	 * lkmCustNo��lkmCustName����ҳ�����ת
	 * @param linkman
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/delete")
	public String delete(CstLinkman linkman) throws UnsupportedEncodingException {
		cstLinkmanService.deleteByPrimaryKey(linkman.getLkmId());
		//����������������
		linkman.setLkmCustName(URLEncoder.encode(linkman.getLkmCustName(), "utf-8"));
		//������ݿͻ���Ϣ�����⣬�ͻ�id�Ϳͻ����ƣ�ƴ�ӵ���ַ����
		return "redirect:../linkman/list?custNo="+linkman.getLkmCustNo()+"&custName="+linkman.getLkmCustName();
	}
}
