<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/style.css">
</head>

<body>
	<form action="Login" onsubmit="return login()" method="post">
		<div class="bg">
			<div class="div_right">
				<div class="div_right_top"></div>
				<div class="group">
					用户名： <input type="text" placeholder="请输入您的用户名！" id="userName"
						value="" name="user.username" />
				</div>
				<div class="group">
					密&nbsp;&nbsp;&nbsp;码： <input type="password" placeholder="请输入您的密码！"
						id="pass" value="" name="user.password" />
				</div>
				<div class="rememberPass">
					<input type="checkbox" name="rememberPassword" />记住密码
				</div>
				<div class="controlButton">
					<button type="submit">登录</button>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="register.jsp">
						<button type="button">注册</button>
					</a>
				</div>
			</div>
		</div>
	</form>
	<script type="text/javascript">
		function login() {
			var username = document.getElementById("userName").value;
			var password = document.getElementById("pass").value;
			if (username == "") {
				alert("用户名不允许为空！")
				return false;
			} else if (password == "") {
				alert("密码不允许为空！");
				return false;
			}
			return true;
		}
	</script>
</body>

</html>