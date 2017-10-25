<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>个人信息</title>
<link rel="stylesheet" type="text/css" href="../css/adminStyle.css">
<link rel="stylesheet" type="text/css" href="../css/index.css">
<link rel="stylesheet" type="text/css" href="../css/global.css">
<link rel="stylesheet" type="text/css" href="../css/headAndTail.css">
</head>

<body>
	<div class="title-person-bill-notification">
		<div class="head-warp">
			<div class="head">
				<h1 class="logo">
					<a href="index.html"> <img src="../images/logo.png">
					</a>
				</h1>
				<div class="main-nav">
					<a class="nav-index" href="javaScript:void(0)">首页</a> <a
						class="nav-index" href="javaScript:void(0)">余额宝</a> <a
						class="nav-index" href="javaScript:void(0)">关于我们</a> <a
						class="text-login" href="login01.html"> <span class="avata">
							<img src="../images/header_default.jpg">
					</span> 登录
					</a>
				</div>
			</div>
		</div>
		<hr>
		<div class="bg">
			<div class="bg-body">
				<div class="left">
					<ul>
						<span><li class="left-img"><img
								src="../images/default_photo.jpg"></li></span>
						<li><a href="person.html">个人信息管理</a></li>
						<li><a href="wallet.html">我的钱包</a></li>
						<li><a href="unds.html">我的基金</a></li>
						<li><a href="bill.html">账单</a></li>
						<li><a href="notification.html">消息推送</a></li>
					</ul>
				</div>
				<div class="right">
					<div class="info">
						<h3>个人信息</h3>
					</div>
					<hr>
					<div class="head-portrait">
						<img src="images/default_photo.jpg">
					</div>
					<div class="account">
						<div class="account-left">
							<h4>用户账号:${isLogin.username }</h4>
							<h4>昵称:${isLogin.name }</h4>
							<br>
							<h4>
								<a href="UserMange_to_alterUsername">修改昵称</a>
							</h4>
						</div>
						<div class="account-right">
							<h4>邮箱:${isLogin.email }</h4>
							<h4>注册时间:${isLogin.createDate }</h4>
							<br>
							<h4>
								<a href="UserMange_to_alterPassword">修改密码</a>
							</h4>
						</div>
					</div>
					<div class="wire"></div>
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
