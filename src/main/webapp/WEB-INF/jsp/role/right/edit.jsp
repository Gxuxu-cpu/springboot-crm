<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>编辑销售机会</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

<div class="page_title">权限管理&nbsp; &gt; 编辑模块信息</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="save('role');">保存</button>  
</div>
<form action="../role/rightEdit" id="role">
<input type="hidden" name="rightCode" value="${right.rightCode}">
<table disabled class="query_form_table" id="table1">
	
	<tr>
		<th>模块名称</th>
		<td>
			<input  name="rightText" value="${right.rightText}"/><span class="red_star">*</span></td>
		<th>父模块名称</th>
		<td>
			<input value="${fatherRightText}" readOnly="readOnly"/> <span class="red_star">*</span></td>
		
	</tr>
	<tr>
		<th>模块动作</th>
		<td colspan="3"><input name="rightUrl" value="${right.rightUrl}"  size="50%" /><span class="red_star">*</span></td>
	</tr>
</table>
</form>
</body>
</html>