<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>修改用户</title>
<link rel="stylesheet" type="text/css" href="../css/admin.css">
<link rel="stylesheet" type="text/css" href="../css/adminStyle.css">
</head>

<body>
	<div class="head">
		<h1 class="head_h1">XXX理财</h1>
		<a href="#" class="head_a exit">退出</a>
	</div>
	<div class="body">
		<div class="left">
			<ul class="left-img">
				<span><li class="left-img"><img
						src="../images/default_photo.jpg"></li></span>
			</ul>
			<div class="ul-div">
				<ul>
					<li class="usermanage first" onmouseenter="showusermanage('usera')"
						onmouseleave="showusermanage('usera')"><a
						href="user_mange.html">用户管理</a>
						<ul>
							<li class="usera fontsize"><a href="user_number.html">用户人数统计</a>
							</li>
							<li class="usera fontsize"><a href="user_area.html">用户来源地区统计</a>
							</li>
						</ul></li>
					<li class="usermanage" onmouseenter="showusermanage('fund')"
						onmouseleave="showusermanage('fund')"><a
						href="shop_mange.html">商品管理</a>
						<ul>
							<li class="fund fontsize"><a href="add_fund.html">增加基金</a></li>
							<li class="fund fontsize"><a href="fund_number.html">基金数量统计</a></li>
							<li class="fund fontsize"><a href="fund_user_number.html">基金购买人数</a></li>
							<li class="fund fontsize"><a href="fund_money.html">基金购买金额</a></li>
						</ul></li>
					<li class="usermanage" onmouseenter="showusermanage('money')"
						onmouseleave="showusermanage('money')"><a
						href="fund_mange.html">资金管理</a>
						<ul>
							<li class="money fontsize"><a href="#">金额详情</a></li>
						</ul></li>
					<li><a href="statistics.html">站长统计</a></li>
				</ul>
			</div>
			<script src="../js/ul.js"></script>
		</div>
		<div class="right">
			<form action="updateUsers" method="post">
				<input type="hidden" name="user.id" value="${user.id }">
				<table class="input">
					<tr>
						<td>昵称:</td>
						<td><input type="text" name="user.name" value="${user.name }"></td>
					</tr>
					<tr>
						<td>密码:</td>
						<td><input type="password" name="user.password"
							value="${user.password }"></td>
					</tr>
					<tr>
						<td>邮箱:</td>
						<td><input type="email" name="user.email"
							value="${user.email }"></td>
					</tr>
					<tr>
						<td>状态:</td>
						<td><input type="text" name="user.status"
							value="${user.status }"></td>
					</tr>
				</table>
				<div class="button">
					<button type="submit">确定</button>
					<button onclick="javascript:history.go(-1)">返回</button>
				</div>
			</form>
		</div>
	</div>
</body>

</html>