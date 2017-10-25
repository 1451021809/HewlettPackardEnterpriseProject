<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<meta charset="UTF-8">
<title>用户管理</title>
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
					<label class="fontsize">理财管理系统</label>
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
							src="<%=basePath%>/images/default_photo.jpg"></li></span>
				</ul>
				<div class="ul-div">
					<ul>
						<li class="usermanage first"
							onmouseenter="showusermanage('usera')"
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
				<script src="js/ul.js"></script>
			</div>
			<div class="right">
				<h1 class="user_mange">金额详情</h1>
				<table>
					<tr>
						<th>用户名</th>
						<th>基金名称</th>
						<th>订单金额</th>
					</tr>
					<c:forEach items="${userList}" var="user">
						<c:forEach items="${user.orders}" var="order">
							<tr>
								<td>${user.name}</td>
								<td>${order.fundModel.name}</td>
								<td>${order.money }</td>
							</tr>
						</c:forEach>
					</c:forEach>
				</table>

				<table>
					<tr>
						<th>用户名</th>
						<th>用户余额总计</th>
						<th>用户购买总金额</th>
						<th>用户收益总金额</th>
					</tr>
					<c:forEach items="${userList}" var="user">
						<c:forEach items="${user.orders}" var="order">
							<tr>
								<td>${user.name }</td>
								<td>${user.walletModel.totalProfit}</td>
								<td>${order.money}</td>
								<td>${user.walletModel.totalProfit}</td>
							</tr>
						</c:forEach>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>

</html>