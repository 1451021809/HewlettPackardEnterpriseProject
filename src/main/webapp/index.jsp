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

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>ManageMoney</title>

<title>index</title>

<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/index.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/global.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/headAndTail.css">
</head>

<body>
	<div class="page-div">
		<div class="head-warp">
			<div class="head">
				<h1 class="logo">
					<a href="<%=basePath%>/index.jsp"> <img
						src="<%=basePath%>/images/logo.png">
					</a>
				</h1>
				<div class="main-nav">
					<c:if test="${empty isLogin }">
						<div class="logout0">
							<a class="nav-index" href="<%=basePath%>index.jsp">首页</a> <a
								class="nav-index" href="javaScript:void(0)">余额宝</a> <a
								class="nav-index" href="<%=basePath%>user/aboutus.jsp">关于我们</a>
							<a class="text-login" href="<%=basePath%>user/login.jsp"> <span
								class="avata"> <img
									src="<%=basePath%>/images/header_default.jpg">
							</span> 登录
							</a>
						</div>
						<div style="position: absolute; right: -140px;">
							<a href="logout"></a>
						</div>
					</c:if>
					<c:if test="${not empty isLogin }">
						<div class="logout0">
							<a class="nav-index" href="<%=basePath%>index.jsp">首页</a> <a
								class="nav-index" href="javaScript:void(0)">余额宝</a> <a
								class="nav-index" href="<%=basePath%>user/aboutus.jsp">关于我们</a> <a
								class="text-login" href="<%=basePath%>user/person.jsp"> <span
								class="avata"> <img
									src="<%=basePath%>/images/header_default.jpg">
							</span> 我的信息 
						</div>
						<div style="position: absolute; right: -140px;">
							<a href="logout">退出</a>
						</div>
					</c:if>
				</div>
			</div>
		</div>
		<hr>
		<div class="main-div">
			<div class="banner">
				<ul id="focus_list_box">
					<li style="z-index: 109">
						<div
							style="background-image: url(<%=basePath%>/images/bannerimage.png);"
							class="image-warp">
							<a href="javaScript:void(0)"></a>
						</div>
					</li>
				</ul>
			</div>
			<div class="index-count-spl">
				<div class="wrap"></div>
			</div>
			<div class="hot-recommand">
				<ul class="hot-list clearfix wrap" id="mod_ad_index_fund">
					<li>
						<p class="f-name">
							<a href="javaScript:void(0)" target="_blank"
								class="js-ad-fund-link js-ad-fund-name">易方达基金易理财</a>
						</p>
						<p class="ranger">近7日年化</p>
						<p class="r-num f-red js-ad-profit">4.2200%</p>
						<div class="character">
							<span>低风险</span> <span>随存随取</span> <span>0元起购</span>
						</div>
						<div class="btn-wrap">
							<a href="pay.html" target="_blank" class="js-ad-fund-buy">立即买入</a>
						</div>
					</li>
					<li>
						<p class="f-name">
							<a href="javaScript:void(0)" target="_blank"
								class="js-ad-fund-link js-ad-fund-name">平安养老富盈5号</a>
						</p>
						<p class="ranger">近7日年化</p>
						<p class="r-num f-red js-ad-profit">4.9344%</p>
						<div class="character">
							<span>中风险</span> <span>灵活存取</span> <span>1000元起购</span>
						</div>
						<div class="btn-wrap">
							<a href="pay.html" target="_blank" class="js-ad-fund-buy">立即买入</a>
						</div>
					</li>
					<li class="last" id="ad_section_3">
						<p class="f-name">
							<a href="javaScript:void(0)" target="_blank"
								class="js-ad-fund-link js-ad-fund-name">太平养老颐养天天</a>
						</p>
						<p class="ranger">近7日年化</p>
						<p class="r-num f-red js-ad-profit">4.4890%</p>
						<div class="character">
							<span>中风险</span> <span>随存随取</span> <span>1000元起购</span>
						</div>
						<div class="btn-wrap">
							<a href="pay.html" target="_blank" class="js-ad-fund-buy">立即买入
							</a>
						</div>
					</li>
				</ul>
			</div>
			<div class="main-project">
				<div class="project">理财产品</div>
				<div class="table">
					<div class="foundation">
						基金 <br>理财
					</div>
					<table id="table1" class="table-content">
						<tr>
							<td>基金名称</td>
							<td>近七日年化<i class="i-var"></i>
							</td>
							<td>万份收益(元)</td>
							<td>产品期限</td>
						</tr>
						<tr>
							<td id="names0">基金名称</td>
							<td id="proportion0">近七日年化<i class="i-var"></i>
							</td>
							<td id="profit0">万份收益</td>
							<td>随存随取</td>
							<td><a href="Buy?fundModel.id=1"> <input class="input"
									type="button" value="买入">
							</a></td>
						</tr>

						<tr>
							<td id="names1">基金名称</td>
							<td id="proportion1">近七日年化<i class="i-var"></i>
							</td>
							<td id="profit1">万份收益</td>
							<td>随存随取</td>
							<td><a href="Buy?fundModel.id=2"> <input class="input"
									type="button" value="买入">
							</a></td>
						</tr>
						<tr>
							<td id="names2">基金名称</td>
							<td id="proportion2">近七日年化<i class="i-var"></i>
							</td>
							<td id="profit2">万份收益</td>
							<td>随存随取</td>
							<td><a href="Buy?fundModel.id=3"> <input class="input"
									type="button" value="买入">
							</a></td>
						</tr>
						<tr>
							<td id="names3">基金名称</td>
							<td id="proportion3">近七日年化<i class="i-var"></i>
							</td>
							<td id="profit3">万份收益</td>
							<td>随存随取</td>
							<td><a href="Buy?fundModel.id=4"> <input class="input"
									type="button" value="买入">
							</a></td>
						</tr>
						<tr>
							<td id="names4">基金名称</td>
							<td id="proportion4">近七日年化<i class="i-var"></i>
							</td>
							<td id="profit4">万份收益</td>
							<td>随存随取</td>
							<td><a href="Buy?fundModel.id=5"> <input class="input"
									type="button" value="买入">
							</a></td>
						</tr>
					</table>
				</div>
				<div></div>
			</div>
			<div class="cooperation">
				<div class="cooperation-context">
					<div class="organization">
						<strong>合作金融机构</strong>
					</div>
					<hr>
					<img src="<%=basePath%>images/organization.png">
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
	<script type="text/javascript">
		$(function() {
			$.ajax({
				type : "POST",
				url : "http://localhost:8080/FinancialGenius/Index",
				dataType : "json", //ajax返回值设置为text（json格式也可用它返回，可打印出结果，也可设置成json）
				success : function(json) {
					$("#names0").text(json.fundList[0].name);
					$("#proportion0").text(json.fundList[0].proportion + "%");
					$("#profit0").text(json.fundList[0].profit);

					$("#names1").text(json.fundList[1].name);
					$("#proportion1").text(json.fundList[1].proportion + "%");
					$("#profit1").text(json.fundList[1].profit);

					$("#names2").text(json.fundList[2].name);
					$("#proportion2").text(json.fundList[2].proportion + "%");
					$("#profit2").text(json.fundList[2].profit);

					$("#names3").text(json.fundList[3].name);
					$("#proportion3").text(json.fundList[3].proportion + "%");
					$("#profit3").text(json.fundList[3].profit);

					$("#names4").text(json.fundList[4].name);
					$("#proportion4").text(json.fundList[4].proportion + "%");
					$("#profit4").text(json.fundList[4].profit);
				},
				error : function(json) {
					alert("json=ERROR");
					return false;
				}
			});
		});
	</script>
</body>

</html>