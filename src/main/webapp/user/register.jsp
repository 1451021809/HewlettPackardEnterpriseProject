<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Register</title>
        <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
    <link rel="stylesheet" type="text/css"  href="<%=basePath%>/css/registerStyle.css">

</head>

<body>
    <form onsubmit="return verification()" action="queryUser" method="post">
    <div class="body">
        <header>
            <label>用户注册</label>
        </header>
    
            <div class="body-bodyer">
                <div class="name">昵&nbsp;&nbsp;称: 
                    <input type="text" id="name" name="user.name" placeholder="请输入您的昵称！" minlength="6" maxlength="20">
                </div>
                <div class="user">账&nbsp;&nbsp;户:
                    <input type="text" id="user" name="user.username" placeholder="请输入您的用户名!" minlength="6" maxlength="20">
                </div>
                <div id="account"></div>
                <div class="password">密&nbsp;&nbsp;码:
                    <input type="password" id="password" name="user.password" placeholder="请输入您的密码!" minlength="6" maxlength="20">
                </div>
                <div class="rePassword">重复密码:
                    <input type="password" id="rePassword" name="rePassword" placeholder="请输入您的确认密码!" minlength="6" maxlength="20">
                </div>
                <div class="address">地&nbsp;&nbsp;址:
                    <!-- <input type="text" id="address" name="address" placeholder="请输入您的地址!"> -->
                    <select name="user.address">
                        <option>贵州省</option>
                        <option>四川省</option>
                        <option>浙江省</option>
                        <option>云南省</option>
                    </select>
                </div>
                <div class="email">电子邮箱:
                    <input type="email" id="email" name="user.email" placeholder="请输入您的电子邮箱!">
                </div>
                <br/>
                <br/>
                <hr>
                <button type="submit">注册</button>
                <button type="reset">重置</button>
            </div>
  
    </div>

    <footer>
        <label>Copyright &copy; 2017 Zero版权所有</label>
    </footer>
            </form>
    <script type="text/javascript" src="js/registerJs.js"></script>
    <c:if test="${register_false == 1}">
	<script type="text/javascript">
		alert("该账户已经注册！")
	</script>
	</c:if>
</body>

</html>