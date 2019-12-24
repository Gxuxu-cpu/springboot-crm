<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>客户开发计划</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script src="../script/common.js"></script>
</head>
<body>

<div class="page_title">客户开发计划</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="save('salChance')">查询</button> 
	</div>
<!-- 替换条件查询 -->	
<form action="../sale/devList" id="salChance">
	<table class="query_form_table">
		<tr>
			<th>客户名称</th>
			<!-- chcCustName是SalChance的参数，后台可以使用salChance对象来接收参数 -->
			<td><input name="chcCustName" value="${pageInfo.entity.chcCustName}"/></td>
			<th>概要</th>
			<td><input name="chcTitle" value="${pageInfo.entity.chcTitle}"/></td>
			<th>联系人</th>
			<td>
				<input name="chcLinkman" value="${pageInfo.entity.chcLinkman}" size="20" />
			</td>
		</tr>
	</table>
</form>

<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>客户名称</th>
		<th>概要</th>
		<th>联系人</th>
		<th>联系人电话</th>
		<th>创建时间</th>
		<th>状态</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${pageInfo.lists}" var="saleChance" >
		<tr>
			<td class="list_data_number">${saleChance.chcId}</td>
			<td class="list_data_text">${saleChance.chcCustName}</td>
			<td class="list_data_ltext">${saleChance.chcTitle}</td>
			<td class="list_data_text">${saleChance.chcLinkman}</td>
			<td class="list_data_text">${saleChance.chcTel}</td>
			<!-- 显示格式化后的日期？？？ -->
			<td class="list_data_text"><fmt:formatDate value="${saleChance.chcCreateDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			<td class="list_data_text">
			<c:if test="${saleChance.chcStatus==3}">开发成功</c:if>
			<c:if test="${saleChance.chcStatus==4}">开发失败</c:if>
			<c:if test="${saleChance.chcStatus==2}">开发中</c:if>
			</td>
			<td class="list_data_op">
			<c:if test="${saleChance.chcStatus==2}">
				<img onclick="to('../plan/toDevPlan?chcId=${saleChance.chcId}');" title="制定计划" src="../images/bt_plan.gif" class="op_button" />
				<img onclick="to('../plan/toDevExecute?chcId=${saleChance.chcId}');" title="执行计划" src="../images/bt_feedback.gif" class="op_button" />
				<img onclick="alert('用户开发成功，已添加新客户记录。');window.location.href='../plan/result?chcId=${salChance.chcId}&chcStatus=3';" title="开发成功" src="../images/bt_yes.gif" class="op_button" />
			</c:if>
			<c:if test="${saleChance.chcStatus==3||saleChance.chcStatus==4}">
				
				<img onclick="to('../plan/toDevDetail?chcId=${saleChance.chcId}');" title="查看" src="../images/bt_detail.gif" class="op_button">
			</c:if>
			</td>

		</tr>
	</c:forEach>

	
	<tr>
		<th colspan="10" class="pager">
<form action="../sale/devList" id="go">
<div class="pager">
	共${pageInfo.totalCount}条记录 每页<input name="pageSize" value="${pageInfo.pageSize}" size="2" />条
	第${pageInfo.pageNum} 页/共${pageInfo.totalPage}页
	<!-- pageInfo接收参数，所有只能用pageInfo的属性来接收参数 
	   当当前pageNum是第一页的时候，超链接不能点击
	   条件查询之后发现超链接点击不起作用，没有相关的参数
	  拼接查询条件
	  ?pageNum=1&chcCustName=${pageInfo.entity.chcCustName}&chcTitle=${pageInfo.entity.chcTitle}&chcLinkman=${pageInfo.entity.chcLinkman}&pageSize=${pageInfo.pageSize}
	-->
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum==1}">   
	 		<a href="javascript:void(0)">首页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../sale/devList?pageNum=1&chcCustName=${pageInfo.entity.chcCustName}&chcTitle=${pageInfo.entity.chcTitle}&chcLinkman=${pageInfo.entity.chcLinkman}&pageSize=${pageInfo.pageSize}">首页</a>
	      </c:otherwise> 
    </c:choose>
	
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum<=1}">   
	 		<a href="javascript:void(0)">上一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../sale/devList?pageNum=${pageInfo.pageNum-1}&chcCustName=${pageInfo.entity.chcCustName}&chcTitle=${pageInfo.entity.chcTitle}&chcLinkman=${pageInfo.entity.chcLinkman}&pageSize=${pageInfo.pageSize}">上一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">下一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../sale/devList?pageNum=${pageInfo.pageNum+1}&chcCustName=${pageInfo.entity.chcCustName}&chcTitle=${pageInfo.entity.chcTitle}&chcLinkman=${pageInfo.entity.chcLinkman}&pageSize=${pageInfo.pageSize}">下一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">最后一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../sale/devList?pageNum=${pageInfo.totalPage}&chcCustName=${pageInfo.entity.chcCustName}&chcTitle=${pageInfo.entity.chcTitle}&chcLinkman=${pageInfo.entity.chcLinkman}&pageSize=${pageInfo.pageSize}">最后一页</a>
	      </c:otherwise> 
   </c:choose>


	转到<input name="pageNum" value="${pageInfo.pageNum}" size="2" />页
	<!-- 触发提交，直接改成save('go') -->
	<input  type="hidden" name="chcCustName" value="${pageInfo.entity.chcCustName}"/>
	<input type="hidden" name="chcTitle" value="${pageInfo.entity.chcTitle}"/>
	<input type="hidden" name="chcLinkman" value="${pageInfo.entity.chcLinkman}" size="20" />
	<button width="20" onclick="save('go')">GO</button>
</div>
</form>
		</th>
	</tr>
</table>
</body>
</html>