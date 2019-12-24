<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>   
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>用户列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

<div class="page_title">客户信息管理 > 客户信息 > 用户列表</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('../role/toUserAdd');">新建</button>  
	<button class="common_button" onclick="back();">返回</button>  
</div>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>用户名</th>
		<th>密码</th>
		<th>角色名称</th>
		<th>是否可用</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${userList}" var="user">
	<tr>
		<td class="list_data_text">${user.usrId}</td>
		<td class="list_data_ltext">${user.usrName}</td>
		<td class="list_data_text">${user.usrPassword}</td>
		<td class="list_data_text">${user.sysRole.roleName}</td>
		<td class="list_data_text">
			${user.usrFlag==1?"是":"否"}
		</td>
		<td class="list_data_op">
			<img onclick="to('../role/toUserEdit?usrId=${user.usrId}');" title="编辑" src="${pageContext.request.contextPath}/images/bt_edit.gif" class="op_button" />
			<img onclick="to('../role/userDelete?usrId=${user.usrId}');" title="删除" src="${pageContext.request.contextPath}/images/bt_del.gif" class="op_button" />
			
		</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>