<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>客户流失分析</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

	<div class="page_title">客户流失分析</div>
	<div class="button_bar">
		<button class="common_button" onclick="help('');">帮助</button>
		<button class="common_button" onclick="save('lost');">查询</button>
	</div>
	<form action="../rept/lost" id="lost">
		<table class="query_form_table" border="0" cellPadding="3"
			cellSpacing="0">
			<tr>
				<th>客户名称</th>
				<td><input name="lstCustName" value="${pageInfo.entity.lstCustName}"/></td>
				<th>客户经理</th>
				<td><input name="lstCustManagerName" value="${pageInfo.entity.lstCustManagerName}"/></td>
			</tr>
		</table>
	</form>
	<br />
	<table class="data_list_table">
		<tr>
			<th height="28">编号</th>
			<th height="28">年份</th>
			<th height="28">客户</th>
			<th height="28">客户经理</th>
			<th height="28">流失原因</th>
		</tr>
		<c:forEach items="${pageInfo.lists}" var="lost">
			<tr>
				<td class="list_data_number" height="27">${lost.lstId}</td>
				<td class="list_data_text" height="27">${lost.lstLostDate}</td>
				<td class="list_data_text" height="27">${lost.lstCustName}</td>
				<td class="list_data_text" height="27">${lost.lstCustManagerName}</td>
				<td class="list_data_ltext" height="27">${lost.lstReason}</td>
			</tr>
		</c:forEach>


	</table>
</body>
</html>