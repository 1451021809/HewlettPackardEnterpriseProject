<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<meta charset="UTF-8">
<title>站长统计</title>
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/admin.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/adminStyle.css">
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
						onmouseleave="showusermanage('usera')"><form
							action="UserAction" method="post">
							<!--<button type="submit">用户管理</button>  -->
							<a href="getUsers">用户管理</a>
						</form></li>
					<li class="usermanage" onmouseenter="showusermanage('fund')"
						onmouseleave="showusermanage('fund')"><a
						href="shop_mange.jsp">商品管理</a>
						<ul>
							<li class="fund fontsize"><a href="add_fund.html">增加基金</a></li>
							<li class="fund fontsize"><a href="fund_number.html">基金数量统计</a></li>
							<li class="fund fontsize"><a href="fund_user_number.html">基金购买人数</a></li>
							<li class="fund fontsize"><a href="fund_money.html">基金购买金额</a></li>
						</ul></li>
					<li class="usermanage" onmouseenter="showusermanage('money')"
						onmouseleave="showusermanage('money')"><a
						href="fund_mange.jsp">资金管理</a>
						<ul>
							<li class="money fontsize"><a href="#">金额详情</a></li>
						</ul></li>
					<li><a href="statistics.jsp">站长统计</a></li>
				</ul>
			</div>
			<script src="js/ul.js"></script>
		</div>
		<div class="right">
			<h1>用户访问总次数：</h1>
			<jsp:useBean id="count"
				class="com.financialgenius.project.model.CountUser" scope="session"></jsp:useBean>
			<jsp:useBean id="count2"
				class="com.financialgenius.project.model.CountUser"
				scope="application"></jsp:useBean>

			您的访问次数：<jsp:getProperty name="count" property="count" /><br>
			总共的访问次数：<jsp:getProperty name="count2" property="count" />

		</div>
	</div>
</body>

</html>