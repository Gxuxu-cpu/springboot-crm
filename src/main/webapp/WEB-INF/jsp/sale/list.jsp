<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>销售机会管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

<div class="page_title">销售机会管理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('toAdd');">新建</button>  
	<button class="common_button" onclick="save('salChance');">查询</button> 
	</div>
<!-- 使用form标签可以把table包裹起来，并且发送请求
	 只有pageInfo传递到前台
	
 -->
<form action="../sale/list" id="salChance">
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
		<th>操作</th>
	</tr>
	<!-- 使用pageInfo进行分页查询 就不是 ${saleChanceLists}-->
	
	<c:forEach items="${pageInfo.lists}" var="saleChance" >
		<tr>
			<td class="list_data_number">${saleChance.chcId}</td>
			<td class="list_data_text">${saleChance.chcCustName}</td>
			<td class="list_data_ltext">${saleChance.chcTitle}</td>
			<td class="list_data_text">${saleChance.chcLinkman}</td>
			<td class="list_data_text">${saleChance.chcTel}</td>
			<!-- 显示格式化后的日期？？？ -->
			<td class="list_data_text"><fmt:formatDate value="${saleChance.chcCreateDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			<td class="list_data_op">
				<img onclick="to('toDispatch?chcId=${saleChance.chcId}');" title="指派" src="../images/bt_linkman.gif" class="op_button" />
				<!-- 把to中的参数替换handler的地址  sale/toEdit -->
				<img onclick="to('toEdit?chcId=${saleChance.chcId}');" title="编辑" src="../images/bt_edit.gif" class="op_button" />
				<img onclick="del('delete?chcId=${saleChance.chcId}');" title="删除" src="../images/bt_del.gif" class="op_button" />
				
			</td>
		</tr>
	</c:forEach>
	<!-- 
		<tr>
			<td class="list_data_number">1</td>
			<td class="list_data_text">睿智数码</td>
			<td class="list_data_ltext">采购笔记本电脑意向</td>
			<td class="list_data_text">刘先生</td>
			<td class="list_data_text">13729239239</td>
			<td class="list_data_text">2007年12月06日</td>
			<td class="list_data_op">
				<img onclick="to('dispatch.html');" title="指派" src="../images/bt_linkman.gif" class="op_button" />
				<img onclick="to('edit.html');" title="编辑" src="../images/bt_edit.gif" class="op_button" />
				<img onclick="del('“销售机会：采购笔记本电脑意向”');" title="删除" src="../images/bt_del.gif" class="op_button" />
				
			</td>
		</tr>
	 -->
	<tr>
		<th colspan="7" class="pager">
<form action="../sale/list" id="go">
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
	       <a href="../sale/list?pageNum=1&chcCustName=${pageInfo.entity.chcCustName}&chcTitle=${pageInfo.entity.chcTitle}&chcLinkman=${pageInfo.entity.chcLinkman}&pageSize=${pageInfo.pageSize}">首页</a>
	      </c:otherwise> 
    </c:choose>
	
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum<=1}">   
	 		<a href="javascript:void(0)">上一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../sale/list?pageNum=${pageInfo.pageNum-1}&chcCustName=${pageInfo.entity.chcCustName}&chcTitle=${pageInfo.entity.chcTitle}&chcLinkman=${pageInfo.entity.chcLinkman}&pageSize=${pageInfo.pageSize}">上一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">下一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../sale/list?pageNum=${pageInfo.pageNum+1}&chcCustName=${pageInfo.entity.chcCustName}&chcTitle=${pageInfo.entity.chcTitle}&chcLinkman=${pageInfo.entity.chcLinkman}&pageSize=${pageInfo.pageSize}">下一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">最后一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../sale/list?pageNum=${pageInfo.totalPage}&chcCustName=${pageInfo.entity.chcCustName}&chcTitle=${pageInfo.entity.chcTitle}&chcLinkman=${pageInfo.entity.chcLinkman}&pageSize=${pageInfo.pageSize}">最后一页</a>
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