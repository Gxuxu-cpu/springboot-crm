<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>查看</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script src="../script/common.js"></script>
</head>
<body>

<div class="page_title">客户开发计划 &gt; 查看</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td>
		   <input type="hidden" id="chcId" value="${salChance.chcId}">
			${salChance.chcId}
		</td>
		<th>机会来源</th>
		<td>${salChance.chcSource}</td>
	</tr>
	<tr>
		<th>客户名称</th>
		<td>${salChance.chcCustName}</td>
		<th>成功机率（%）</th>
		<td>&nbsp;${salChance.chcRate}</td>
	</tr>	
	<tr>
		<th>概要</th>
		<td >${salChance.chcTitle}</td>
		<th>状态</th>
		<td>${salChance.chcStatus==3?'成功':'失败'}</td>
	</tr>
	<tr>
		<th>联系人</th>
		<td>${salChance.chcLinkman}</td>
		<th>联系人电话</th>
		<td>${salChance.chcTel}</td>
	</tr>
	<tr>
		<th>机会描述</th>
		<td colspan="3">${salChance.chcDesc}</td>
		
	</tr>
	<tr>
		<th>创建人</th>
		<td>${salChance.chcCreateBy}</td>
		<th>创建时间</th>
		<td><fmt:formatDate value="${salChance.chcCreateDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	</tr>
	<tr>
		<th>指派给</th>
		<td>${salChance.chcDueTo}</td>
		<th>指派时间</th>
		<td><fmt:formatDate value="${salChance.chcDueDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	</tr>
</table>
<br />
<br />
<table class="data_list_table" id="table1">
	<tr>
		<th>日期</th>
		<th>计划</th>
		<th>执行效果</th>
	</tr>
	
	<c:forEach items="${plans}" var="plan">
		<tr>
			<td class="list_data_text"><fmt:formatDate value="${plan.plaDate}" pattern="yyyy-MM-dd"/></td>
			<td class="list_data_ltext">${plan.plaTodo}</td>
			<td class="list_data_ltext">${plan.plaResult}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>