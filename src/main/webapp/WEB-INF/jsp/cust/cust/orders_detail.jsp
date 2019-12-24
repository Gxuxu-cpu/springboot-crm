<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>订单明细</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

<div class="page_title">客户信息管理 &gt; 客户信息 &gt; 历史订单 &gt; 订单明细 </div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>  
</div>
<table class="query_form_table" height="59">
	<tr>
		<th>订单编号</th>
		<td>${orders.odrId}</td>
		<th>日期</th>
		<td><fmt:formatDate value="${orders.odrDate}" pattern="yyyy年MM月dd日"/></td>
	</tr>
	<tr>
		<th height="28">送货地址</th>
		<td>${orders.odrAddr}</td>
		<th height="28">总金额（元）</th>
		<td>${orders.total}</td>
	</tr>
	<tr>
		<th height="28">状态</th>
		<td>${orders.odrStatus=="1"?"未回款":"已回款"}</td>
		<th height="28">&nbsp;</th>
		<td>&nbsp;</td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th>商品</th>
		<th>数量</th>
		<th>单位</th>
		<th>单价（元）</th>
		<th>金额（元）</th>
	</tr>
	<!-- 遍历ordersLineList集合，每条记录都可以得到product再获取商品名称 -->
	<c:forEach items="${orders.ordersLineList}" var="ordersLine">
	<tr>
		<td class="list_data_text">${ordersLine.product.prodName}</td>
		<td class="list_data_ltext">${ordersLine.oddCount}</td>
		<td class="list_data_text">${ordersLine.oddUnit}</td>
		<td class="list_data_text">${ordersLine.oddPrice}</td>
		<td class="list_data_text">${ordersLine.oddPrice*ordersLine.oddCount}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>
