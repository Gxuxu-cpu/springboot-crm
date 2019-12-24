<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>   
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>角色</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

<div class="page_title">角色列表</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('../role/toRoleAdd');">新建</button>  
	<button class="common_button" onclick="reload();">查询</button> 
	</div>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>角色名称</th>
		<th>角色描述</th>
		<th>是否可用</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${roleList}" var="role">
	<tr>
		<td class="list_data_number">${role.roleId}</td>
		<td class="list_data_text">${role.roleName}</td>
		<td class="list_data_text">${role.roleDesc}</td>
		<td class="list_data_text">
			${role.roleFlag==1?"是":"否"}
		</td>
		<td class="list_data_text">
				<img onclick="to('../role/toRoleEdit?roleId=${role.roleId}');" title="修改" src="${pageContext.request.contextPath}/images/bt_edit.gif" class="op_button" />
				<img onclick="to('../role/roleDelete?roleId=${role.roleId}');" title="删除" src="${pageContext.request.contextPath}/images/bt_del.gif" class="op_button" />
				<img onclick="to('../role/toRoleManage?roleId=${role.roleId}');" title="角色授权" src="${pageContext.request.contextPath}/images/bt_acti.gif" class="op_button">
		</td>
	</tr>
	</c:forEach>
	
</table>
</body>
</html>