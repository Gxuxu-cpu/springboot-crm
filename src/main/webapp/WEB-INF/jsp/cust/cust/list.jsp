<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>   
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>客户信息管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
</head>
<body>

<div class="page_title">客户信息管理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
    <button class="common_button" onclick="to('../cust/toAdd');">新建</button>  
	<button class="common_button" onclick="save('customer')">查询</button>  
</div>
<form action="../cust/list" id="customer">
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td><input name="custNo" value="${pageInfo.entity.custNo}"/></td>
		<th>名称</th>
		<td><input name="custName" value="${pageInfo.entity.custName}"/></td>
		<th>地区</th>
		<td>
			<select name="custRegion">
				<option value="">全部</option>
				<c:forEach items="${regionList}" var="region">
					<!-- 查询完数据之后，查询条件在返回到前端，
						比如查的北京，再返回北京。需要和下拉菜单判断，
						如果量者相同就默认选中
						确定回传条件 custRegion 是和地区相匹配=>获取到 custRegion然后和下拉菜单的region.dictItem
						回传只有pageInfo=》从pageInfo中获取custRegion 
					 -->
					<option ${pageInfo.entity.custRegion==region.dictItem?'selected':''} value="${region.dictItem}">${region.dictItem}</option>
				</c:forEach>
			</select>
		</td>
	</tr>
	<tr>
		<th>客户经理</th>
		<td><input name="custManagerName" value="${pageInfo.entity.custManagerName}"/></td>
		<th>客户等级</th>
		<td>
			<select name="custLevelLabel">
			    <option value="">全部</option>
				<c:forEach items="${levels}" var="level">
					<!-- 根据地区的思路，把等级写完 -->
					<option ${pageInfo.entity.custLevelLabel==level.dictItem?'selected':''}  value="${level.dictItem}">${level.dictItem}</option>
				</c:forEach>
			</select>
		</td>
		<th></th>
		<td></td>
	</tr>
</table>
</form>
<br />
<table class="data_list_table">
	<tr>
		<th>序号</th>
		<th>客户编号</th>
		<th>名称</th>
		<th>地区</th>
		<th>客户经理</th>
		<th>客户等级</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${pageInfo.lists}" var="customer" varStatus="status">
	<tr>
		<td class="list_data_number">${status.index+1}</td>
		<td class="list_data_text">${customer.custNo}</td>
		<td class="list_data_ltext">${customer.custName}</td>
		<td class="list_data_text">${customer.custRegion}</td>
		<td class="list_data_text">${customer.custManagerName}</td>
		<td class="list_data_text">${customer.custLevelLabel}</td>
		<td class="list_data_op">
		
		<c:choose>
			<c:when test="${customer.custStatus==1}">
				<img onclick="to('../cust/toEdit?custNo=${customer.custNo}');" title="编辑" src="${pageContext.request.contextPath}/images/bt_edit.gif" class="op_button" />
				<img onclick="to('../linkman/list?custNo=${customer.custNo}&custName=${customer.custName}');" title="联系人" src="${pageContext.request.contextPath}/images/bt_linkman.gif" class="op_button" />
				<img onclick="to('../activity/list?custNo=${customer.custNo}&custName=${customer.custName}');" title="交往记录" src="${pageContext.request.contextPath}/images/bt_acti.gif" class="op_button" />
				<!-- 因为后台方法应该是Orders对象接收数据，odr_cust_no ，odr_customer -->
				<img onclick="to('../orders/list?odrCustNo=${customer.custNo}&odrCustomer=${customer.custName}');" title="历史订单" src="${pageContext.request.contextPath}/images/bt_orders.gif" class="op_button" />
				<img onclick="to('../cust/delete?custNo=${customer.custNo}');" title="删除" src="${pageContext.request.contextPath}/images/bt_del.gif" class="op_button" />
				<img title="流失管理" src="${pageContext.request.contextPath}/images/bt_relay.gif" class="op_button" />
			
			</c:when>
			<c:otherwise>
				<img onclick="to('../linkman/list?custNo=${customer.custNo}&custName=${customer.custName}');" title="联系人" src="${pageContext.request.contextPath}/images/bt_linkman.gif" class="op_button" />
				<img onclick="to('../activity/list?custNo=${customer.custNo}&custName=${customer.custName}');" title="交往记录" src="${pageContext.request.contextPath}/images/bt_acti.gif" class="op_button" />
				<img onclick="to('../orders/list?odrCustNo=${customer.custNo}&odrCustomer=${customer.custName}');" title="历史订单" src="${pageContext.request.contextPath}/images/bt_orders.gif" class="op_button" />
				<img onclick="to('../cust/delete?custNo=${customer.custNo}');" title="删除" src="${pageContext.request.contextPath}/images/bt_del.gif" class="op_button" />
			</c:otherwise>
		</c:choose>
		</td>
	</tr>
	</c:forEach>
	<tr>
		<th colspan="100" class="pager">
<form action="../cust/list" id="go">
<div class="pager">
	共${pageInfo.totalCount}条记录 每页<input name="pageSize" value="${pageInfo.pageSize}" size="2" />条
	第${pageInfo.pageNum} 页/共${pageInfo.totalPage}页
	<!-- pageInfo接收参数，所有只能用pageInfo的属性来接收参数 
	   当当前pageNum是第一页的时候，超链接不能点击
	   条件查询之后发现超链接点击不起作用，没有相关的参数
	  拼接查询条件
	  ?pageNum=1&custNo=${pageInfo.entity.custNo}&custName=${pageInfo.entity.custName}&custManagerName=${pageInfo.entity.custManagerName}&pageSize=${pageInfo.pageSize}&custRegion=${pageInfo.entity.custRegion}&custLevelLabel=${pageInfo.entity.custLevelLabel}
		&custRegion=${pageInfo.entity.custRegion}&custLevelLabel=${pageInfo.entity.custLevelLabel}
	-->
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum==1}">   
	 		<a href="javascript:void(0)">首页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../cust/list?pageNum=1&custNo=${pageInfo.entity.custNo}&custName=${pageInfo.entity.custName}&custManagerName=${pageInfo.entity.custManagerName}&pageSize=${pageInfo.pageSize}&custRegion=${pageInfo.entity.custRegion}&custLevelLabel=${pageInfo.entity.custLevelLabel}">首页</a>
	      </c:otherwise> 
    </c:choose>
	
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum<=1}">   
	 		<a href="javascript:void(0)">上一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../cust/list?pageNum=${pageInfo.pageNum-1}&custNo=${pageInfo.entity.custNo}&custName=${pageInfo.entity.custName}&custManagerName=${pageInfo.entity.custManagerName}&pageSize=${pageInfo.pageSize}&custRegion=${pageInfo.entity.custRegion}&custLevelLabel=${pageInfo.entity.custLevelLabel}">上一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">下一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../cust/list?pageNum=${pageInfo.pageNum+1}&custNo=${pageInfo.entity.custNo}&custName=${pageInfo.entity.custName}&custManagerName=${pageInfo.entity.custManagerName}&pageSize=${pageInfo.pageSize}&custRegion=${pageInfo.entity.custRegion}&custLevelLabel=${pageInfo.entity.custLevelLabel}">下一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">最后一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../cust/list?pageNum=${pageInfo.totalPage}&custNo=${pageInfo.entity.custNo}&custName=${pageInfo.entity.custName}&custManagerName=${pageInfo.entity.custManagerName}&pageSize=${pageInfo.pageSize}&custRegion=${pageInfo.entity.custRegion}&custLevelLabel=${pageInfo.entity.custLevelLabel}">最后一页</a>
	      </c:otherwise> 
   </c:choose>


	转到<input name="pageNum" value="${pageInfo.pageNum}" size="2" />页
	<!-- 触发提交，直接改成save('go') -->
	<input  type="hidden" name="custNo" value="${pageInfo.entity.custNo}"/>
	<input type="hidden" name="custName" value="${pageInfo.entity.custName}"/>
	<input type="hidden" name="custManagerName" value="${pageInfo.entity.custManagerName}" size="20" />
	<input type="hidden" name="custRegion" value="${pageInfo.entity.custRegion}"/>
	<input type="hidden" name="custLevelLabel" value="${pageInfo.entity.custLevelLabel}"/>
	<button width="20" onclick="save('go')">GO</button>
</div>
</form>
		</th>
	</tr>
</table>
</body>
</html>