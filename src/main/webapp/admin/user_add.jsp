<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

</head>
<body>
	<form action="addUsers" onsubmit="return validate_useradd1()" method="post">
		<table>
			<tr>
				<td>--昵称：</td>
				<td><input type="text" id="name1" name="user.name" /></td>
			</tr>
			<tr>
				<td>--账户：</td>
				<td><input type="text" id="username1" name="user.username" /></td>
			</tr>
			<tr>
				<td>--密码：</td>
				<td><input type="password" id="password1" name="user.password" /></td>
			</tr>
			<tr>
				<td>--状态：</td>
				<td><input type="text" id="status1" name="user.status" /></td>
			</tr>
			<tr>
				<td>--邮箱：</td>
				<td><input type="text" id="email1" name="user.email" /></td>
			</tr>
			<tr>
				<td><button type="submit">添加</button></td>
				<td><button onclick="javascript:history.go(-1)">返回</button></td>
			</tr>
		</table>
	</form>
</body>
<script type="text/javascript" src="js/user_add1.js"></script>
</html>