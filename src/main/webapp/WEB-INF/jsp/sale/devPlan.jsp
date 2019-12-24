<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>制定计划</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script src="../script/common.js"></script>
<!-- 使用日期控件需要引入相关的js -->
<link rel="stylesheet" type="text/css" media="all" href="../css/calendar-win2k-cold-1.css" title="win2k-cold-1" />
<script type="text/javascript" src="../js/calendar.js"></script>
<script type="text/javascript" src="../js/calendar-zh.js"></script>
<script type="text/javascript" src="../js/calendar-setup.js"></script>
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript">
function addAjax(){
	$.ajax({
		url:"../plan/add",
		type:"post",
		//需要传递的参数有日期，计划项，以及salChance的Id
		data:{"chcId":$("#chcId").val(),"plaDate":$("#plaDate").val(),"plaTodo":$("#plaTodo").val()},
		//dataType设置成json，data直接就转成对象了，就可以直接遍历了
		dataType:"json",
		success:function(data){
			convertToString(data)
		}
	})
}

//通过id删除，删除完过后把相关的数据查出来
function deleteAjax(plaId){
	$.ajax({
		url:"../plan/delete",
		type:"post",
		//需要传递的参数plaId plaId用于删除,chcId 用于查询相关的salPlan
		data:{"plaId":plaId,"chcId":$("#chcId").val()},
		//dataType设置成json，data直接就转成对象了，就可以直接遍历了
		dataType:"json",
		success:function(data){
			convertToString(data)
		}
	})
}

//通过传递的参数进行更新
//跟新的时候需要获取保存按钮对应的那一行文本的值,给文本框起不同的id
function updateAjax(plaId){
	$.ajax({
		url:"../plan/update",
		type:"post",
		//需要传递的参数plaId用于更新，还需要传递plaTodo表示更新的内容
		data:{"plaId":plaId,"plaTodo":$("#plan"+plaId).val()},
		//dataType设置成json，data直接就转成对象了，就可以直接遍历了
		success:function(data){
			alert(data)
		}
	})
}

// 请求数据之后，需要遍历显示
// 使用jquery自带的each方法进行遍历
/**
 *
$.each(collection, function(i, elt){})
  collection是传入的集合，i就是索引，elt是就是每一个变量
  \"是转意符，表示字符串中包含双引号
 */
function convertToString(data){
	var str = "<tr><th width=\"150px\">日期</th><th height=\"31\">计划项</th></tr>"
	$.each(data, function(i, plan) {
		str+="<tr>"
		//fmt标签不能用，就意味着时间不能以2019-09-24 15:03:09显示？先把fmt去掉。
		str+="<td class=\"list_data_text\">"+plan.plaDateStr+"</td>"
		str+="<td class=\"list_data_ltext\"><input size=\"50\" id=\"plan"+plan.plaId+"\" value=\""+plan.plaTodo+"\" name=\"T1\" />"
		str+="<button class=\"common_button\" onclick=\"updateAjax('"+plan.plaId+"');\">保存</button>"
		str+="<button class=\"common_button\" onclick=\"deleteAjax('"+plan.plaId+"');\">删除</button>"
		str+="</td></tr>"
	})
	//把集合转成了字符串
	$("#table1").html(str)
}
</script>

</head>
<body>

<div class="page_title">客户开发计划 &gt; 制定计划</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('../plan/toDevExecute?chcId=${salChance.chcId}');">执行计划</button>
	<button class="common_button" onclick="back();">返回</button>
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
		<th width="150px">日期</th>
		<th height="31">计划项</th>
	</tr>
	
	<!-- 使用el表达式显示查询salPlan相关的数据 -->
	<c:forEach items="${plans}" var="plan">
		<tr>
			<td class="list_data_text"><fmt:formatDate value="${plan.plaDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			<td class="list_data_ltext"><input size="50" id="plan${plan.plaId}" value="${plan.plaTodo}" name="T1" />
			<button class="common_button" onclick="updateAjax(${plan.plaId});">保存</button>
			<button class="common_button" onclick="deleteAjax(${plan.plaId});">删除</button>
			</td>
		</tr>
	</c:forEach>
	
</table>
<div class="button_bar">
	<button class="common_button" onclick="addAjax()">保存</button>
	</div>
<table class="query_form_table" id="table2">
	<tr>
		<th>日期</th>
		<td><input id="plaDate" onclick="return showCalendar('plaDate', 'y-mm-dd 00:00:00');"/><span class="red_star">*</span></td>
		<th>计划项</th>
		<td>
			<input id="plaTodo" size="50" name="T2" /><span class="red_star">*</span>
		</td>
	</tr>
</table>
</body>
</html>