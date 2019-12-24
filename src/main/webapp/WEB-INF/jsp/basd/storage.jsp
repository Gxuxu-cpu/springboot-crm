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
	<button class="common_button" onclick="save('storage');">查询</button>  
</div>
<form action="../storage/list" id="storage">
<table class="query_form_table">
	<tr>
		<th>产品</th><!-- 后端使用Storage接收  商品的名字;传递到前端是pageInfo-->
		<td><input name="product.prodName" value="${pageInfo.entity.product.prodName}"/></td>
		<th>仓库</th>
		<td><input name="stkWarehouse" value="${pageInfo.entity.stkWarehouse}"/></td>
		<th>&nbsp;</th>
		<td>&nbsp;</td>
	</tr>
</table>
<br />
</form>
<table class="data_list_table">
	<tr>
		<th>序号</th>
		<th>产品</th>
		<th>仓库</th>
		<th>货位</th>
		<th>件数</th>
		<th>备注</th>
	</tr>
	<c:forEach items="${pageInfo.lists}" var="storage">
	<tr>
		<td class="list_data_number">${storage.stkId}</td>
		<td class="list_data_ltext">${storage.product.prodName}-${storage.product.prodType}-${storage.product.prodBatch}</td>
		<td class="list_data_ltext">${storage.stkWarehouse}</td>
		<td class="list_data_text">${storage.stkWare}</td>
		<td class="list_data_number">${storage.stkCount}</td>
		<td class="list_data_ltext">${storage.stkMemo}</td>		
	</tr>
	</c:forEach>
	<tr>
		<th colspan="100" class="pager">
<form action="../storage/list" id="go">
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
	       <a href="../storage/list?pageNum=1&product.prodName=${pageInfo.entity.product.prodName}&stkWarehouse=${pageInfo.entity.stkWarehouse}&pageSize=${pageInfo.pageSize}">首页</a>
	      </c:otherwise> 
    </c:choose>
	
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum<=1}">   
	 		<a href="javascript:void(0)">上一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../storage/list?pageNum=${pageInfo.pageNum-1}&product.prodName=${pageInfo.entity.product.prodName}&stkWarehouse=${pageInfo.entity.stkWarehouse}&pageSize=${pageInfo.pageSize}">上一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">下一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../storage/list?pageNum=${pageInfo.pageNum+1}&product.prodName=${pageInfo.entity.product.prodName}&stkWarehouse=${pageInfo.entity.stkWarehouse}&pageSize=${pageInfo.pageSize}">下一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">最后一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../storage/list?pageNum=${pageInfo.totalPage}&product.prodName=${pageInfo.entity.product.prodName}&stkWarehouse=${pageInfo.entity.stkWarehouse}&pageSize=${pageInfo.pageSize}">最后一页</a>
	      </c:otherwise> 
   </c:choose>


	转到<input name="pageNum" value="${pageInfo.pageNum}" size="2" />页
	<!-- 触发提交，直接改成save('go') -->
	<input  type="hidden" name="product.prodName" value="${pageInfo.entity.product.prodName}"/>
	<input type="hidden" name="stkWarehouse" value="${pageInfo.entity.stkWarehouse}"/>
	
	<button width="20" onclick="save('go')">GO</button>
</div>
</form>
		</th>
	</tr>
</table>
</body>
</html>