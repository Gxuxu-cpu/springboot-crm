<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>   
<html lang="zh-CN"><head><title>角色管理 - 分配权限</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
<script type="text/javascript">
function  toUrl()
{
    //alert(Obj("roleId").value);
    Obj("roleForm").submit();

}

</script>
</head>
<body marginwidth="0" marginheight="0">


<div class="page_title">权限管理 &gt; 列表显示</div>
<div class="button_bar"><button class="common_button" onclick="javascript:history.go(-1);">返回</button>
<button class="common_button" onclick="save('roleForm')">保存</button> </div>
<form id="roleForm" action="../role/roleManage" method="post"> 

<input type="hidden" value="${sysRole.roleId}" id="roleId" name="roleId">
<table class="query_form_table" cellspacing="0" cellpadding="3" border="0">
  <tbody>

  <tr>
    <TD class=input_content vAlign=top colSpan=5>
    <!-- 遍历sysRightList 一级菜单=》right_type=Folder -->
    <c:forEach items="${rightList}" var="right">
    	<c:if test="${right.rightType=='Folder'}">
	    	<DIV>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
	       	${right.rightText}
	      	<img onclick="to('../role/toRightAdd?rightParentCode=${right.rightCode}&rightText=${right.rightText}');" title="添加子模块" src="${pageContext.request.contextPath}/images/plus.png" class="op_button"> </DIV>
    	</c:if>
    	<c:if test="${right.rightType=='Document'}">
	    	<DIV>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	       	${right.rightText}
	      	<img onclick="to('../role/toRightEdit?rightCode=${right.rightCode}');" title="编辑" src="${pageContext.request.contextPath}/images/bt_edit.gif" class="op_button">
	      	<img onclick="to('../role/rightDelete?rightCode=${right.rightCode}');" title="删除" src="${pageContext.request.contextPath}/images/bt_del.gif" class="op_button"> </DIV>
    	</c:if>
    </c:forEach>

  </td></tr></tbody></table></form>
</body></html>