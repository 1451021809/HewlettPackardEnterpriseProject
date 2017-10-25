<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>添加用户</title>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<link rel="stylesheet" type="text/css" href="../css/admin.css">
<link rel="stylesheet" type="text/css" href="../css/adminStyle.css">
<link rel="stylesheet" type="text/css" href="../css/fontsize.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/headAndTail.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/global.css" />
<script src="../node_modules/vue/dist/vue.min.js"></script>
</head>
<body>
	<div class="title-unds-wallet">
		<div class="head-warp">
			<div class="head">
				<h1 class="logo">
					<a href="index.html"> <img src="<%=basePath%>/images/logo.png">
					</a>
				</h1>
				<div class="main-nav">
					<label class="fontsize">XXX理财</label>
				</div>
			</div>
		</div>
		<hr>
		<br>
		<br>
		<div class="body">

			<div class="left">
				<ul class="left-img">
					<span><li class="left-img"><img
							src="../images/default_photo.jpg"></li></span>
				</ul>
				<div class="ul-div">
					<ul>
					<li class="usermanage first" onmouseenter="showusermanage('usera')"
						onmouseleave="showusermanage('usera')">
						<form action="UserAction" method="post">
							<!--<button type="submit">用户管理</button>  -->
							<a href="getUsers">用户管理</a>
						</form>
					</li>
					<li class="usermanage" onmouseenter="showusermanage('fund')"
						onmouseleave="showusermanage('fund')"><a href="List">商品管理</a>
						<ul>
							<li class="fund fontsize"><a href="Save">增加基金</a></li>
							<li class="fund fontsize"><a href="Count">基金数量统计</a></li>
							<li class="fund fontsize"><a href="ListOrder">基金购买人数</a></li>
							<li class="fund fontsize"><a href="ListMoney">基金购买金额</a></li>
						</ul></li>
					<li class="usermanage" onmouseenter="showusermanage('money')"
						onmouseleave="showusermanage('money')"><a
						href="findMoneyDetails">资金管理</a>
						<ul>
							<li class="money fontsize"><a href="findMoneyDetails">金额详情</a></li>
						</ul></li>
					<li><a href="statistics.jsp">站长统计</a></li>
				</ul>
				</div>
				<script src="../js/ul.js"></script>

				<!--<ul>
                <span><li class="left-img"><img src="../images/default_photo.jpg"></li></span>
                <li><a href="user_mange.html">用户管理</a>
                	
                </li>
                <li><a href="shop_mange.html">商品管理
                	<ul>
                		<li>用户人数统计</li>
                		<li>用户来源地统计</li>
                		<li></li>
                	</ul>
                	</a>
                </li>
                <li><a href="fund_mange.html">资金管理</a></li>
                <li><a href="statistics.html">站长统计</a></li>
            </ul>-->
			</div>
			<div class="right">
				<form action="addUsers" onsubmit="return useraddss()" method="post">
					<table>
						<tr>
							<td>昵&nbsp;称：</td>
							<td><input type="text" id="name1" name="user.name" /></td>
						</tr>
						<tr>
							<td>账&nbsp;户：</td>
							<td><input type="text" id="username1" name="user.username" /></td>
						</tr>
						<tr>
							<td>密&nbsp;码：</td>
							<td><input type="password" id="password1"
								name="user.password" /></td>
						</tr>
						<tr>
							<td>状&nbsp;态：</td>
							<td><input type="text" id="status1" name="user.status" /></td>
						</tr>
						<tr>
							<td>邮&nbsp;箱：</td>
							<td><input type="text" id="email1" name="user.email" /></td>
						</tr>
						<tr>
							<td></td>
							<td><button type="submit">添加</button>
								<button onclick="javascript:history.go(-1)">返回</button></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	function useraddss() {
		var regId = document.getElementById("name1");
		var usernameId = document.getElementById("username1");
		var passId = document.getElementById("password1");
		var statusId = document.getElementById("status1");
		var emaiId = document.getElementById("email1");
		if (regId.value == "") {
			alert("昵称不能为空！");
		} else if (usernameId.value == "") {
			alert("账户不能为空！");
		} else if (passId.value == "") {
			alert("密码不能为空！");
		} else if (statusId.value == "") {
			alert("用户状态不能为空！");
		} else if (emaiId.value == "") {
			alert("邮箱不能为空！")
		} else {
			return true;
		}
		return false;

	}
</script>
</html>