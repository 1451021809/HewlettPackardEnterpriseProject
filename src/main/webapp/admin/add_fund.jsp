<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<head>
    <meta charset="UTF-8">
    <title>添加基金</title>
    <link rel="stylesheet" type="text/css" href="css/admin.css">
    <link rel="stylesheet" type="text/css" href="css/adminStyle.css">
</head>

<body>
    <div class="head">
        
        <a href="#" class="head_a exit">退出</a>
    </div>
    <div class="body">
    	
        <div class="left">
          	<ul class="left-img">
				<span><li class="left-img"><img src="images/default_photo.jpg"></li></span>
			</ul>
			<div class="ul-div">
				<ul>
					<li class="usermanage first" onmouseenter="showusermanage('usera')" onmouseleave="showusermanage('usera')">
					<a href="user_mange.html">用户管理</a>
						<ul>
							<li class="usera fontsize">
								<a href="user_number.html">用户人数统计</a>
							</li>
							<li class="usera fontsize">
								<a href="user_area.html">用户来源地区统计</a>
							</li>
						</ul>
					</li>
					<li class="usermanage" onmouseenter="showusermanage('fund')" onmouseleave="showusermanage('fund')">
					<a href="List">商品管理</a>
						<ul>
							<li class="fund fontsize"><a href="Save">增加基金</a></li>
							<li class="fund fontsize"><a href="Count">基金数量统计</a></li>
							<li class="fund fontsize"><a href="ListOrder">基金购买人数</a></li>
							<li class="fund fontsize"><a href="ListMoney">基金购买金额</a></li>
						</ul>
					</li>
					<li class="usermanage" onmouseenter="showusermanage('money')" onmouseleave="showusermanage('money')">
					<a href="fund_mange.html">资金管理</a>
						<ul>
							<li class="money fontsize"><a href="#">金额详情</a></li>
						</ul>
						
					</li>
					<li>
						<a href="statistics.html">站长统计</a>
					</li>
				</ul>
			</div>
			<script src="js/ul.js"></script>
        </div>
        <div class="right">
            <div class="input">
            <form action="SaveDo" method="post">

					<table class="tabshop">
						<tr>
							<td>新基金名:</td>
							<td><input name="fundModel.name" type="text"></td>
						</tr>
						<tr>
							<td>新的描述:</td>
							<td><input name="fundModel.describe" type="text"></td>
						</tr>
						<tr>
							<td>新的利率:</td>
							<td><input name="fundModel.profit" type="text"></td>
						</tr>
						<tr>
							<td>新的比例:</td>
							<td><input name="fundModel.proportion" type="text"></td>
						</tr>
						<tr>
							<td colspan="2">
								<button type="submit">确定</button>
								<button type="reset">取消</button>
							</td>
						</tr>
					</table>


				</form>
            </div>
            
        </div>
    </div>
</body>

</html>