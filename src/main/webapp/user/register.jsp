<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<link rel="stylesheet" type="text/css" href="../css/registerStyle.css">
</head>

<body>
	<div class="body">
		<header>
			<label>用户注册</label>
		</header>
		<form onsubmit="return verification()">
			<div class="body-bodyer">
				<div class="user">
					<label for="user">用户名称:</label> <input type="text" id="user"
						name="user" placeholder="请输入您的用户名!" minlength="6" maxlength="20">
				</div>
				<div class="password">
					<label for="password">登录密码:</label> <input type="password"
						id="password" name="password" placeholder="请输入您的密码!" minlength="6"
						maxlength="20">
				</div>
				<div class="newPassword">
					<label for="newPassword">重复密码:</label> <input type="password"
						id="newPassword" name="newPassword" placeholder="请输入您的确认密码!"
						minlength="6" maxlength="20">
				</div>
				<div class="email">
					<label for="email">电子邮箱:</label> <input type="email" id="email"
						name="email" placeholder="请输入您的电子邮箱!" minlength="1">
				</div>
				<div class="gender">
					<label for="man">性&nbsp;&nbsp;别:</label> <label> <input
						type="radio" name="n" checked="checked">男
					</label> <label> <input type="radio" name="n">女
					</label>
				</div>
				<div class="occupation">
					<label for="occupation">职&nbsp;&nbsp;业:</label> <select
						id="occupation" name="occupation">
						<option value="student">学生</option>
						<option value="teacher">教师</option>
						<option value="staff">职工</option>
					</select>
				</div>
				<div class="hobby">
					<label for="hobby">爱&nbsp;&nbsp;好:</label> <select id="hobby"
						multiple="multiple" name="hobby">
						<option value="run">跑步</option>
						<option value="book">看书</option>
						<option value="movie">电影</option>
						<option value="sleep">睡觉</option>
					</select>
				</div>
			</div>
			<hr>
			<button type="submit">注册</button>
			<button type="reset">重置</button>
	</div>
	</form>
	</div>
	<footer>
		<label>Copyright &copy; 2017 黄雨版权所有</label>
	</footer>
	<script type="text/javascript" src="js/registerJs.js"></script>
</body>

</html>