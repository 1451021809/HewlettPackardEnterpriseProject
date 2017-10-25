<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>用户管理</title>
<link rel="stylesheet" type="text/css" href="../css/admin.css">
<link rel="stylesheet" type="text/css" href="../css/adminStyle.css">

<script src="../node_modules/vue/dist/vue.min.js"></script>
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
						onmouseleave="showusermanage('usera')">
						<form action="UserAction" method="post">
							<!--<button type="submit">用户管理</button>  -->
							<a href="getUsers">用户管理</a>
						</form>
					</li>
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
			<form action="countAll" method="post">
				<h1 class="user_mange">
					<button type="submit">用户人数统计</button>
				</h1>
			</form>
			<h1 class="user_mange">
				<a href="user_add.jsp">添加用户</a>
			</h1>
			<form action="dimGetUsers" method="post">
				<div class="check">
					<input type="text" name="searchName"> <input type="submit"
						value="搜索">
				</div>
			</form>
			<table>
				<tr>
					<th>id</th>
					<th>昵称</th>
					<th>账号</th>
					<th>密码</th>
					<th>状态</th>
					<th>邮箱</th>
					<th>创建日期</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${list}" var="obj">
					<tr>
						<td>${obj.id }</td>
						<td>${obj.name }</td>
						<td>${obj.username }</td>
						<td>${obj.password }</td>
						<td>${obj.status }</td>
						<td>${obj.email }</td>
						<td>${obj.createDate }</td>
						<td><a href="edit?user.id=${obj.id }">修改</a> <a
							href="deleteUsers?user.id=${obj.id }">删除</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>

</html>