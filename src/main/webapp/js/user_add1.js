function validate_useradd1() {
	var regId = document.getElementById("name1");
	var usernameId = document.getElementById("username1");
	var passId = document.getElementById("password1");
	var statusId = document.getElementById("status1");
	var emaiId = document.getElementById("email1");
	if (regId.value == "") {
		alert("昵称不能为空！");
	} else if (usernameId.value == "") {
		alert("账户不能为空！");
	} else if (passId.value == "") {
		alert("密码不能为空！");
	} else if (statusId.value == "") {
		alert("用户状态不能为空！");
	} else if (emaiId.value == "") {
		alert("邮箱不能为空！")
	} else {
		return true;
	}
	return false;

}