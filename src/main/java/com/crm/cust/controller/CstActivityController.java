package com.crm.cust.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.bean.CstActivity;
import com.crm.bean.CstCustomer;
import com.crm.bean.CstLinkman;
import com.crm.cust.service.ICstActivityService;



@Controller
@RequestMapping("/activity")
public class CstActivityController {
	
	@Resource
	private ICstActivityService cstActivityService;
	
	@RequestMapping("/list")
	/**
	 * ��Ҫ��ѯ���׼�¼���б��Լ��û���������ϵ��ҳ����ʾ�Ŀͻ���Ϣ���٣�
	 * ֱ�Ӵ��б�ҳ���ֵ���ݹ�ȥ,�������ݿ�Ĳ�ѯ������
	 * @param cstCustomer
	 * @param model
	 * @return
	 */
	public String list(CstCustomer cstCustomer,Model model) {
		//������¼�б��ѯ
		List<CstActivity> activities = cstActivityService.findActivitiesByCustNo(cstCustomer.getCustNo());
		model.addAttribute("activities", activities);
		//�ѿͻ��б��ݹ����Ĳ���ֱ�ӷ���model�ٴν��д���
		model.addAttribute("cstCustomer", cstCustomer);
		return "cust/cust/activities";
	}

	
	//��ת�����׼�¼���ҳ��
	//�����Ӱ�ť��ʱ��Ӧ�ð� 
	//�ͻ������ƺͱ��ͬʱ���ݵ����ҳ�� =>model.addAttribute("cstCustomer", cstCustomer);
	//�����������򱣴�������
	@RequestMapping("/toAdd")
	public String toAdd(Model model,CstCustomer cstCustomer) {		
		model.addAttribute("cstCustomer", cstCustomer);
		return "cust/cust/activities_add";
	}
	
	/**
	 * 
	 * @param model
	 * @param 
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/add")
	public String add(Model model,CstActivity cstActivity) throws UnsupportedEncodingException {
		cstActivityService.saveEntity(cstActivity);
		//����������������
		cstActivity.setAtvCustName(URLEncoder.encode(cstActivity.getAtvCustName(), "utf-8"));
		//������ݿͻ���Ϣ�����⣬�ͻ�id�Ϳͻ����ƣ�ƴ�ӵ���ַ����
		return "redirect:../activity/list?custNo="+cstActivity.getAtvCustNo()+"&custName="+cstActivity.getAtvCustName();
	}
	
	
	/**
	 * ������°�ť��ת������ҳ�棬����id����ѯ����=���β�����lmkId���ռ���
	 * ��ʾ��ϵ����Ϣ
	 * @param model
	 * @param cstCustomer
	 * @return
	 */
	@RequestMapping("/toEdit")
	public String toEdit(Model model,Long atvId) {		
		model.addAttribute("cstActivity", cstActivityService.findEntityById(atvId));
		return "cust/cust/activities_edit";
	}
	
	
	/**
	 * ���ձ༭ҳ�洫������linkman��Ϣ������ͨ�÷����ĸ��¼���ʵ�֡�
	 * @param model
	 * @param 
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/edit")
	public String edit(CstActivity cstActivity) throws UnsupportedEncodingException {
		cstActivityService.updateEntity(cstActivity);
		//����������������
		cstActivity.setAtvCustName(URLEncoder.encode(cstActivity.getAtvCustName(), "utf-8"));
		//������ݿͻ���Ϣ�����⣬�ͻ�id�Ϳͻ����ƣ�ƴ�ӵ���ַ����
		return "redirect:../activity/list?custNo="+cstActivity.getAtvCustNo()+"&custName="+cstActivity.getAtvCustName();
	}
	
	/**
	 * <img onclick="to('../cstActivity/delete?lkmId=${cstActivity.lkmId}&lkmCustNo=${cstActivity.lkmCustNo}&lkmCustName=${cstActivity.lkmCustName}');" />
	 * ǰ̨ҳ�洫������������
	 * lkmId����ɾ��
	 * lkmCustNo��lkmCustName����ҳ�����ת
	 * @param cstActivity
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/delete")
	public String delete(CstActivity cstActivity) throws UnsupportedEncodingException {
		cstActivityService.deleteByPrimaryKey(cstActivity.getAtvId());
		//����������������
		cstActivity.setAtvCustName(URLEncoder.encode(cstActivity.getAtvCustName(), "utf-8"));
		//������ݿͻ���Ϣ�����⣬�ͻ�id�Ϳͻ����ƣ�ƴ�ӵ���ַ����
		return "redirect:../activity/list?custNo="+cstActivity.getAtvCustNo()+"&custName="+cstActivity.getAtvCustName();
	}
}
