<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>服务分配</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript">
function toto(aa){
	var td0=$(aa).parents("tr").find("td").eq(0).text(); 
	var td1=$(aa).parents("tr").find("td").eq(6).find("select option:selected").text();  
	var td2=$(aa).parents("tr").find("td").eq(6).find("select option:selected").val();  
	var svrDueDate=$("#svrDueDate").val();
     console.log(td0)
     console.log(td1)
     console.log(td2)
     console.log(svrDueDate)
     window.location.href='../service/dispatch?svrId='+td0+'&svrDueId='+td2+'&svrDueTo='+td1+'&svrDueDate='+svrDueDate;
}
	
</script>
</head>
<body>

	<div class="page_title">客户服务管理 > 服务分配</div>
	<div class="button_bar">
		<button class="common_button" onclick="help('');">帮助</button>
		<button class="common_button" onclick="save('service')">查询</button>
	</div>
	<form action="../service/list" id="service">
		<table class="query_form_table" height="53">
			<tr>
				<th height="28">客户</th>
				<td><input name="svrCustName"
					value="${pageInfo.entity.svrCustName}" /></td>
				<th height="28">概要</th>
				<td><input name="svrTitle" value="${pageInfo.entity.svrTitle}" /></td>
				<th height="28">服务类型</th>
				<td><select name="svrType">
						<option value="a">全部</option>
						<c:forEach items="${typeList}" var="type">
							<option ${pageInfo.entity.svrType==type.dictItem?'selected':''}
								value="${type.dictItem}">${type.dictItem}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<th height="22">创建日期</th>
				<td colspan="3"><input name="ok"
					value="${pageInfo.entity.svrCreateDate}" /></td>
				<th height="22">状态</th>
				<td><select name="svrStatus">
						<option ${pageInfo.entity.svrStatus=="新创建"} value="新创建">新创建</option>
				</select></td>
			</tr>
		</table>
	</form>
	<br />
	<table class="data_list_table">
		<tr>
			<th>编号</th>
			<th>客户</th>
			<th>概要</th>
			<th>服务类型</th>
			<th>创建人</th>
			<th>创建日期</th>
			<th>分配给</th>
			<th>操作</th>
		</tr>
		<input id="svrDueDate" type="hidden" name="svrDueDate" value="<fmt:formatDate value="${cstService.svrDueDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly size="20" />
		<c:forEach items="${pageInfo.lists}" var="service">
		
			<tr>
			   
				<td id="svrId" class="list_data_number">${service.svrId}</td>
				<td class="list_data_text">${service.svrCustName}</td>
				<td class="list_data_ltext">${service.svrTitle}</td>
				<td class="list_data_text">${service.svrType}</td>
				<td class="list_data_text">${service.svrCreateBy}</td>
				<td class="list_data_text">
				<fmt:formatDate value="${service.svrCreateDate}" pattern="yyyy-MM-dd HH:mm:ss" />
				</td>
				<td class="list_data_text">
				
				<select name="svrDueId" id="svrDueId">
			    <option value="">全部</option>
				<c:forEach items="${managerList}" var="manager">
					<option ${service.svrDueTo==manager.usrName?'selected':''}  value="${manager.usrId}">${manager.usrName}</option>
				</c:forEach>
				</select>
				
				<button class="common_button" onclick="toto(this)">分配</button>  
				</td>
				<td class="list_data_op">
				<img onclick="to('../service/delete?svrId=${service.svrId}');" title="删除"
					src="${pageContext.request.contextPath}/images/bt_del.gif" class="op_button" />
				</td>
			</tr>
		</c:forEach>
		<tr>
			<th colspan="8" class="pager">
<form action="../service/list" id="go">
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
	       <a href="../service/list?pageNum=1&svrCustName=${pageInfo.entity.svrCustName}&svrTitle=${pageInfo.entity.svrTitle}&svrType=${pageInfo.entity.svrType}&ok=${pageInfo.entity.svrCreateDate}&svrStatus=${pageInfo.entity.svrStatus}&pageSize=${pageInfo.pageSize}">首页</a>
	      </c:otherwise> 
    </c:choose>
	
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum<=1}">   
	 		<a href="javascript:void(0)">上一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../service/list?pageNum=${pageInfo.pageNum-1}&svrCustName=${pageInfo.entity.svrCustName}&svrTitle=${pageInfo.entity.svrTitle}&svrType=${pageInfo.entity.svrType}&ok=${pageInfo.entity.svrCreateDate}&svrStatus=${pageInfo.entity.svrStatus}&pageSize=${pageInfo.pageSize}">上一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">下一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../service/list?pageNum=${pageInfo.pageNum+1}&svrCustName=${pageInfo.entity.svrCustName}&svrTitle=${pageInfo.entity.svrTitle}&svrType=${pageInfo.entity.svrType}&ok=${pageInfo.entity.svrCreateDate}&svrStatus=${pageInfo.entity.svrStatus}&pageSize=${pageInfo.pageSize}">下一页</a>
	      </c:otherwise> 
    </c:choose>
	
	<c:choose> 
	     <c:when test="${pageInfo.pageNum >= pageInfo.totalPage}">   
	 		<a href="javascript:void(0)">最后一页</a>
	 	 </c:when>      

	     <c:otherwise>  <!--否则 -->    
	       <a href="../service/list?pageNum=${pageInfo.totalPage}&svrCustName=${pageInfo.entity.svrCustName}&svrTitle=${pageInfo.entity.svrTitle}&svrType=${pageInfo.entity.svrType}&ok=${pageInfo.entity.svrCreateDate}&svrStatus=${pageInfo.entity.svrStatus}&pageSize=${pageInfo.pageSize}">最后一页</a>
	      </c:otherwise> 
   </c:choose>


	转到<input name="pageNum" value="${pageInfo.pageNum}" size="2" />页
	<!-- 触发提交，直接改成save('go') -->
	<input  type="hidden" name="svrCustName" value="${pageInfo.entity.svrCustName}"/>
	<input type="hidden" name="svrTitle" value="${pageInfo.entity.svrTitle}"/>
	<input type="hidden" name="svrType" value="${pageInfo.entity.svrType}" size="20" />
	<input type="hidden" name="ok" value="${pageInfo.entity.svrCreateDate}"/>
	<input type="hidden" name="svrStatus" value="${pageInfo.entity.svrStatus}"/>
	<button width="20" onclick="save('go')">GO</button>
</div>
</form>
			</th>
		</tr>
	</table>
</body>

</html>