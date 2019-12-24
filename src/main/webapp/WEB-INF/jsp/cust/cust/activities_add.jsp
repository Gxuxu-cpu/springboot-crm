<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>新建交往记录</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
<!-- 使用日期控件需要引入相关的js -->
<link rel="stylesheet" type="text/css" media="all" href="${pageContext.request.contextPath}/css/calendar-win2k-cold-1.css" title="win2k-cold-1" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/calendar.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/calendar-zh.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/calendar-setup.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
</head>
<body>

<div class="page_title">客户信息管理 > 客户信息 > 交往记录 > 新建交往记录</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="save('activity');">保存</button>  
</div>
<form action="../activity/add" id="activity">
<table class="query_form_table">
	<tr>
		<th>时间</th>
		<td><input id="plaDate" name="atvDate" onclick="return showCalendar('plaDate', 'y-mm-dd 00:00:00');" readOnly="readOnly"/><span class="red_star">*</span></td>
		<th>地点</th>
		<td>
			<input size="20" name="atvPlace"/><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>概要</th>
		<td><input name="atvTitle"/><span class="red_star" >*</span></td>
		<th>备注</th>
		<td><input name="atvDesc"/></td>
	</tr>	
	<tr>
		<th>详细信息</th>
		<td colspan="3">
			<textarea cols="50" rows="6" name="atvRemark"> </textarea>
		</td>
	</tr>
</table>
<input type="hidden" value="${cstCustomer.custNo}" name="atvCustNo">
<input type="hidden" value="${cstCustomer.custName}" name="atvCustName">

</form>
</body>
</html>