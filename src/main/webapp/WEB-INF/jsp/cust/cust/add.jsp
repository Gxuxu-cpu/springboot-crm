<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<html>
<head>
<title>客户信息</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/script/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<!-- 提交直接给隐藏域中的数据赋值 -->
<script type="text/javascript">
function saveForm(){
	//获取到选择的值
	var managerName = $("#custManagerId option:selected").text();
	var levelName = $("#custLevel option:selected").text();
	//把这个值赋给隐藏域
	$("#custManagerName").val(managerName)
	$("#custLevelLabel").val(levelName)
	$("#cstCustomer").submit();
}

</script>
</head>
<body>

<div class="page_title">客户信息管理 > 客户信息添加</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>

	
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="saveForm();">保存</button>
</div>
<form action="../cust/add" id="cstCustomer">
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td><input name="custNo" value="${cstCustomer.custNo}"/></td>
		<th>名称</th>
		<td><input  name="custName"  /><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>地区</th>
		<td>
			<select name="custRegion">
				<option value="北京">全部</option>
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
			<span class="red_star">*</span></td>
		<th>客户经理</th>
		<td>
			<select name="custManagerId" id="custManagerId">
			    <option value="a">全部</option>
				<c:forEach items="${managerList}" var="manager">
					<option ${pageInfo.entity.custManagerName==manager.usrName?'selected':''}  value="${manager.usrId}">${manager.usrName}</option>
				</c:forEach>
			</select>
			<input name="custManagerName" type="hidden" id="custManagerName">
			<span class="red_star">*</span>
		</td>
	</tr>	
	<tr>
		<th>客户等级</th>
		<td>
			<select name="custLevel" id="custLevel">
			    <option value="普通客户">全部</option>
				<c:forEach items="${levels}" var="level">
					<option ${pageInfo.entity.custLevelLabel==level.dictItem?'selected':''}  value="${level.dictValue}">${level.dictItem}</option>
				</c:forEach>
			</select>
			<input type="hidden" name="custLevelLabel" id="custLevelLabel">
			<span class="red_star">*</span>
		</td>
		<th>　</th>
		<td>　</td>
	</tr>
	<tr>
		<th>客户满意度</th>
		<td>
			<select name="custSatisfy">
			 <option value="3">未指定</option>
					<option value="5">☆☆☆☆☆</option>
					<option value="4">☆☆☆☆</option>
					<option value="3">☆☆☆</option>
					<option value="2">☆☆</option>
					<option value="1">☆</option></select><span class="red_star">*</span>
		</td>
		<th>客户信用度</th>
		<td>
			<select name="custCredit"><option value="3">未指定</option>
					<option value="5">☆☆☆☆☆</option>
					<option value="4">☆☆☆☆</option>
					<option value="3" selected="selected">☆☆☆</option>
					<option value="2">☆☆</option>
					<option value="1">☆</option></select><span class="red_star">*</span>
		</td>
	</tr>
</table>
<br />
<table class="query_form_table" id="table1">
	<tr>
		<th>地址</th>
		<td><input value=""  name="custAddr"/><span class="red_star">*</span>
		</td>
		<th>邮政编码</th>
		<td><input  name="custZip" size="20" /><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>电话</th>
		<td>
			<input  name="custTel" size="20"  /><span class="red_star">*</span></td>
		<th>传真</th>
		<td>
			<input  name="custFax"  /><span class="red_star">*</span>
		</td>
	</tr>	
	<tr>
		<th>网址</th>
		<td>
			<input  name="custWebsite" size="20"  /><span class="red_star">*</span>
		</td>
		<th>　</th>
		<td>　</td>
	</tr>
</table>
<br />
<table class="query_form_table" id="table2">
	<tr>
		<th>营业执照注册号</th>
		<td><input value="" name="custLicenceNo"  size="20" /></td>
		<th>法人</th>
		<td><input  name="custChieftain" size="20" /><span class="red_star">*</span>
		</td>
	</tr>
	<tr>
		<th>注册资金（万元）</th>
		<td>
			<input value="" name="custBankroll" size="20" /> </td>
		<th>年营业额</th>
		<td>
			<input value="" name="custTurnover" size="20" />
		</td>
	</tr>	
	<tr>
		<th>开户银行</th>
		<td>
			<input value="" name="custBank" size="20" /><span class="red_star">*</span>
		</td>
		<th>银行帐号</th>
		<td><input value="" name="custBankAccount" size="20" /><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>地税登记号</th>
		<td>
			<input value="" name="custLocalTaxNo" size="20" /></td>
		<th>国税登记号</th>
		<td><input value="" name="custNationalTaxNo" size="20" /></td>
	</tr>
</table>
</form>
<p>　</p>
</body>
</html>