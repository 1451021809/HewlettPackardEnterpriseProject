//判断银行卡信息
function bankCard() {
	var bankcards = document.getElementById("bankCards").value;
	if (bankcards === "") {
		alert("银行卡号不能为空！")
		return false;
	} else {
		return true;
	}
}
//判断充值金额信息
function Rechargess() {
	var recharges = document.getElementById("Recharges").value;
	if (recharges === "") {
		alert("充值金额不能为空！")
	} else if (recharges > 100000) {
		alert("充值金额不能超过100000元！")
	} else if (recharges <= 0) {
		alert("充值金额不能低于0元！")
	} else {
		return true;
	}
	return false;
}
//判断提现金额信息
function Withdrawals() {
	var recharges = document.getElementById("Withdrawalss").value;
	if (recharges === "") {
		alert("提现金额不能为空！")
	} else if (recharges > 100000) {
		alert("提现金额不能超过100000元！")
	} else if (recharges <= 0) {
		alert("提现金额不能低于0元！")
	} else {
		return true;
	}
	return false;
}