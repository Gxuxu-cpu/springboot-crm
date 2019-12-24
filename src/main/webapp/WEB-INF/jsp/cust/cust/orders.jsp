<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>       
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>历史订单</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

<div class="page_title">客户信息管理 > 客户信息 > 历史订单 </div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>  
	<button class="common_button" onclick="back();">返回</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td>${pageInfo.entity.odrCustNo}</td>
		<th>客户名称</th>
		<td>${pageInfo.entity.odrCustomer}</td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th>订单编号</th>
		<th>日期</th>
		<th>送货地址</th>
		<th>状态</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${pageInfo.lists}" var="order"> 
	<tr>
		<td class="list_data_text">${order.odrId}</td>
		<td class="list_data_text"><fmt:formatDate value="${order.odrDate}" pattern="yyyy年MM月dd日"/>   </td>
		<td class="list_data_text">${order.odrAddr}</td>
		<td class="list_data_text">${order.odrStatus=="1"?"未回款":"已回款"}</td>
		<td class="list_data_op">
			<img onclick="to('../orders/show?odrId=${order.odrId}');" title="查看明细" src="${pageContext.request.contextPath}/images/bt_detail.gif" class="op_button" /></td>
	</tr>
	</c:forEach>
		<tr>
		<th colspan="100" class="pager">
<form action="../orders/list" id="go">
<div class="pager">
	共${pageInfo.totalCount}条记录 每页<input name="pageSize" value="${pageInfo.pageSize}" size="2" />条
	第${pageInfo.pageNum} 页/共${pageInfo.totalPage}页
	<!-- pageInfo接收参数，所有只能用pageInfo的属性来接收参数 
	   当当前pageNum是第一页的时候，超链接不能点击
	   条件查询之后发现超链接点击不起作用，没有相关的参数
	  拼接查询条件
	-->
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum==1}">   
	 		<a href="javascript:void(0)">首页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../orders/list?pageNum=1&odrCustNo=${pageInfo.entity.odrCustNo}&odrCustomer=${pageInfo.entity.odrCustomer}&pageSize=${pageInfo.pageSize}">首页</a>
	      </c:otherwise> 
    </c:choose>
	
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum<=1}">   
	 		<a href="javascript:void(0)">上一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../orders/list?pageNum=${pageInfo.pageNum-1}&odrCustNo=${pageInfo.entity.odrCustNo}&odrCustomer=${pageInfo.entity.odrCustomer}&pageSize=${pageInfo.pageSize}">上一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">下一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../orders/list?pageNum=${pageInfo.pageNum+1}&odrCustNo=${pageInfo.entity.odrCustNo}&odrCustomer=${pageInfo.entity.odrCustomer}&pageSize=${pageInfo.pageSize}">下一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">最后一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../orders/list?pageNum=${pageInfo.totalPage}&odrCustNo=${pageInfo.entity.odrCustNo}&odrCustomer=${pageInfo.entity.odrCustomer}&pageSize=${pageInfo.pageSize}">最后一页</a>
	     </c:otherwise> 
   </c:choose>


	转到<input name="pageNum" value="${pageInfo.pageNum}" size="2" />页
	<!-- 触发提交，直接改成save('go') -->

	<input type="hidden" name="odrCustNo" value="${pageInfo.entity.odrCustNo}"/>
	<input type="hidden" name="odrCustomer" value="${pageInfo.entity.odrCustomer}"/>
	<button width="20" onclick="save('go')">GO</button>
</div>
</form>
		</th>
	</tr>
	</table>
</body>
</html>