<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>账单</title>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/adminStyle.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/global.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/headAndTail.css">
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
							<img src="images/header_default.jpg">
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
						<li><a href="person.html">个人信息管理</a><>
						<li><a href="wallet.html">我的钱包</a><>
						<li><a href="unds.html">我的基金</a><>
						<li><a href="getBill?id=${isLogin.id}
						">账单</a><>
						<li><a href="getMessage?id=${isLogin.id}">消息推送</a><>
					</ul>
				</div>
				<div class="right">
					<div class="balance">
						<span><h2>账单</h2></span>
						<div class="icon">
							<img src="../images/money.png">
						</div>
						<div class="deal">
							<a href="" class="colo">历史账单</a>
						</div>
					</div>
					<div class="tab">


						<table>
							<tr>
								<td>交易ID</td>
								<td>交易类型</td>
								<td>交易金额</td>
								<td>交易时间</td>

							</tr>
							<c:forEach items="${transactionModels}" var="transaction"
								varStatus="status">
								<tr>
									<%--  $stu.count：${profitModels}   --%>
									<td>${transaction.id}</td>
									<td>${transaction.type}</td>
									<td>${transaction.money }</td>
									<td>${transaction.createDate}</td>
								</tr>
							</c:forEach>
						</table>
						<div style="margin-left: 60px; margin-top: 60px;">
							<tr>
								<td colspan="7" rowspan="2">共${count}条记录&nbsp;&nbsp;共${totalpage}页/当前第${pageno}页&nbsp;&nbsp;
									<a href="getBill?page.pageNo=1">首页</a>&nbsp;&nbsp; <c:if
										test="${pageno>1}">
										<a href="getBill?page.pageNo=${pageno-1}">上一页</a>
									</c:if> <c:if test="${pageno<=1}">
										<a href="#">上一页</a>
									</c:if> &nbsp;&nbsp; <c:if test="${pageno<totalpage}">
										<a href="getBill?page.pageNo=${pageno+1}">下一页</a>
									</c:if> <c:if test="${pageno>=totalpage}">
										<a href="#">下一页</a>
									</c:if> &nbsp;&nbsp; <a href="getBill?page.pageNo=${totalpage}">尾页</a>
								</td>
							</tr>
						</div>

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
						<a target="_blank" href="javaScript:void(0)" style="margin: 0;"><strong>关于理财精灵<></a>
						<a class="lt-line" href="javaScript:void(0)">理财精灵简介</a>
					</div>
				</div>
				<div class="contactus">
					<i class="i-phone"></i>
					<div class="rt">
						<strong>联系客服<> <span class="lt-line">微信用户：95017（拨通后转1再转6）
								<br>QQ用户：86013860（拨通后转4）
						</span> <span>工作时间：09:00-22:00</span>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>