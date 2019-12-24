<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>   
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>新建联系人</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

<div class="page_title">客户信息管理 > 客户信息 > 联系人 > 新建联系人</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="save('user');">保存</button>  
</div>
<form action="../role/userEdit" id="user">
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><input name="usrId" value="${sysUser.usrId}" readonly="readonly"/><span class="red_star">*</span></td>
		<th>角色</th>
		<td>
				<select name="usrRoleId">
					<option value="">请选择</option>
					<c:forEach items="${roleList}" var="role">
					<!-- 默认值的显示问题 -->
					<option ${sysUser.usrRoleId==role.roleId?"selected":""}  value="${role.roleId}">${role.roleName}</option>
					</c:forEach>
				</select>
		</td>
	</tr>
	<tr>
		<th>账号</th>
		<td><input name="usrName" value="${sysUser.usrName}"/><span class="red_star">*</span></td>
		<th>密码</th>
		<td><input name="usrPassword" value="${sysUser.usrPassword}"/><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>是否可用</th>
		<td colspan="3"><input type="radio" name="usrFlag" value="1" ${sysUser.usrFlag==1?"checked":""}>是
			<input type="radio" name="usrFlag" value="0" ${sysUser.usrFlag==0?"checked":""}>否</td>
	</tr>
</table>
</form>
</body>
</html>