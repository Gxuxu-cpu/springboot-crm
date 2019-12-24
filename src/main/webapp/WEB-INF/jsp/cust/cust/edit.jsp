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

<div class="page_title">客户信息管理 > 客户信息编辑</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>

	
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="saveForm();">保存</button>
</div>
<form action="../cust/edit" id="cstCustomer">
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td><input name="custNo" value="${cstCustomer.custNo}"/></td>
		<th>名称</th>
		<td><input  name="custName" value="${cstCustomer.custName}" /><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>地区</th>
		<td>
			<select name="custRegion">
				<option value="">全部</option>
				<c:forEach items="${regionList}" var="region">
					<!-- 
						cstCustomer中得到地区，和当前遍历的值相比
					 -->
					<option ${cstCustomer.custRegion==region.dictItem?'selected':''} value="${region.dictItem}">${region.dictItem}</option>
				</c:forEach>
			</select>
			<span class="red_star">*</span></td>
		<th> ${cstCustomer.custManagerName}</th>
		<td>
			<select name="custManagerId" id="custManagerId">
			    <option value="">全部 </option>
				<c:forEach items="${managerList}" var="manager">
				    <!-- 当数据库中的custManagerName和遍历的manager.usrName一致，被选中 -->
					<option ${cstCustomer.custManagerName==manager.usrName?'selected':''}  value="${manager.usrId}">${manager.usrName}</option>
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
			    <option value="">全部</option>
				<c:forEach items="${levels}" var="level">
					<option ${cstCustomer.custLevelLabel==level.dictItem?'selected':''}  value="${level.dictValue}">${level.dictItem}</option>
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
			 <option value="">未指定</option>
					<option value="5" ${cstCustomer.custSatisfy==5?'selected':''} >☆☆☆☆☆</option>
					<option value="4" ${cstCustomer.custSatisfy==4?'selected':''} >☆☆☆☆</option>
					<option value="3" ${cstCustomer.custSatisfy==3?'selected':''} >☆☆☆</option>
					<option value="2" ${cstCustomer.custSatisfy==2?'selected':''} >☆☆</option>
					<option value="1" ${cstCustomer.custSatisfy==1?'selected':''} >☆</option></select><span class="red_star">*</span>
		</td>
		<th>客户信用度</th>
		<td>
			<select name="custCredit"><option value="">未指定</option>
					<option value="5" ${cstCustomer.custCredit==5?'selected':''} >☆☆☆☆☆</option>
					<option value="4" ${cstCustomer.custCredit==4?'selected':''} >☆☆☆☆</option>
					<option value="3" ${cstCustomer.custCredit==3?'selected':''} >☆☆☆</option>
					<option value="2" ${cstCustomer.custCredit==2?'selected':''} >☆☆</option>
					<option value="1" ${cstCustomer.custCredit==1?'selected':''} >☆</option></select><span class="red_star">*</span>
		</td>
	</tr>
</table>
<br />
<table class="query_form_table" id="table1">
			<tr>
				<th>地址</th>
				<td><input value="${cstCustomer.custAddr}" name="custAddr" /><span class="red_star">*</span>
				</td>
				<th>邮政编码</th>
				<td><input name="custZip" value="${cstCustomer.custZip}" size="20" /><span class="red_star">*</span></td>
			</tr>
			<tr>
				<th>电话</th>
				<td><input name="custTel" value="${cstCustomer.custTel}" size="20" /><span class="red_star">*</span></td>
				<th>传真</th>
				<td><input name="custFax" value="${cstCustomer.custFax}" size="20" /><span class="red_star">*</span>
				</td>
			</tr>
			<tr>
				<th>网址</th>
				<td><input name="custWebsite" value="${cstCustomer.custWebsite}"  size="20" /><span
					class="red_star">*</span></td>
				<th></th>
				<td></td>
			</tr>
		</table>
		<br />
		<table class="query_form_table" id="table2">
			<tr>
				<th>营业执照注册号</th>
				<td><input value="${cstCustomer.custLicenceNo}" name="custLicenceNo" size="20" /></td>
				<th>法人</th>
				<td><input name="custChieftain" value="${cstCustomer.custChieftain}" size="20" /><span
					class="red_star">*</span></td>
			</tr>
			<tr>
				<th>注册资金（万元）</th>
				<td><input value="${cstCustomer.custBankroll}" name="custBankroll" size="20" /></td>
				<th>年营业额</th>
				<td><input value="${cstCustomer.custTurnover}" name="custTurnover" size="20" /></td>
			</tr>
			<tr>
				<th>开户银行</th>
				<td><input value="${cstCustomer.custBank}" name="custBank" size="20" /><span
					class="red_star">*</span></td>
				<th>银行帐号</th>
				<td><input value="${cstCustomer.custBankAccount}" name="custBankAccount" size="20" /><span
					class="red_star">*</span></td>
			</tr>
			<tr>
				<th>地税登记号</th>
				<td><input value="${cstCustomer.custLocalTaxNo}" name="custLocalTaxNo" size="20" /></td>
				<th>国税登记号</th>
				<td><input value="${cstCustomer.custNationalTaxNo}" name="custNationalTaxNo" size="20" /></td>
			</tr>
		</table>
</form>
<p>　</p>
</body>
</html>