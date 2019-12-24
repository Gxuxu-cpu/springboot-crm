<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>客户贡献分析</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

	<div class="page_title">客户贡献分析</div>
	<div class="button_bar">
		<button class="common_button" onclick="help('');">帮助</button>
		<button class="common_button" onclick="save('contr');">查询</button>
		<button class="common_button" onclick="save('export');">数据导出</button>
	</div>
	<form action="../rept/contr" id="contr">
		<table class="query_form_table">
			<tr>
				<th>客户编号</th>
				<td><input name="odrId" value="${pageInfo.entity.odrId}"/></td>
				<th>年份</th>
				<td><select name="ok">
						<option value="">全部</option>
						<c:forEach items="${nianlist}" var="nian">
							<option ${pageInfo.entity.odrDate==nian.dictItem?'selected':''}
								value="${nian.dictItem}">${nian.dictItem}</option>
						</c:forEach>
				</select></td>
			</tr>
		</table>
	</form>
	<div class="page_title">贡献分析报表设置</div>
	<form action="../rept/export" id="export">
	<table class="query_form_table">
			<tr>
				<th>报表名称</th>
				<td><input name="ming"/></td>
			</tr>
	</table>
	</form>
	<br />
	<table class="data_list_table">
		<tr>
			<th>编号</th>
			<th>客户名称</th>
			<th>日期</th>
			<th>订单金额（元）</th>
		</tr>
		<c:forEach items="${pageInfo.lists}" var="order"> 
		<tr>
			<td class="list_data_number">${order.odrId}</td>
			<td class="list_data_ltext">${order.odrCustomer}</td>
			<td class="list_data_ltext"><fmt:formatDate value="${order.odrDate}" pattern="yyyy年MM月dd日"/></td>
			
			<td class="list_data_number">${order.total}</td>
			
		</tr>
		</c:forEach>
	</table>
</body>
</html>