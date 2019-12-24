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
	//使用pageInfo把所有状态下的字典数据全部查出来，再返回pageInfo到前台。
	public String list(PageInfo<BasDict> pageInfo,BasDict basDict,Model model) {
		pageInfo.setEntity(basDict);
		PageInfo<BasDict> info = basdService.findListByPageInfo(pageInfo);

		model.addAttribute("pageInfo", info);
		//前缀是WEB-INF/jsp/   .jsp
		return "basd/dict";
	}
	
	/**
	 * 跳转到添加页面，无需查询数据
	 * @param model
	 * @return
	 */
	@RequestMapping("/toAdd")
	public String toAdd(Model model) {
		return "basd/dictAdd";
	}
	
	/**
	 * 根据用户输入的值查询不同的type
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/distinctType")
	public String[] selectDistinctType(String type) {
		return basdService.selectDistinctType(type);
	}
	
	
	/**
	 * 接收页面传递的数据，保存到数据库
	 * 使用通用模块儿的保存方法进行数据保存
	 * 保存之后跳转到列表显示页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/add")
	public String add(BasDict basDict) {
		basdService.saveEntity(basDict);
		return "redirect:../basd/list";
	}
	
	/**
	 * 跳转到编辑页面，需要查询数据=>根据id(使用形参来接收id)
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
	 * 删除
	 * @param dictId
	 * @return
	 */
	@RequestMapping("/delete")
	public String delete(Long dictId) {
		basdService.deleteByPrimaryKey(dictId);
		return "redirect:../basd/list";
	}
	
}
