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
<title>支付方式</title>
</head>
<script src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/pay.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/headAndTail.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/index.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/global.css">

<body>
	<div class="page-div">
		<div class="head-warp">
			<div class="head">
				<h1 class="logo">
					<a href="<%=basePath%>index.jsp"> <img
						src="<%=basePath%>/images/logo.png">
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
		<div class="top">
			<div class="top-top">
				<label class="label1">图标：首次买入的货币基金将作为你的理财通余额+账户</label>
				<hr class="hr1">
				<c:forEach items="${fundlists }" var="list">
					<label class="label2">买入&nbsp; <label class="label3">${list.name }</label>
					</label>
				</c:forEach>
				<a href="#" class="top-top-a1">收益及取出规则</a>
				<hr class="hr1">
				<label class="label4">买入金额：<input type="number" id="money01" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<label class="font"> 若按近7日年化计算，预估1年后可获收益<span id="profits">0.00</span><span>元</span></label>
				</label> <br> <br> <label class="label5">收益时间： <label
					class="font">预计</label><span class="font1">10月28日</span> <label
					class="font">产生收益,</label><span class="font1">10月29日</span> <label
					class="font">收益到账</label>
				</label>
			</div>
		</div>
		<br>
		<div class="mid">
			<label class="label6">支付方式</label>
			<hr class="hr1">
			<label class="label7"> <input type="radio" checked="checked">&nbsp;支付
			</label> <label class="label8">目前仅支持余额支付，其他支付方式敬请期待！</label>
		</div>
		<br>
		<form action="pay" method="post" onsubmit="return buy()">
		<div class="bot">
			<label class="label9">支付金额：&nbsp; <label class="label-1" id="money02">¥0.00</label>
				<label class="font"></label>
			</label> <br> <br> <label class="label-2"> <input
				type="radio" id="t"> <label class="font">同意</label><a href="#"
				class="bot-a">服务协议及风险提示</a></label> <br> <input type="submit" name=""
				class="but" value="余额支付">
				<input type="hidden" name="wallet.id=1">
		</div>
		</form>

	</div>
	<script type="text/javascript">
	var money = "";
		$("input").blur(function() {
			var money01 = $("#money01").val();
			if(money01===""){
				alert("购买金额不能为空");
			}else if(money01<=1000 || money01>100000){
				alert("购买金额只能在1000-100000之间!");
			}else{
				$("#money02").text("¥"+money01);
				$(function() {
					$.ajax({
						type : "POST",
						url : "http://localhost:8080/FinancialGenius/buyProfit",
						data : {//设置数据源
							money : money01,
						},
						dataType : "json", //ajax返回值设置为text（json格式也可用它返回，可打印出结果，也可设置成json）
						success : function(json) {
							$("#profits").text(json.profit);
							if(json.noMoney===""){
								money = "";
							}else{
								money = "余额不足，请充值";
							}
						},
						error : function(json) {
							alert("json=ERROR");
							return false;
						}
					});
				});
			}
		});
		
		function buy(){
			var checks = $("#t").is(':checked');
			if(checks){
				if(money === "余额不足，请充值"){
					alert(money);
				}else{
					return true;
				}
				return false;
			}else{
				alert("请仔细阅读并同意服务协议及风险提示!");
				return false;
			}
		}
	</script>
</body>

</html>