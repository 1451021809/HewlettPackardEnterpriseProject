$(document).ready(function() {
	// 初始化对象
	var xhr = new XMLHttpRequest();
	// 打开前端与后台的一个通道
	xhr.open('POST', 'HTTP://http://localhost:8080/FinancialGenius/Index');
	// 通过这个通道，传递数据（前端的request）
	xhr.send();
})