<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>暂缓流失</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

<div class="page_title">客户流失管理 &gt; 暂缓流失</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="to('../lost/toConfirm?lstId=${lost.lstId}&page=confirm');">确认流失</button>
	<button class="common_button" onclick="save('relay');">保存</button>
</div>
<form action="../lost/relay" id="relay">
<input type="hidden" name="lstId" value="${lost.lstId}">
<input type="hidden" name="lstDelay" value="${lost.lstDelay}">

<table class="query_form_table">
<tr>
		<th>编号</th>
		<td>${lost.lstId}</td>
		<th>客户</th>
		<td>${lost.lstCustName}</td>
	</tr>
	<tr>
		<th>客户经理</th>
		<td>${lost.lstCustManagerName}</td>
		<th>上次下单时间</th>
		<td>${lost.lstLastOrderDate}</td>
	</tr>	
	<tr>
		<th>暂缓措施</th>
		<td colspan="3">
			${lost.lstDelay}</td>
	</tr>
	<tr>
		<th>追加暂缓措施</th>
		<td colspan="3">
			<textarea rows="6" name="addRelay" cols="50"></textarea><span class="red_star">*</span></td>
	</tr>
</table>
</form>
<br />
</body>
</html>