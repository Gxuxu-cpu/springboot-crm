package com.crm.basd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.basd.service.IBasdService;
import com.crm.bean.BasDict;
import com.crm.bean.CstCustomer;
import com.crm.bean.SalChance;
import com.crm.cust.service.ICstCustomerService;
import com.crm.sale.service.ISaleService;
import com.crm.support.PageInfo;
import com.crm.support.StrUtil;

@Controller
@RequestMapping("/basd")
public class BasdController {
	
	@Resource
	private IBasdService basdService;
	
	
	@RequestMapping("/list")
	//ʹ��pageInfo������״̬�µ��ֵ�����ȫ����������ٷ���pageInfo��ǰ̨��
	public String list(PageInfo<BasDict> pageInfo,BasDict basDict,Model model) {
		pageInfo.setEntity(basDict);
		PageInfo<BasDict> info = basdService.findListByPageInfo(pageInfo);

		model.addAttribute("pageInfo", info);
		//ǰ׺��WEB-INF/jsp/   .jsp
		return "basd/dict";
	}
	
	/**
	 * ��ת�����ҳ�棬�����ѯ����
	 * @param model
	 * @return
	 */
	@RequestMapping("/toAdd")
	public String toAdd(Model model) {
		return "basd/dictAdd";
	}
	
	/**
	 * �����û������ֵ��ѯ��ͬ��type
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/distinctType")
	public String[] selectDistinctType(String type) {
		return basdService.selectDistinctType(type);
	}
	
	
	/**
	 * ����ҳ�洫�ݵ����ݣ����浽���ݿ�
	 * ʹ��ͨ��ģ����ı��淽���������ݱ���
	 * ����֮����ת���б���ʾҳ��
	 * @param model
	 * @return
	 */
	@RequestMapping("/add")
	public String add(BasDict basDict) {
		basdService.saveEntity(basDict);
		return "redirect:../basd/list";
	}
	
	/**
	 * ��ת���༭ҳ�棬��Ҫ��ѯ����=>����id(ʹ���β�������id)
	 */
	@RequestMapping("/toEdit")
	public String toEdit(Long dictId,Model model) {
		model.addAttribute("dict", basdService.findEntityById(dictId));
		return "basd/dictEdit";
	}
	
	@RequestMapping("/edit")
	public String edit(BasDict basDict) {
		basdService.updateEntity(basDict);
		return "redirect:../basd/list";
	}
	
	/**
	 * ɾ��
	 * @param dictId
	 * @return
	 */
	@RequestMapping("/delete")
	public String delete(Long dictId) {
		basdService.deleteByPrimaryKey(dictId);
		return "redirect:../basd/list";
	}
	
}
