<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的钱包</title>
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/adminStyle.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/headAndTail.css">
<link rel="stylesheet" href="<%=basePath%>/css/global.css" />
</head>

<body>
	<div class="title-unds-wallet">
		<div class="page-div">
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
							<li><a href="getBill?id=${isLogin.id}
						">账单</a>
							<li>
							<li><a href="getMessage?id=${isLogin.id}">消息推送</a></li>
						</ul>
					</div>
					<div class="right">
						<div class="balance">
							<span><h2>总资产(元)</h2></span> <span><h2>
									<c:forEach items="${walletList }" var="list">
									${list.proportion }
									</c:forEach>
								</h2></span>
							<div class="icon">
								<img src="<%=basePath%>/images/money.png">
							</div>
							<div class="deal">
								<a href="" class="colo">交易记录</a>
							</div>
						</div>
						<div class="earnings">
							<br> <span>昨日固定收益(元)</span> <br> <span>
								${profitMoney} </span> <br> <span>累计固定收益(元)</span> <br> <span><c:forEach
									items="${walletList }" var="list">
									${list.totalProfit }
									</c:forEach></span>
						</div>
						<div class="bank-card">
							<div class="bound">
								<a href="" class="card">我的银行卡</a> <br>
								<c:forEach items="${bankCardList }" var="bankCard">
								已绑定银行卡：${bankCard.number }
									<a href="deleteBankCard?bankCard.id=${bankCard.id }">解绑</a>
									<br>
									<br>
								</c:forEach>
							</div>
							<a href="addBankCard01">添加银行卡</a>
						</div>
						<div class="topup">
							<form onsubmit="return Rechargess()" action="Recharge"
								method="post">
								充值: <br> 请选择银行卡: <select>
									<optgroup label="请选择银行卡">
										<c:if test="${empty bankCardList }">
											<option>添加银行卡</option>
										</c:if>
										<c:forEach items="${bankCardList }" var="bankCard">
											<option>${bankCard.number }</option>
										</c:forEach>
									</optgroup>
								</select> 请输入充值金额: <input type="number" id="Recharges"
									name="wallet.proportion" placeholder="单次充值不能大于10万元">
								<button type="submit">充值</button>
							</form>
							<br> <br>
							<form onsubmit="return Withdrawals()" action="Withdrawals"
								method="post">
								提现: <br> 请选择银行卡: <select>
									<optgroup label="请选择银行卡">
										<c:if test="${empty bankCardList }">
											<option>添加银行卡</option>
										</c:if>
										<c:forEach items="${bankCardList }" var="bankCard">
											<option>${bankCard.number }</option>
										</c:forEach>
									</optgroup>
								</select> 请输入提现金额: <input type="number" id="Withdrawalss"
									name="wallet.proportion" placeholder="单次提现不能大于10万元">
								<button type="submit">提现</button>
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
	</div>
	<script type="text/javascript" src="<%=basePath%>/js/myInfoJs.js"></script>
</body>

</html>