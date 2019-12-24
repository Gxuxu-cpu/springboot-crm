<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>执行计划</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script src="../script/common.js"></script>
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript">
//通过传递的参数进行更新
//跟新的时候需要获取保存按钮对应的那一行文本的值,给文本框起不同的id
function updateAjax(plaId){
	$.ajax({
		url:"../plan/update",
		type:"post",
		//需要传递的参数plaId用于更新，还需要传递plaResult表示更新
		data:{"plaId":plaId,"plaResult":$("#plan"+plaId).val()},
		//dataType设置成json，data直接就转成对象了，就可以直接遍历了
		success:function(data){
			alert(data)
		}
	})
}
</script>
</head>
<body>

<div class="page_title">客户开发计划 &gt; 执行计划</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="alert('开发失败，已归档。');window.location.href='../plan/result?chcId=${salChance.chcId}&chcStatus=4';">终止开发</button>
	<button class="common_button" onclick="back();">返回</button>
	<!-- 跳转到制定计划页面， -->
	<button class="common_button" onclick="to('../plan/toDevPlan?chcId=${salChance.chcId}');">制定计划</button>
	<button class="common_button" onclick="alert('用户开发成功，已添加新客户记录。');window.location.href='../plan/result?chcId=${salChance.chcId}&chcStatus=3';">开发成功</button>

	</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td>
		   <input type="hidden" id="chcId" value="${salChance.chcId}">
			${salChance.chcId}
		</td>
		<th>机会来源</th>
		<td>${salChance.chcSource}</td>
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
	<tr>
		<th>指派给</th>
		<td>${salChance.chcDueTo}</td>
		<th>指派时间</th>
		<td><fmt:formatDate value="${salChance.chcDueDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	</tr>
</table>
<br />
<table class="data_list_table" id="table1">
	<tr>
		<th>日期</th>
		<th>计划</th>
		<th>执行效果</th>
	</tr>
	
	<c:forEach items="${plans}" var="plan">
		<tr>
			<td class="list_data_text"><fmt:formatDate value="${plan.plaDate}" pattern="yyyy-MM-dd"/></td>
			<td class="list_data_ltext">${plan.plaTodo}</td>
			<td class="list_data_ltext"><input id="plan${plan.plaId}" value="${plan.plaResult}"/>　
			<button class="common_button" onclick="updateAjax(${plan.plaId});">保存</button>
			</td>
		</tr>
	</c:forEach>
	<!-- 
		<tr>
			
			<td class="list_data_ltext">初步接触，了解客户意向。</td>
			<td class="list_data_ltext"><input />　
		<button class="common_button" onclick="save('dev_execute.html');">保存</button>
			</td>
		</tr>
		<tr>
			<td class="list_data_text">2008年02月22日</td>
			<td class="list_data_ltext">推介产品。</td>
			<td class="list_data_ltext"><input name="T1" size="20" />　
		<button class="common_button" onclick="save('dev_execute.html');">保存</button>
			</td>
		</tr>
	 -->
	</table>
</body>
</html>