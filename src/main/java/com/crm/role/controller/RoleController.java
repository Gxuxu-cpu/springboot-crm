package com.crm.role.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.bean.SysRight;
import com.crm.bean.SysRole;
import com.crm.bean.SysUser;
import com.crm.role.service.IRightService;
import com.crm.role.service.IRoleRightService;
import com.crm.role.service.IRoleService;
import com.crm.user.service.IUserService;

@Controller
@RequestMapping("role")
public class RoleController {

	@Resource
	private IUserService userService;
	
	@Resource
	private IRoleService roleService;
	
	@Resource
	private IRightService rightService;
	
	@Resource
	private IRoleRightService roleRightService;
	
	/**
	 * 用户列表展示的方法，联表查询用户的相关信息，把列表传递到前端进行展示
	 */
	@RequestMapping("userList") // role/userList
	public String userList(Model model) {
		//查询用户应该用userService
		List<SysUser> userList = userService.findAllUsers();
		model.addAttribute("userList", userList);
		return "role/user/list";
	}
	
	/**
	 * 跳转用户添加页面的方法，需要查询角色列表
	 */
	@RequestMapping("toUserAdd") // role/userList
	public String toUserAdd(Model model) {
		//查询角色应该用roleService
		List<SysRole> roleList = roleService.findAllRoles();
		model.addAttribute("roleList", roleList);
		return "role/user/add";
	}
	
	/**
	 * 用户添加添加需要接收SysUser
	 */
	@RequestMapping("userAdd") // role/userList
	public String userAdd(SysUser user) {
		//使用通用的方法进行用户添加=>给IUserService以及实现类添加通用模块儿的配置
		userService.saveEntity(user);
		//添加完成之后重定向到列表的action
		return "redirect:../role/userList";
	}
	
	/**
	 * 跳转用户编辑页面的方法，需要查询角色列表，还需要显示用户信息。
	 */
	@RequestMapping("toUserEdit") // role/userList
	public String toUserEdit(Long usrId,Model model) {
		
		//查询角色应该用roleService
		List<SysRole> roleList = roleService.findAllRoles();
		model.addAttribute("roleList", roleList);
		model.addAttribute("sysUser", userService.findEntityById(usrId));
		return "role/user/edit";
	}
	
	/**
	 * 用户编辑接收SysUser
	 */
	@RequestMapping("userEdit") // role/userList
	public String userEdit(SysUser user) {
		//使用通用的方法进行用户添加=>给IUserService以及实现类添加通用模块儿的配置
		userService.updateEntity(user);
		//添加完成之后重定向到列表的action
		return "redirect:../role/userList";
	}
	
	/**
	 * 根据Id进行删除
	 */
	@RequestMapping("userDelete") // role/userList
	public String userDelete(Long usrId) {
		//使用通用的方法进行用户删除=>给IUserService以及实现类添加通用模块儿的配置
		userService.deleteByPrimaryKey(usrId);
		//添加完成之后重定向到列表的action
		return "redirect:../role/userList";
	}
	
	
	/**
	 * 
	 * 下面是角色相关的操作
	 * ===============================================================
	 * 
	 * 
	 */
	/**
	 * 角色列表展示的方法，单表查询所有的角色
	 */
	@RequestMapping("roleList") // role/roleList
	public String roleList(Model model) {
		//查询角色应该用roleService
		List<SysRole> roleList = roleService.findAllRoles();
		model.addAttribute("roleList", roleList);
		return "role/role/list";
	}
	
	/**
	 * 跳转角色添加页面，无需查询
	 */
	@RequestMapping("toRoleAdd") // role/userList
	public String toRoleAdd(Model model) {
		return "role/role/add";
	}
	
	/**
	 * 角色添加添加需要接收SysRole
	 */
	@RequestMapping("roleAdd") // role/userList
	public String roleAdd(SysRole role) {
		//使用通用的方法进行角色添加=>给IRoleService以及实现类添加通用模块儿的配置
		roleService.saveEntity(role);
		//添加完成之后重定向到列表的action
		return "redirect:../role/roleList";
	}
	
	/**
	 * 跳转角色编辑页面的方法，需要显示角色信息。
	 */
	@RequestMapping("toRoleEdit") // role/userList
	public String toRoleEdit(Long roleId,Model model) {	
		model.addAttribute("sysRole", roleService.findEntityById(roleId));
		return "role/role/edit";
	}
	
	/**
	 * 用户编辑接收SysUser
	 */
	@RequestMapping("roleEdit") // role/userList
	public String roleEdit(SysRole role) {
		//使用通用的方法进行角色修改=>给IUserService以及实现类添加通用模块儿的配置
		roleService.updateEntity(role);
		//添加完成之后重定向到列表的action
		return "redirect:../role/roleList";
	}
	
	
	//=========================跳转到用户分配页面
	/**
	 * 跳转到角色分配页面
		1 查询角色
		2 查询所有的权限列表=》可以按需显示菜单
		3 查询角色所对应的权限 = 》生成选中的复选框
		。
	 */
	@RequestMapping("toRoleManage") // role/userList
	public String toRoleManage(Long roleId,Model model) {	
		model.addAttribute("sysRole", roleService.findEntityById(roleId));
		//查询所有的权限 sysRight
		model.addAttribute("sysRightList", rightService.findAllRights());
		//查询roleId在sys_role_right表中对应的权限=》对应的权限被选中=》SELECT * FROM `sys_role_right` WHERE rf_role_id = 5
		model.addAttribute("sysRoleRightList", roleRightService.findRightsByRoleId(roleId));
		return "role/role/manage";
	}
	
	/**
	 *  角色权限分配页面
	     接收前台传递的角色id，和权限列表，先删除roleid对应的老权限，把新的权限添加到数据库中取
	 */
	@RequestMapping("roleManage") // role/userList
	public String roleManage(Long roleId,String[] selectedRights,Model model) {	
		//不要在controller中写过多的逻辑处理
		//删除和添加都是对sys_role_right表进行的操作。=》SysRoleRightService
		roleRightService.manage(roleId,selectedRights);
		return "redirect:../role/roleList";
	}
	
	/**
	 * 先删用户表
		再删角色权限表
		最后再删角色表
	 */
	@RequestMapping("roleDelete") // role/userList
	public String roleDelete(Long roleId) {	
		roleService.deleteAllByRoleId(roleId);
		return "redirect:../role/roleList";
	}
	
	//==============================================================================
	/**
	 * 
	 * 查询所有的right放入到model中，在前端进行显示
	 * 
	 */
	@RequestMapping("rightList") 
	public String rightList(Model model) {
		//查询权限应该用rightService
		List<SysRight> rightList = rightService.findAllRights();
		model.addAttribute("rightList", rightList);
		return "role/right/list";
	}
	
	@RequestMapping("toRightAdd") 
	public String toRightAdd(SysRight right,Model model) {
		//查询权限应该用rightService
		model.addAttribute("right",right);
		return "role/right/add";
	}
	
	/**
	 * 接收添加的sysRight,添加成功之后，直接跳转到列表页面展示
	 *  rightType: Document
		rightText: 哈哈
		rightParentCode: L01
		rightUrl: sale/hah
		还剩下 rightCode和rightTip
	 * @param right
	 * @param model
	 * @return
	 */
	@RequestMapping("rightAdd") 
	public String rightAdd(SysRight right,Model model) {
		//传入L01,返回L0103,把逻辑放入到service层中写
		String code = rightService.createCode(right.getRightParentCode());
		right.setRightCode(code);
		right.setRightTip(right.getRightText());
		rightService.saveEntity(right);
		return "redirect:../role/rightList";
	}
	
	/**
	 * 接收rightCode，查询这条记录传递到前台。
	 * 查询父模块的名称
	 * @param rightCode
	 * @param model
	 * @return
	 */
	@RequestMapping("toRightEdit") 
	public String toRightEdit(String rightCode,Model model) {
		SysRight right = rightService.findEntityById(rightCode);
		model.addAttribute("right", right);
		//根据L0101=>L01=>L01对应的名称
		model.addAttribute("fatherRightText",rightService.findEntityById(right.getRightParentCode()).getRightText());
		return "role/right/edit";
	}
	
	/**
	 * 接收前台传递的right，使用通过模块儿的更新即可完成
	 * @param right
	 * @param model
	 * @return
	 */
	@RequestMapping("rightEdit") 
	public String rightEdit(SysRight right,Model model) {
		rightService.updateEntity(right);
		return "redirect:../role/rightList";
	}
	
	/**
	 * 根据rightCode进行删除
	 * @param rightCode
	 * @return
	 */
	@RequestMapping("rightDelete") 
	public String rightDelete(String rightCode) {
		rightService.deleteByPrimaryKey(rightCode);
		return "redirect:../role/rightList";
	}
}
