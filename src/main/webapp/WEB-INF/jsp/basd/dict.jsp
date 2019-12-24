<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>数据字典管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script src="../script/common.js"></script>
</head>
<body>

<div class="page_title">数据字典管理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('../basd/toAdd');">新建</button>
	<button class="common_button" onclick="save('dict');;">查询</button>  
</div>
<form action="../basd/list" id="dict">
<table class="query_form_table">

	<tr>
		<th>类别</th>
		<td><input  name="dictType" value="${pageInfo.entity.dictType}"/></td>
		<th>条目</th>
		<td><input name="dictItem" value="${pageInfo.entity.dictItem}"/></td>
		<th>值</th>
		<td><input name="dictValue" value="${pageInfo.entity.dictValue}"/></td>
	</tr>
</table>
</form>
<br />
<table class="data_list_table"> 
	<tr>
		<th>编号</th>
		<th>类别</th>
		<th>条目</th>
		<th>值</th>
		<th>是否可编辑</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${pageInfo.lists}" var="basd">
	<tr>
		<td class="list_data_number">${basd.dictId}</td>
		<td class="list_data_ltext">${basd.dictType}</td>
		<td class="list_data_text">${basd.dictItem}</td>
		<td class="list_data_text">${basd.dictValue}</td>
		<td class="list_data_text">${basd.dictIsEditable==0?"否":"是"}</td>
		<td class="list_data_op">
		<c:if test="${basd.dictIsEditable!=0}">
			<img onclick="to('../basd/toEdit?dictId=${basd.dictId}');" title="编辑" src="../images/bt_edit.gif" class="op_button" />
			<img onclick="to('../basd/delete?dictId=${basd.dictId}');" title="删除" src="../images/bt_del.gif" class="op_button" />
		</c:if>
		
		</td>
	</tr>
	</c:forEach>
	<tr>
		<th colspan="6" class="pager">
<form action="../basd/list" id="go">
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
	       <a href="../basd/list?pageNum=1&dictType=${basd.dictType}&dictItem=${basd.dictItem}&dictValue=${basd.dictValue}&pageSize=${pageInfo.pageSize}">首页</a>
	      </c:otherwise> 
    </c:choose>
	
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum<=1}">   
	 		<a href="javascript:void(0)">上一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../basd/list?pageNum=${pageInfo.pageNum-1}&dictType=${basd.dictType}&dictItem=${basd.dictItem}&dictValue=${basd.dictValue}&pageSize=${pageInfo.pageSize}">上一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">下一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../basd/list?pageNum=${pageInfo.pageNum+1}&dictType=${basd.dictType}&dictItem=${basd.dictItem}&dictValue=${basd.dictValue}&pageSize=${pageInfo.pageSize}">下一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">最后一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../basd/list?pageNum=${pageInfo.totalPage}&dictType=${basd.dictType}&dictItem=${basd.dictItem}&dictValue=${basd.dictValue}&pageSize=${pageInfo.pageSize}">最后一页</a>
	      </c:otherwise> 
   </c:choose>


	转到<input name="pageNum" value="${pageInfo.pageNum}" size="2" />页
	<!-- 触发提交，直接改成save('go') -->
	<input  type="hidden" name="dictType" value="${pageInfo.entity.dictType}"/>
	<input type="hidden" name="dictItem" value="${pageInfo.entity.dictItem}"/>
	<input type="hidden" name="dictValue" value="${pageInfo.entity.dictValue}" size="20" />
	
	<button width="20" onclick="save('go')">GO</button>
</div>
</form>
		</th>
	</tr>
</table>
</body>
</html>