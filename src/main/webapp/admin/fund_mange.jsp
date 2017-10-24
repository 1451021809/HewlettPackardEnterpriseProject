<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<meta charset="UTF-8">
<title>资金管理</title>
<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/admin.css">
<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/adminStyle.css">
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
						src="<%=basePath%>/images/default_photo.jpg"></li></span>
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
					<li><a href="findStatistics">站长统计</a></li>
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
</body>

</html>