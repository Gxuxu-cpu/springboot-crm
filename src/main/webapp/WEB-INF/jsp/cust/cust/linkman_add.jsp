<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>新建联系人</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

<div class="page_title">客户信息管理 > 客户信息 > 联系人 > 新建联系人</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="save('linkman');">保存</button>  
</div>
<form action="../linkman/add" id="linkman">
<table class="query_form_table">
	<tr>
		<th>姓名</th>
		<td><input name="lkmName" /><span class="red_star">*</span></td>
		<th>性别</th>
		<td>
			<input type="radio" name="lkmSex" checked value="男"/>男
			<input type="radio" name="lkmSex" value="女"/>女
		</td>
	</tr>
	<tr>
		<th>职位</th>
		<td><input name="lkmPostion"/><span class="red_star">*</span></td>
		<th>办公电话</th>
		<td><input name="lkmTel"/><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>手机</th>
		<td><input name="lkmMobile" size="20" /></td>
		<th>备注</th>
		<td><input name="lkmMemo" size="20" /></td>
	</tr>
</table>
<input type="hidden" value="${cstCustomer.custNo}" name="lkmCustNo">
<input type="hidden" value="${cstCustomer.custName}" name="lkmCustName">
</form>
</body>
</html>