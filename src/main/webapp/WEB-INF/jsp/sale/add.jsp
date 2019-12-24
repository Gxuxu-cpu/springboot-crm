<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>新增销售机会</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script src="../script/common.js"></script>
</head>
<body>

<div class="page_title">销售机会管理&nbsp; &gt; 新增销售机会</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="save('salChance');">保存</button>  
</div>

<form action="add" id="salChance">
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><input readonly value="自动生成" /></td>
		<th>机会来源</th>
		<td>
			<input name="chcSource" size="20" value="${salChance.chcSource}" /></td>
	</tr>
	<tr>
		<th>客户名称</th>
		<td><input name="chcCustName" value="${salChance.chcCustName}" /><span class="red_star">*</span></td>
		<th>成功机率（%）</th>
		<td><input name="chcRate" value="${salChance.chcRate}" /><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>概要</th>
		<td colspan="3"><input value="${salChance.chcTitle}" name="chcTitle" size="52" /><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>联系人</th>
		<td><input name="chcLinkman" value="${salChance.chcLinkman}" size="20" /></td>
		<th>联系人电话</th>
		<td><input name="chcTel" value="${salChance.chcTel}" size="20" /></td>
	</tr>
	<tr>
		<th>机会描述</th>
		<td colspan="3"><textarea rows="6" cols="50" name="chcDesc">${salChance.chcDesc}</textarea><span class="red_star">*</span></td>
	</tr>
	<tr>
		<!-- 创建的话是谁登录谁创建  所有说是 user.usrName 
		报错了说 Field 'chc_create_id' doesn't have a default value,数据库字段不能为空，但是没有传到后台
		创建人的id怎么写？
		-->
		<th>创建人</th>
		<td>
		<input name="chcCreateId" value="${user.usrId}" type="hidden">
		<input name="chcCreateBy" value="${user.usrName}" readonly size="20" /><span class="red_star">*</span></td>
		<th>创建时间</th>
		<td><input  name="chcCreateDate" value="<fmt:formatDate value="${salChance.chcCreateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly size="20" /><span class="red_star">*</span></td>
	</tr>
</table>
</form>
<br />

<script>
	setCurTime('t1');
	setCurTime('t2');
</script>
</body>
</html>