package com.crm.basd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.crm.basd.service.IStorageService;
import com.crm.bean.Storage;
import com.crm.support.PageInfo;


@Controller
@RequestMapping("/storage")
public class StorageController {
	
	@Resource
	private IStorageService storageService;
	
	
	@RequestMapping("/list")
	//ʹ��pageInfo������״̬�µ��ֵ�����ȫ����������ٷ���pageInfo��ǰ̨��
	public String list(PageInfo<Storage> pageInfo,Storage storage,Model model) {
		pageInfo.setEntity(storage);
		PageInfo<Storage> info = storageService.findListByPageInfo(pageInfo);
		model.addAttribute("pageInfo", info);
		//ǰ׺��WEB-INF/jsp/   .jsp
		return "basd/storage";
	}
	
	
}
