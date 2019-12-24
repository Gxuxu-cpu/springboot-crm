<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>编辑数据字典条目</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script src="../script/common.js"></script>
<script src="../js/jquery.min.js"></script>
<script type="text/javascript">
function selectTypes(){
	$.ajax({
		url:'../basd/distinctType',
		type:'post',
		data:'type='+$("#inputType").val(),
		dataType:'json',
		success:function(data){
			$("#types").html()
			var str=''
			$.each(data,function(index,type_){
				str += '<option value='+type_+'>'
			})
			console.log(str)
			$("#types").html(str)
		}
	})
}

</script>
</head>
<body>

<div class="page_title">数据字典管理 > 编辑数据字典条目</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="save('basd');">保存</button>  
</div>
<form action="../basd/edit" id="basd">
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><input readonly name="dictId" value="${dict.dictId}"/></td>
		<th>类别</th>
		<td><input id="inputType" name="dictType" value="${dict.dictType}" list="types" onkeydown="selectTypes()" onfocus="selectTypes()"/>
			<datalist id="types">				
			</datalist>
		<span class="red_star">*</span><br /></td>
	</tr>
	<tr>
		<th>条目</th>
		<td><input name="dictItem" value="${dict.dictItem}"/><span class="red_star">*</span></td>
		<th>值</th>
		<td><input name="dictValue" value="${dict.dictValue}"/><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>是否可编辑</th>
		<td><input type="checkbox" ${dict.dictIsEditable==1?"checked":""}  value="1" name="dictIsEditable"/></td>
		<th>&nbsp;</th>
		<td>&nbsp;</td>
	</tr>
</table>
</form>
</body>
</html>