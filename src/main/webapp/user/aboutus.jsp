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
<title>个人信息</title>
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/adminStyle.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/index.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/global.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/headAndTail.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/about_us.css">
</head>

<body>
	<div class="title-person-bill-notification">
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
		<div class="center">
			About us
			<div class="center_left">Zero</div>
			<div class="center_right"></div>
			<div class="center_left_one">&nbsp;&nbsp;人这一辈子，可以有理想，可以有梦想，也可以痴心妄想，就是不可以什么都不想。&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ----选择理财,过不一样的生活</div>
			<div class="center_left_two">
				&nbsp;&nbsp;人只能活一回，梦想却有无数个，唯有放手一搏，才能知道机会属不属于自己。 &nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;-----理财精灵，是你的选择</div>
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