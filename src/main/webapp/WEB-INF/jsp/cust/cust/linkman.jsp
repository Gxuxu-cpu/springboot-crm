<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>   
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>联系人</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

<div class="page_title">客户信息管理 > 客户信息 > 联系人 </div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('../linkman/toAdd?custNo=${cstCustomer.custNo}&custName=${cstCustomer.custName}');">新建</button>  
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
		<th>姓名</th>
		<th>性别</th>
		<th>职位</th>
		<th>办公电话</th>
		<th>手机</th>
		<th>备注</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${linkmans}" var="linkman">

	<tr>
		<td class="list_data_text">${linkman.lkmName}</td>
		<td class="list_data_ltext">${linkman.lkmSex}</td>
		<td class="list_data_text">${linkman.lkmPostion}</td>
		<td class="list_data_text">${linkman.lkmTel}</td>
		<td class="list_data_text">${linkman.lkmMobile}</td>
		<td class="list_data_op">
			　</td>
		<td class="list_data_op">
		
			<img onclick="to('../linkman/toEdit?lkmId=${linkman.lkmId}');" title="编辑"  src="${pageContext.request.contextPath}/images/bt_edit.gif" class="op_button" />
			
			<img onclick="to('../linkman/delete?lkmId=${linkman.lkmId}&lkmCustNo=${linkman.lkmCustNo}&lkmCustName=${linkman.lkmCustName}');"  title="删除"  src="${pageContext.request.contextPath}/images/bt_del.gif"  class="op_button" />
			
		</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>