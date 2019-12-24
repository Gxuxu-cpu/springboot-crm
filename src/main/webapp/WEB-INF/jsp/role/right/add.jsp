<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>编辑销售机会</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script>
	function parentShow(input){
		if ($(input).val() == 1){
			$("table tr:first").after("<tr id=\"parent\"><th>模块名称</th><td colspan=\"3\"><select><option>请选择...</option><option>营销管理</option><option>客户管理</option><option>服务管理</option><option>统计报表</option><option>基础数据</option><option>权限管理</option></select> <span class=\"red_star\">*</span></td></tr>");
		}
		else
			$("#parent").remove();
	}
</script>
</head>
<body>

<div class="page_title">权限管理&nbsp; &gt; 添加子模块信息</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="save('role');">保存</button>  
</div>
<form action="../role/rightAdd" id="role">
<input type="hidden" name="rightType" value="Document"/>
<table  class="query_form_table" id="table1">
<tr id="aa">
		
		<th>模块名称</th>
		<td>
			<input name="rightText"/><span class="red_star">*</span></td>
		<th>父模块名称</th>
		<td>
			<input value="${right.rightText}" readOnly="readOnly"/>
			<input type="hidden" name="rightParentCode" value="${right.rightParentCode}"/>
		</td>
	
	</tr>
	
	<tr>
		<th>模块动作</th>
		<td colspan="3"><input name="rightUrl"  size="50%" /><span class="red_star">例:sale/list*</span></td>
	</tr>
</table>
</form>
</body>
</html>