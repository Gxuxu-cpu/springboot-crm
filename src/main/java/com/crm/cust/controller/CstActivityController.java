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
	 * 需要查询交易记录的列表，以及用户？由于联系人页面显示的客户信息很少，
	 * 直接从列表页面把值传递过去,减少数据库的查询次数。
	 * @param cstCustomer
	 * @param model
	 * @return
	 */
	public String list(CstCustomer cstCustomer,Model model) {
		//交往记录列表查询
		List<CstActivity> activities = cstActivityService.findActivitiesByCustNo(cstCustomer.getCustNo());
		model.addAttribute("activities", activities);
		//把客户列表传递过来的参数直接放入model再次进行传递
		model.addAttribute("cstCustomer", cstCustomer);
		return "cust/cust/activities";
	}

	
	//跳转到交易记录添加页面
	//点击添加按钮的时候应该把 
	//客户的名称和编号同时传递到添加页面 =>model.addAttribute("cstCustomer", cstCustomer);
	//并且用隐藏域保存起来。
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
		//解决中文乱码的问题
		cstActivity.setAtvCustName(URLEncoder.encode(cstActivity.getAtvCustName(), "utf-8"));
		//解决传递客户信息的问题，客户id和客户名称，拼接到地址后面
		return "redirect:../activity/list?custNo="+cstActivity.getAtvCustNo()+"&custName="+cstActivity.getAtvCustName();
	}
	
	
	/**
	 * 点击更新按钮跳转到更新页面，根据id来查询即可=》形参中用lmkId接收即可
	 * 显示联系人信息
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
	 * 接收编辑页面传递来的linkman信息，调用通用方法的更新即可实现。
	 * @param model
	 * @param 
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/edit")
	public String edit(CstActivity cstActivity) throws UnsupportedEncodingException {
		cstActivityService.updateEntity(cstActivity);
		//解决中文乱码的问题
		cstActivity.setAtvCustName(URLEncoder.encode(cstActivity.getAtvCustName(), "utf-8"));
		//解决传递客户信息的问题，客户id和客户名称，拼接到地址后面
		return "redirect:../activity/list?custNo="+cstActivity.getAtvCustNo()+"&custName="+cstActivity.getAtvCustName();
	}
	
	/**
	 * <img onclick="to('../cstActivity/delete?lkmId=${cstActivity.lkmId}&lkmCustNo=${cstActivity.lkmCustNo}&lkmCustName=${cstActivity.lkmCustName}');" />
	 * 前台页面传递了三个参数
	 * lkmId用于删除
	 * lkmCustNo和lkmCustName用于页面的跳转
	 * @param cstActivity
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/delete")
	public String delete(CstActivity cstActivity) throws UnsupportedEncodingException {
		cstActivityService.deleteByPrimaryKey(cstActivity.getAtvId());
		//解决中文乱码的问题
		cstActivity.setAtvCustName(URLEncoder.encode(cstActivity.getAtvCustName(), "utf-8"));
		//解决传递客户信息的问题，客户id和客户名称，拼接到地址后面
		return "redirect:../activity/list?custNo="+cstActivity.getAtvCustNo()+"&custName="+cstActivity.getAtvCustName();
	}
}
