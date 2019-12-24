<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>      
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>产品查询</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script src="../script/common.js"></script>
</head>
<body>

<div class="page_title">产品查询</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="save('product');">查询</button>  
</div>
<form action="../product/list" id="product">
<table class="query_form_table">
	<tr>
		<th>名称</th>
		<td><input name="prodName" value="${pageInfo.entity.prodName}"/></td> 
		<th>型号</th>
		<td><input name="prodType" value="${pageInfo.entity.prodType}"/></td>
		<th>批次</th>
		<td><input name="prodBatch" value="${pageInfo.entity.prodBatch}"/></td>
	</tr>
</table>
<br />
</form>
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>名称</th>
		<th>型号</th>
		<th>等级/批次</th>
		<th>单位</th>
		<th>单价（元）</th>
		<th>备注</th>
	</tr>
	<c:forEach items="${pageInfo.lists}" var="prod">
	<tr>
		<td class="list_data_number">${prod.prodId}</td>
		<td class="list_data_ltext">${prod.prodName}</td>
		<td class="list_data_text">${prod.prodType}</td>
		<td class="list_data_text">${prod.prodBatch}</td>
		<td class="list_data_text">${prod.prodUnit}</td>
		<td class="list_data_number">${prod.prodPrice}</td>
		<td class="list_data_ltext">${prod.prodMemo}&nbsp;</td>		
	</tr>
	</c:forEach>
	<tr>
		<th colspan="100" class="pager">
<form action="../product/list" id="go">
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
	       <a href="../product/list?pageNum=1&prodName=${pageInfo.entity.prodName}&prodType=${pageInfo.entity.prodType}&prodBatch=${pageInfo.entity.prodBatch}&pageSize=${pageInfo.pageSize}">首页</a>
	      </c:otherwise> 
    </c:choose>
	
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum<=1}">   
	 		<a href="javascript:void(0)">上一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../product/list?pageNum=${pageInfo.pageNum-1}&prodName=${pageInfo.entity.prodName}&prodType=${pageInfo.entity.prodType}&prodBatch=${pageInfo.entity.prodBatch}&pageSize=${pageInfo.pageSize}">上一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">下一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../product/list?pageNum=${pageInfo.pageNum+1}&prodName=${pageInfo.entity.prodName}&prodType=${pageInfo.entity.prodType}&prodBatch=${pageInfo.entity.prodBatch}&pageSize=${pageInfo.pageSize}">下一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">最后一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../product/list?pageNum=${pageInfo.totalPage}&prodName=${pageInfo.entity.prodName}&prodType=${pageInfo.entity.prodType}&prodBatch=${pageInfo.entity.prodBatch}&pageSize=${pageInfo.pageSize}">最后一页</a>
	      </c:otherwise> 
   </c:choose>


	转到<input name="pageNum" value="${pageInfo.pageNum}" size="2" />页
	<!-- 触发提交，直接改成save('go') -->
	<input  type="hidden" name="prodName" value="${pageInfo.entity.prodName}"/>
	<input type="hidden" name="prodType" value="${pageInfo.entity.prodType}"/>
	<input type="hidden" name="prodBatch" value="${pageInfo.entity.prodBatch}"/>
	
	<button width="20" onclick="save('go')">GO</button>
</div>
</form>
		</th>
	</tr>
</table>
</body>
</html>