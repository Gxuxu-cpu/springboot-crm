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


<div class="page_title">角色管理 &gt; 分配权限</div>
<div class="button_bar"><button class="common_button" onclick="javascript:history.go(-1);">返回</button>
<button class="common_button" onclick="save('roleForm')">保存</button> </div>
<form id="roleForm" action="../role/roleManage" method="post"> 

<input type="hidden" value="${sysRole.roleId}" id="roleId" name="roleId">
<table class="query_form_table" cellspacing="0" cellpadding="3" border="0">
  <tbody>
  <tr>
    <th class="input_title" width="10%">角色名</th>
    <td class="input_content" width="20%">${sysRole.roleName} </td>
    <th class="input_title" width="10%">角色描述</th>
    <td class="input_content" width="20%">${sysRole.roleDesc} 管理所有操作
    </td>
    <th class="input_title" width="10%">状态是否正常</th>
    <td class="input_content" width="20%">
       ${sysRole.roleFlag==1?"是":"否"} </td></tr>
  <tr>
    <th class="input_title" valign="top">权限</th>
    <TD class=input_content vAlign=top colSpan=5>
    <!-- 遍历sysRightList 一级菜单=》right_type=Folder -->
    <c:forEach items="${sysRightList}" var="right">
    	<c:if test="${right.rightType=='Folder'}">
	    	<DIV>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
	       	${right.rightText}
	      	<INPUT type=checkbox value="${right.rightCode}" name=selectedRights> </DIV>
    	</c:if>
    	<c:if test="${right.rightType=='Document'}">
	    	<DIV>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	       	${right.rightText}
	      	<INPUT type=checkbox value="${right.rightCode}" name=selectedRights> </DIV>
    	</c:if>
    </c:forEach>
	
	<!-- 遍历sysRoleRight  rf_right_code right.rightCode
		使用js来获取 name 等于selectedRights 元素
		遍历这些元素，js(元素的.value) =EL{right.rfRightCode}  就让该元素被选中
	-->
	<script type="text/javascript">
		var roles=document.getElementsByName("selectedRights")
	</script>
	<!-- 遍历sysRoleRightList =》right.rfRightCode -->
	<c:forEach items="${sysRoleRightList}" var="right">
		<script type="text/javascript">
		   for(var i=0;i<roles.length;i++){
			   if(roles[i].value=='${right.rfRightCode}'){
				   roles[i].checked=true;
			   }
		   }
		</script>
	</c:forEach>
	
      
  </td></tr></tbody></table></form>
</body></html>