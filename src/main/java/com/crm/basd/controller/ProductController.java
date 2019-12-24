package com.crm.basd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.basd.service.IBasdService;
import com.crm.basd.service.IProductService;
import com.crm.bean.BasDict;
import com.crm.bean.CstCustomer;
import com.crm.bean.Product;
import com.crm.bean.SalChance;
import com.crm.cust.service.ICstCustomerService;
import com.crm.sale.service.ISaleService;
import com.crm.support.PageInfo;
import com.crm.support.StrUtil;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Resource
	private IProductService productService;
	
	
	@RequestMapping("/list")
	//ʹ��pageInfo������״̬�µ��ֵ�����ȫ����������ٷ���pageInfo��ǰ̨��
	public String list(PageInfo<Product> pageInfo,Product product,Model model) {
		pageInfo.setEntity(product);
		PageInfo<Product> info = productService.findListByPageInfo(pageInfo);

		model.addAttribute("pageInfo", info);
		//ǰ׺��WEB-INF/jsp/   .jsp
		return "basd/product";
	}
	
	
}
