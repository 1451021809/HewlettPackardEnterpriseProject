<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/registerStyle.css">
</head>

<body>
		<form onsubmit="return alterPassword()" method="post" action="UserMange_alterPassword">
	<div class="body">
		<header>
			<label>用户注册</label>
		</header>

			<div class="body-bodyer">
				<div class="password">
					<label for="password">新密码:</label> <input type="password"
						id="password" name="userModel.password" placeholder="请输入您的密码!" minlength="6"
						maxlength="20">
				</div>
				<div class="newPassword">
					<label for="newPassword">重复密码:</label> <input type="password"
						id="okPassword" name="newPassword" placeholder="请再次输入您的新密码!"
						minlength="6" maxlength="20">
				</div>
			</div>
			<hr>
			<button type="submit">确定</button>
			<button type="reset">重置</button>
			</div>
	</form>
	<script type="text/javascript">
		function alterPassword() {
			var password = document.getElementById("password").value;
			var okpassword = document.getElementById("okPassword").value;
			if (password == "") {
				alert("密码不允许为空！")
				return false;
			} else if (okpassword == "") {
				alert("重复密码不允许为空！");
				return false;
			} else if(passwor!=okpassword){
				alert("两次输入不相同！")
				return false;
			}
			return true;
		}
	</script>
</body>

</html>