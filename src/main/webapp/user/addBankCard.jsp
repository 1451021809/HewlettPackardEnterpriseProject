<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>

<head>
<meta charset="UTF-8">
<title>添加银行卡</title>
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
					<a class="nav-index" href="<%=basePath%>index.jsp">首页</a> <a
						class="nav-index" href="javaScript:void(0)">余额宝</a> <a
						class="nav-index" href="javaScript:void(0)">关于我们</a>
					<c:if test="${empty isLogin }">
						<a class="text-login" href="user/login.jsp"> <span
							class="avata"> <img
								src="<%=basePath%>/images/header_default.jpg">
						</span> 登录
						</a>
					</c:if>
					<c:if test="${not empty isLogin }">
						<a class="text-login" href="user/person.jsp"> <span
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
						<li><a href="bill.html">账单</a></li>
						<li><a href="notification.html">消息推送</a></li>
					</ul>
				</div>
				<div class="right">
					<div class="balance">
						<span><h2>添加银行卡</h2></span>
						<div class="icon">
							<img src="<%=basePath%>/images/money.png">
						</div>
					</div>
					<div class="tab">
						<form onsubmit="return bankCard()" action="addBankCard"
							method="post">
							<div class="occupation">
								<label for="occupation">选择银行:</label> <select id="occupation"
									name="occupation">
									<option value="student">中国工商银行</option>
									<option value="teacher">中国建设银行</option>
									<option value="staff">中国邮政储蓄银行</option>
								</select>
							</div>
							<hr>
							<label>银行卡号:</label> <input type="number" name="bankCard.number"
								id="bankCards" minlength="16" maxlength="19"> <br>
							<button type="submit">添加</button>
						</form>
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
	<script type="text/javascript" src="<%=basePath%>/js/myInfoJs.js"></script>
</body>

</html>