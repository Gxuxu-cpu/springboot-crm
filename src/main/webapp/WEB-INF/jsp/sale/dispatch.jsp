<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>指派销售机会</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

<div class="page_title">销售机会管理&nbsp; &gt; 指派销售机会</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="save('salChance');">保存</button>  
</div>
<form action="dispatch" id="salChance">
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td>${salChance.chcId}</td>
		<th>机会来源</th>
		<td>
		<!-- 应该在隐藏域中加上id相关的信息，使用name把id传递走-->
		<input type="hidden" name="chcId" value="${salChance.chcId}">
		${salChance.chcSource}
		</td>
	</tr>
	<tr>
		<th>客户名称</th>
		<td>${salChance.chcCustName}</td>
		<th>成功机率（%）</th>
		<td>&nbsp;${salChance.chcRate}</td>
	</tr>	
	<tr>
		<th>概要</th>
		<td colspan="3">${salChance.chcTitle}</td>
	</tr>
	<tr>
		<th>联系人</th>
		<td>${salChance.chcLinkman}</td>
		<th>联系人电话</th>
		<td>${salChance.chcTel}</td>
	</tr>
	<tr>
		<th>机会描述</th>
		<td colspan="3">${salChance.chcDesc}</td>
	</tr>
	<tr>
		<th>创建人</th>
		<td>${salChance.chcCreateBy}</td>
		<th>创建时间</th>
		<td><fmt:formatDate value="${salChance.chcCreateDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	</tr>
</table>
<br />
<table class="query_form_table" id="table1">
	<tr>
		<th>指派给</th>
		<td>
		    <!-- select的name 对应的是option id的value -->
			<select name="chcDueId">
				<option>请选择...</option>
				<!-- 
					遍历model中的users，并且显示相关的信息
				 -->
				<c:forEach items="${users}" var="user">
					<option value="${user.usrId}">${user.usrName}</option>
				</c:forEach> 
			
			</select> <span class="red_star">*</span></td>
		<th>指派时间</th>
		<td>
			<input  name="chcDueDate" value="<fmt:formatDate value="${salChance.chcDueDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly size="20" /><span class="red_star">*</span></td>
	</tr>
</table>
</form>
<script>
	setCurTime('t2');
</script>
</body>
</html>