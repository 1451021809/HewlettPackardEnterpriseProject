<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<head>
<meta charset="UTF-8">
<title>基金购买人数</title>
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
						onmouseleave="showusermanage('fund')"><a href="List">商品管理</a>
						<ul>
							<li class="fund fontsize"><a href="Save">增加基金</a></li>
							<li class="fund fontsize"><a href="Count">基金数量统计</a></li>
							<li class="fund fontsize"><a href="ListOrder">基金购买人数</a></li>
							<li class="fund fontsize"><a href="ListMoney">基金购买金额</a></li>
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
			<table>
				<thead>
					<tr>
						<th>基金id</th>
						<th>购买人数</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${personNumbers}" var="temp" varStatus="vs">
						<tr>
							<td>${temp.id }</td>
							<td>${temp.number}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>

</html>