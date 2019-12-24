<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>服务处理</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

<div class="page_title">客户服务管理 &gt; 服务处理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button> 
	<button class="common_button" onclick="save('cstservice');">保存</button>  
</div>
<form action="../service/edit" id="cstservice">
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td>${cstService.svrId}
		<!-- 应该在隐藏域中加上id相关的信息，使用name把id传递走-->
		<input type="hidden" name="svrId" value="${cstService.svrId}">
		</td>
		<th>服务类型</th>
		<td>${cstService.svrType}</td>
	</tr>
	<tr>
		<th>概要</th>
		<td colspan="3">${cstService.svrTitle}</td>
	</tr>	
	<tr>
		<th>客户</th>
		<td>${cstService.svrCustName}</td>
		<th>状态</th>
		<td>${cstService.svrStatus}</td>
	</tr>	
	<tr>
		<th>服务请求</th>
		<td colspan="3">${cstService.svrRequest}<br>
　</td>
	</tr>
	<tr>
		<th>创建人</th>
		<td>${cstService.svrCreateBy}</td>
		<th>创建时间</th>
		<td><fmt:formatDate value="${cstService.svrCreateDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	</tr>
	</table>
<br />
<table class="query_form_table" id="table3">
	<tr>
		<th>分配给</th>
		<td>${cstService.svrDueTo}</td>
		<th>分配时间</th>
		<td><fmt:formatDate value="${cstService.svrDueDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	</tr>
</table>
<br />	
<table class="query_form_table" id="table1">
	<tr>
		<th>服务处理</th>
		<td colspan="3"><textarea name="svrDeal" value="${cstService.svrDeal}" rows="6" cols="50"></textarea><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>处理人</th>
		<td>
		<input name="svrDealId" value="${user.usrId}" type="hidden"> 
		<input name="svrDealBy" value="${user.usrName}" readonly size="20" />
		<span class="red_star">*</span>
		</td>
		<th>处理时间</th>
		<td>
		<input name="svrDealDate" value="<fmt:formatDate value="${cstService.svrDealDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly size="20" />
		<span class="red_star">*</span>
		</td>
	</tr>
</table>
<br />
<table  class="query_form_table" id="table2">
	<tr>
		<th>处理结果</th>
		<td><input disabled name="T10" size="20" /><span class="red_star">*</span></td>
		<th>满意度</th>
		<td>
			<select disabled name="D1">
				<option>请选择...</option>
				<option>☆☆☆☆☆</option>
				<option>☆☆☆☆</option>
				<option>☆☆☆</option>
				<option>☆☆</option>
				<option>☆</option>
			</select><span class="red_star">*</span></td>
	</tr>
</table>
</form>
</body>
</html>