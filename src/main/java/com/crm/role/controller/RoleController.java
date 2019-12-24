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
	 * �û��б�չʾ�ķ����������ѯ�û��������Ϣ�����б��ݵ�ǰ�˽���չʾ
	 */
	@RequestMapping("userList") // role/userList
	public String userList(Model model) {
		//��ѯ�û�Ӧ����userService
		List<SysUser> userList = userService.findAllUsers();
		model.addAttribute("userList", userList);
		return "role/user/list";
	}
	
	/**
	 * ��ת�û����ҳ��ķ�������Ҫ��ѯ��ɫ�б�
	 */
	@RequestMapping("toUserAdd") // role/userList
	public String toUserAdd(Model model) {
		//��ѯ��ɫӦ����roleService
		List<SysRole> roleList = roleService.findAllRoles();
		model.addAttribute("roleList", roleList);
		return "role/user/add";
	}
	
	/**
	 * �û���������Ҫ����SysUser
	 */
	@RequestMapping("userAdd") // role/userList
	public String userAdd(SysUser user) {
		//ʹ��ͨ�õķ��������û����=>��IUserService�Լ�ʵ�������ͨ��ģ���������
		userService.saveEntity(user);
		//������֮���ض����б��action
		return "redirect:../role/userList";
	}
	
	/**
	 * ��ת�û��༭ҳ��ķ�������Ҫ��ѯ��ɫ�б�����Ҫ��ʾ�û���Ϣ��
	 */
	@RequestMapping("toUserEdit") // role/userList
	public String toUserEdit(Long usrId,Model model) {
		
		//��ѯ��ɫӦ����roleService
		List<SysRole> roleList = roleService.findAllRoles();
		model.addAttribute("roleList", roleList);
		model.addAttribute("sysUser", userService.findEntityById(usrId));
		return "role/user/edit";
	}
	
	/**
	 * �û��༭����SysUser
	 */
	@RequestMapping("userEdit") // role/userList
	public String userEdit(SysUser user) {
		//ʹ��ͨ�õķ��������û����=>��IUserService�Լ�ʵ�������ͨ��ģ���������
		userService.updateEntity(user);
		//������֮���ض����б��action
		return "redirect:../role/userList";
	}
	
	/**
	 * ����Id����ɾ��
	 */
	@RequestMapping("userDelete") // role/userList
	public String userDelete(Long usrId) {
		//ʹ��ͨ�õķ��������û�ɾ��=>��IUserService�Լ�ʵ�������ͨ��ģ���������
		userService.deleteByPrimaryKey(usrId);
		//������֮���ض����б��action
		return "redirect:../role/userList";
	}
	
	
	/**
	 * 
	 * �����ǽ�ɫ��صĲ���
	 * ===============================================================
	 * 
	 * 
	 */
	/**
	 * ��ɫ�б�չʾ�ķ����������ѯ���еĽ�ɫ
	 */
	@RequestMapping("roleList") // role/roleList
	public String roleList(Model model) {
		//��ѯ��ɫӦ����roleService
		List<SysRole> roleList = roleService.findAllRoles();
		model.addAttribute("roleList", roleList);
		return "role/role/list";
	}
	
	/**
	 * ��ת��ɫ���ҳ�棬�����ѯ
	 */
	@RequestMapping("toRoleAdd") // role/userList
	public String toRoleAdd(Model model) {
		return "role/role/add";
	}
	
	/**
	 * ��ɫ��������Ҫ����SysRole
	 */
	@RequestMapping("roleAdd") // role/userList
	public String roleAdd(SysRole role) {
		//ʹ��ͨ�õķ������н�ɫ���=>��IRoleService�Լ�ʵ�������ͨ��ģ���������
		roleService.saveEntity(role);
		//������֮���ض����б��action
		return "redirect:../role/roleList";
	}
	
	/**
	 * ��ת��ɫ�༭ҳ��ķ�������Ҫ��ʾ��ɫ��Ϣ��
	 */
	@RequestMapping("toRoleEdit") // role/userList
	public String toRoleEdit(Long roleId,Model model) {	
		model.addAttribute("sysRole", roleService.findEntityById(roleId));
		return "role/role/edit";
	}
	
	/**
	 * �û��༭����SysUser
	 */
	@RequestMapping("roleEdit") // role/userList
	public String roleEdit(SysRole role) {
		//ʹ��ͨ�õķ������н�ɫ�޸�=>��IUserService�Լ�ʵ�������ͨ��ģ���������
		roleService.updateEntity(role);
		//������֮���ض����б��action
		return "redirect:../role/roleList";
	}
	
	
	//=========================��ת���û�����ҳ��
	/**
	 * ��ת����ɫ����ҳ��
		1 ��ѯ��ɫ
		2 ��ѯ���е�Ȩ���б�=�����԰�����ʾ�˵�
		3 ��ѯ��ɫ����Ӧ��Ȩ�� = ������ѡ�еĸ�ѡ��
		��
	 */
	@RequestMapping("toRoleManage") // role/userList
	public String toRoleManage(Long roleId,Model model) {	
		model.addAttribute("sysRole", roleService.findEntityById(roleId));
		//��ѯ���е�Ȩ�� sysRight
		model.addAttribute("sysRightList", rightService.findAllRights());
		//��ѯroleId��sys_role_right���ж�Ӧ��Ȩ��=����Ӧ��Ȩ�ޱ�ѡ��=��SELECT * FROM `sys_role_right` WHERE rf_role_id = 5
		model.addAttribute("sysRoleRightList", roleRightService.findRightsByRoleId(roleId));
		return "role/role/manage";
	}
	
	/**
	 *  ��ɫȨ�޷���ҳ��
	     ����ǰ̨���ݵĽ�ɫid����Ȩ���б���ɾ��roleid��Ӧ����Ȩ�ޣ����µ�Ȩ����ӵ����ݿ���ȡ
	 */
	@RequestMapping("roleManage") // role/userList
	public String roleManage(Long roleId,String[] selectedRights,Model model) {	
		//��Ҫ��controller��д������߼�����
		//ɾ������Ӷ��Ƕ�sys_role_right����еĲ�����=��SysRoleRightService
		roleRightService.manage(roleId,selectedRights);
		return "redirect:../role/roleList";
	}
	
	/**
	 * ��ɾ�û���
		��ɾ��ɫȨ�ޱ�
		�����ɾ��ɫ��
	 */
	@RequestMapping("roleDelete") // role/userList
	public String roleDelete(Long roleId) {	
		roleService.deleteAllByRoleId(roleId);
		return "redirect:../role/roleList";
	}
	
	//==============================================================================
	/**
	 * 
	 * ��ѯ���е�right���뵽model�У���ǰ�˽�����ʾ
	 * 
	 */
	@RequestMapping("rightList") 
	public String rightList(Model model) {
		//��ѯȨ��Ӧ����rightService
		List<SysRight> rightList = rightService.findAllRights();
		model.addAttribute("rightList", rightList);
		return "role/right/list";
	}
	
	@RequestMapping("toRightAdd") 
	public String toRightAdd(SysRight right,Model model) {
		//��ѯȨ��Ӧ����rightService
		model.addAttribute("right",right);
		return "role/right/add";
	}
	
	/**
	 * ������ӵ�sysRight,��ӳɹ�֮��ֱ����ת���б�ҳ��չʾ
	 *  rightType: Document
		rightText: ����
		rightParentCode: L01
		rightUrl: sale/hah
		��ʣ�� rightCode��rightTip
	 * @param right
	 * @param model
	 * @return
	 */
	@RequestMapping("rightAdd") 
	public String rightAdd(SysRight right,Model model) {
		//����L01,����L0103,���߼����뵽service����д
		String code = rightService.createCode(right.getRightParentCode());
		right.setRightCode(code);
		right.setRightTip(right.getRightText());
		rightService.saveEntity(right);
		return "redirect:../role/rightList";
	}
	
	/**
	 * ����rightCode����ѯ������¼���ݵ�ǰ̨��
	 * ��ѯ��ģ�������
	 * @param rightCode
	 * @param model
	 * @return
	 */
	@RequestMapping("toRightEdit") 
	public String toRightEdit(String rightCode,Model model) {
		SysRight right = rightService.findEntityById(rightCode);
		model.addAttribute("right", right);
		//����L0101=>L01=>L01��Ӧ������
		model.addAttribute("fatherRightText",rightService.findEntityById(right.getRightParentCode()).getRightText());
		return "role/right/edit";
	}
	
	/**
	 * ����ǰ̨���ݵ�right��ʹ��ͨ��ģ����ĸ��¼������
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
	 * ����rightCode����ɾ��
	 * @param rightCode
	 * @return
	 */
	@RequestMapping("rightDelete") 
	public String rightDelete(String rightCode) {
		rightService.deleteByPrimaryKey(rightCode);
		return "redirect:../role/rightList";
	}
}
