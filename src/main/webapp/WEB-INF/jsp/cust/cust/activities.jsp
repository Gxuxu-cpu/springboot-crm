<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>     
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>交往记录</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

<div class="page_title">客户信息管理 &gt; 客户信息 &gt; 交往记录</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('../activity/toAdd?custNo=${cstCustomer.custNo}&custName=${cstCustomer.custName}');">新建</button>  
	<button class="common_button" onclick="back();">返回</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td>${cstCustomer.custNo}</td>
		<th>客户名称</th>
		<td>${cstCustomer.custName}</td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th width="232">时间</th>
		<th>地点</th>
		<th>概要</th>
		<th>详细信息</th>
		<th>备注</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${activities}" var="activity">
	<tr>
		<td class="list_data_text" width="230"><fmt:formatDate value="${activity.atvDate}" pattern="yyyy年MM月dd日"/> </td>
		<td class="list_data_text">${activity.atvPlace}</td>
		<td class="list_data_ltext">${activity.atvTitle}</td>
		<td class="list_data_ltext">${activity.atvDesc}</td>
		<td class="list_data_op">${activity.atvRemark}</td>
		<td class="list_data_op">
			<img onclick="to('../activity/toEdit?atvId=${activity.atvId}')" title="编辑" src="${pageContext.request.contextPath}/images/bt_edit.gif" class="op_button" />
			<img onclick="to('../activity/delete?atvId=${activity.atvId}&atvCustNo=${activity.atvCustNo}&atvCustName=${activity.atvCustName}');" title="删除" src="${pageContext.request.contextPath}/images/bt_del.gif" class="op_button" />
			
		</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>