function verification() {
    //获取用户名
    var user = document.getElementById("user").value;
    //获取密码
    var password = document.getElementById("password").value;
    //获取新密码
    var newPassword = document.getElementById("newPassword").value;
    //获取邮箱
    var email = document.getElementById("email").value;
    //判断用户名，密码，邮箱是否为空，两次输入密码是否相等
    if (user === "") {
        alert("用户名不能为空!");
    } else if (password === "") {
        alert("密码不能为空!");
    } else if (password != newPassword) {
        alert("两次输入密码必须相等!");
    } else if (newPassword === "") {
        alert("重复密码不能为空!");
    } else if (email === "") {
        alert("邮箱不能为空!");
    } else {
        return true;
    }
    return false;
}