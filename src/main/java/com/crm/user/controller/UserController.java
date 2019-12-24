package com.crm.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.crm.bean.SysRight;
import com.crm.bean.SysRole;
import com.crm.bean.SysUser;
import com.crm.role.service.IRoleService;
import com.crm.support.CrmResult;
import com.crm.user.service.IUserService;


@Controller
@RequestMapping("/sysUser")
public class UserController {

	@Resource
	private IUserService userService;

	@Resource
	private IRoleService roleService;

	/**
	 * �����û���������������ݿ���֤ usrName �� usrPassword �������������ƥ��
	 * �߼���������λ�ȡsession����HttpSession ,HttpServletRequest,HttpServletResponse
	 * 
	 * @return
	 */
	@RequestMapping("/login")
	public String login(SysUser sysUser,HttpSession session) {
		SysUser user = userService.selectUser(sysUser);
		if (user != null) {
			// ���ֱ�ӷ����ַ�������ͼ��������ת��������ͼ
			// ����buildMenu��������ǰ����Ҫ��ʾ���ַ������漰�����ݴ��䣬�����ַ���Ҫ�ŵ��������
			// ��Ϊ���ض���index.html�У����в��ܷŵ�request���У�ֻ�ܷŵ�session��
			session.setAttribute("user", user);
			session.setAttribute("lists", buildMenu(user));
			return "redirect:/index.html";
		}
		return "redirect:/login.html";
	}
	
	//ע����¼
    @RequestMapping("/logout")
    public String logout(HttpSession session)
    {
        System.out.println("logout");
        //sessionʧЧ
 
        session.removeAttribute("user");
       
        return "redirect:/login.html";
    }

	/**
	 * ��������ķ���ֵ����ǰ̨չʾ������
	 * 
	 * @param user
	 * @return
	 */
	public String buildMenu(SysUser user) {
		// List<SysRight> rights = user.getRole().getRights();
		List<SysRight> rights = userService.selectUserRights(user);
		StringBuffer sbu = new StringBuffer();
		for (SysRight sysRight : rights) {
			sbu.append("\r\n").append(sysRight.getRightCode()).append(" = theMenu.addChild(")
					.append(sysRight.getRightParentCode()).append(", \"").append(sysRight.getRightType())
					.append("\", \"").append(sysRight.getRightText()).append("\", \"").append(sysRight.getRightUrl())
					.append("\", \"").append(sysRight.getRightTip()).append("\");").append("\r\n");
		}
		System.out.println(sbu.toString());
		return sbu.toString();
	}

	@RequestMapping("/login1")
	@ResponseBody
	public String login1(SysUser sysUser) {
		SysUser user = userService.wxLogin(sysUser);
		if (user != null) {
			return "ok";
		}
		return "fail";
	}

	@RequestMapping("/users")
	@ResponseBody
	public List<SysUser> getUsers() {
		return userService.findAllUsers();
	}

	@RequestMapping("/details")
	@ResponseBody
	public SysUser showDetail(Long usrId) {
		return userService.findSysUserByUsrId(usrId);
	}

	@RequestMapping("/toEdit")
	@ResponseBody
	public CrmResult toEdit(Long usrId) {
		CrmResult result = new CrmResult();
		Map<String, Object> map = new HashMap<>();
		List<SysRole> roleList = roleService.findAllRoles();
		SysUser user = userService.findSysUserByUsrId(usrId);
		map.put("user", user);
		map.put("roleList", roleList);
		result.setErrCode("0");
		result.setErrMsg(map);
		return result;

	}

}
