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
	<form action="UserMange_alterUsername" onsubmit="return alterUsername()" method="post">
		<div class="body">
			<header>
				<label>昵称修改</label>
			</header>


			<div class="body-bodyer">
				<div class="user">
					<label for="user">新昵称:</label> <input type="text" id="user"
						name="userModel.name" placeholder="请输入您的新昵称!"
						>
				</div>
			</div>
			<hr>
			<button type="submit">确定</button>
			<button type="reset">取消</button>
		</div>
	</form>
	<script type="text/javascript">
		function alterUsername() {
			var username = document.getElementById("userName").value;
			if (username == "") {
				alert("昵称不允许为空！")
				return false;
			}
			return true;
		}
	</script>
</body>

</html>