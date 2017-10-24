<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
</head>
<body>
	<form action="addUsers" method="post">
		<table>
			<tr>
				<td>--昵称：</td>
				<td><input type="text" name="user.name" /></td>
			</tr>
			<tr>
				<td>--账户：</td>
				<td><input type="text" name="user.username" /></td>
			</tr>
			<tr>
				<td>--密码：</td>
				<td><input type="password" name="user.password" /></td>
			</tr>
			<tr>
				<td>--状态：</td>
				<td><input type="text" name="user.status" /></td>
			</tr>
			<tr>
				<td>--邮箱：</td>
				<td><input type="text" name="user.email" /></td>
			</tr>
			<tr>
				<td><button type="submit">添加</button></td>
				<td><button onclick="javascript:history.go(-1)">返回</button></td>
			</tr>
		</table>
	</form>
</body>
</html>