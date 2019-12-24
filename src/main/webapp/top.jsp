<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>客户关系管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>

<body style="border-bottom: solid 1px #666;">

	<TABLE style="width: 100%;">
		<TR>
			<td></td>
			<td style="font-family: 黑体; font-size: 33px; font-weight: bold;">
				客户关系管理系统</td>
			<td width="25%" align="right" style="font-size: 12px;"
				valign="bottom">当前用户：${user.usrName}&nbsp;&nbsp;
				<a href="sysUser/login">安全退出</a>
			</td>
		</tr>
	</table>
</body>
</html>