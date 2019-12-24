<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>      
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

<div class="page_title">客户信息管理 > 客户信息 > 交往记录 > 编辑交往记录</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="save('activity');">保存</button>  
</div>
<form action="../activity/edit" id="activity">
<table class="query_form_table">
	<tr>
		<th>时间</th>
		<td><input id="plaDate" name="atvDate" value="<fmt:formatDate value='${cstActivity.atvDate}' pattern='yyyy年MM月dd日'/>" onclick="return showCalendar('plaDate', 'y-mm-dd 00:00:00');" readOnly="readOnly"/><span class="red_star">*</span></td>
		<th>地点</th>
		<td>
			<input size="20" value="${cstActivity.atvPlace}" name="atvPlace"/><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>概要</th>
		<td><input name="atvTitle" value="${cstActivity.atvTitle}" /><span class="red_star" >*</span></td>
		<th>备注</th>
		<td><input name="atvDesc" value="${cstActivity.atvDesc}" /></td>
	</tr>	
	<tr>
		<th>详细信息</th>
		<td colspan="3">
			<textarea cols="50" rows="6" name="atvRemark" value="${cstActivity.atvRemark}"> </textarea>
		</td>
	</tr>
</table>
<input type="hidden" value="${cstActivity.atvCustNo}" name="atvCustNo">
<input type="hidden" value="${cstActivity.atvCustName}" name="atvCustName">
<input type="hidden" value="${cstActivity.atvId}" name="atvId">

</form>
</body>
</html>