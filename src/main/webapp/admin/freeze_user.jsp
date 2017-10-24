<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>冻结账号</title>
</head>
<body>
	<form action="LoginAndRedisterAction!updateUsers" method="post">
		<table>
			<tr>
				<td>状态:</td>
				<td><input type="text" name="status"
					value="${ userModel.status}"></td>
					<td><input type="submit" value="冻结"/></td>
			</tr>
		</table>
	</form>
</body>
</html>