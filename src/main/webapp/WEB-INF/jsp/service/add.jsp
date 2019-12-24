<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>服务创建</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

	<div class="page_title">客户服务管理 > 服务创建</div>
	<div class="button_bar">
		<button class="common_button" onclick="help('');">帮助</button>
		<button class="common_button" onclick="save('cstService');">保存</button>
	</div>
	<form action="add" id="cstService">
		<table class="query_form_table">
			<tr>
				<th>编号</th>
				<td><input readonly value="自动生成" /></td>
				<th>服务类型</th>
				<td><select name="svrType">
						<option value="">请选择...</option>
						<c:forEach items="${typeList}" var="type">
							<option ${pageInfo.entity.svrType==type.dictItem?'selected':''}
								value="${type.dictItem}">${type.dictItem}</option>
						</c:forEach>
				</select> <span class="red_star">*</span></td>
			</tr>
			<tr>
				<th>概要</th>
				<td colspan="3"><input name="svrTitle" value="${cstService.svrTitle}" size="53" /><span
					class="red_star">*</span></td>
			</tr>
			<tr>
				<th>客户</th>
				<td><input name="svrCustName" value="${cstService.svrCustName}" size="20" /><span
					class="red_star">*</span></td>
				<th>状态</th>
				<td><input readonly name="svrStatus" value="新创建" /></td>
			</tr>
			<tr>
				<th>服务请求</th>
				<td colspan="3"><textarea name="svrRequest" value="${cstService.svrRequest}" rows="6" cols="50"></textarea><span
					class="red_star">*</span></td>
			</tr>
			<tr>
				<th>创建人</th>
				<td>
				<input name="svrCreateId" value="${user.usrId}" type="hidden"> 
				<input name="svrCreateBy" value="${user.usrName}" readonly size="20" />
				<span class="red_star">*</span></td>
				</td>
				<th>创建时间</th>
				<td><input name="svrCreateDate" value="<fmt:formatDate value="${cstService.svrCreateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly size="20" />
				<span class="red_star">*</span>
				</td>
			</tr>
		</table>
		<br />
		<table disabled class="query_form_table" id="table3">
			<tr>
				<th>分配给</th>
				<td><select disabled>
						<option>请选择...</option>
						<option>小明</option>
						<option>旺财</option>
						<option>球球</option>
						<option>孙小美</option>
						<option>周洁轮</option>
				</select> <span class="red_star">*</span></td>
				<th>分配时间</th>
				<td><input disabled id="t2" name="T18" readonly size="20" /><span
					class="red_star">*</span></td>
			</tr>
		</table>
		<br />
		<table disabled class="query_form_table" id="table1">
			<tr>
				<th>服务处理</th>
				<td colspan="3"><textarea disabled rows="6" cols="50"></textarea><span
					class="red_star">*</span></td>
			</tr>
			<tr>
				<th>处理人</th>
				<td><input disabled name="T17" readonly size="20" /><span
					class="red_star">*</span></td>
				<th>处理时间</th>
				<td><input disabled id="t3" name="T16" readonly size="20" /><span
					class="">*</span></td>
			</tr>
		</table>
		<br />
		<table disabled class="query_form_table" id="table2">
			<tr>
				<th>处理结果</th>
				<td><input disabled name="T10" size="20" /><span
					class="red_star">*</span></td>
				<th>满意度</th>
				<td><select disabled name="D1">
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
	<script>
		setCurTime('t1');
		setCurTime('t2');
		setCurTime('t3');
	</script>
</body>
</html>