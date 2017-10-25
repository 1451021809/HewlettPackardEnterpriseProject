<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<meta charset="UTF-8">
<title>我的基金</title>
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/adminStyle.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/headAndTail.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/global.css" />
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
					<a class="nav-index" href="<%=basePath%>/index.jsp">首页</a> <a
						class="nav-index" href="javaScript:void(0)">余额宝</a> <a
						class="nav-index" href="<%=basePath%>/user/aboutus.jsp">关于我们</a>
					<c:if test="${empty isLogin }">
						<a class="text-login" href="<%=basePath%>user/login.jsp"> <span
							class="avata"> <img
								src="<%=basePath%>/images/header_default.jpg">
						</span>登录 
					</c:if>
					<c:if test="${not empty isLogin }">
						<a class="text-login" href="<%=basePath%>user/person.jsp"> <span
							class="avata"> <img
								src="<%=basePath%>/images/header_default.jpg">
						</span> 我的信息
						</a>
					</c:if>
				</div>
			</div>

		</div>
		<hr>
		<div class="bg">
			<div class="bg-body">
				<div class="left">
					<ul>
						<span><li class="left-img"><img
								src="<%=basePath%>/images/default_photo.jpg"></li></span>
						<li><a href="<%=basePath%>/user/person.jsp">个人信息管理</a></li>
						<li><a href="Wallet">我的钱包</a></li>
						<li><a href="getMyFund">我的基金</a></li>
						<li><a href="getBill?id=${isLogin.id}
						">账单</a>
						<li>
						<li><a href="getMessage?id=${isLogin.id}">消息推送</a></li>
					</ul>
				</div>
				<div class="right">
					<div class="balance">
						<span><h2>已购基金</h2></span>
						<div class="icon">
							<img src="<%=basePath%>/images/money.png">
						</div>
						<div class="deal">
							<a href="" class="colo">交易记录</a>
						</div>
					</div>
					<div class="tab">
						<table>
							<tr>
								<td>名称</td>
								<td>年收益</td>
								<td>购买金额</td>
								<td>购买时间</td>
							</tr>
							<c:forEach items="${userlist}" var="user">
								<c:forEach items="${user.orders}" var="order">
									<tr>
										<td>${order.fundModel.name }</td>
										<td>${order.fundModel.profit }</td>
										<td>${order.money}</td>
										<td>${order.createDate}</td>
									</tr>
								</c:forEach>
							</c:forEach>
						</table>

					</div>
					<div class="hol">
						<h2>所有基金</h2>
						<table>
							<tr>
								<td>名称</td>
								<td>年收益</td>
								<td>起购金额</td>
								<td>剩余数量（份）</td>
							</tr>
							<c:forEach items="${list}" var="vars">
								<tr>
									<td>${vars[0]}</td>
									<td>${vars[1]}</td>
									<td>1000元</td>
									<td>30</td>
								</tr>
							</c:forEach>

						</table>
					</div>
				</div>
			</div>
		</div>
		<div class="footer">
			<div class="wrap clearfix">
				<div class="aboutus">
					<a target="_blank" href="javaScript:void(0)"><i
						class="i-logo-lct"></i></a>

					<div class="rt">
						<a target="_blank" href="javaScript:void(0)" style="margin: 0;"><strong>关于理财精灵</strong></a>
						<a class="lt-line" href="javaScript:void(0)">理财精灵简介</a>
					</div>
				</div>
				<div class="contactus">
					<i class="i-phone"></i>
					<div class="rt">
						<strong>联系客服</strong> <span class="lt-line">微信用户：95017（拨通后转1再转6）
							<br>QQ用户：86013860（拨通后转4）
						</span> <span>工作时间：09:00-22:00</span>
					</div>
				</div>

			</div>
		</div>
	</div>
</body>

</html>