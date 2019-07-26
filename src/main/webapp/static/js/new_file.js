//设置主体div的高度为窗口的可视高度 53为headertext的高度
$("#main").css("height", $(window).height() - 53);
//监听浏览器窗口大小是否改变，一旦改变动态修改主体div的高度
window.onresize = function() {
	$("#main").css("height", $(window).height() - 53);
}
//监听左侧点击事件，用户点击后会进行变色
$(".left_tr").click(function() {
	$(this).css({
		"background-color": "rgb(40, 49, 60)",
		"color": "#009688"
	})
	$(this).children("a").css("color", "#009688");
	$(this).siblings().children("a").css("color", "#FFFFFF");
	$(this).siblings().css({
		"background-color": "#404852",
		"color": "#FFFFFF"
	})
})
//验证输入的内容是否是整数
$(".verifyInt").change(function(){
	var verify = /^[1-9][0-9]*$/;
	if (!verify.test($(this).val())) {
		alert("数量只能为不为零的整数")   
	} 
})
//获取验证码
var time_text=30;//显示倒计时
$("#verificationCode").click(function() {
	$(this).attr("disabled",true)
	$(this).css("cursor","not-allowed");
	$(this).css("background-color","rgb(251,251,251)")
	$(this).css("color","red")
	time=setInterval(function(){
		if (time_text<=0) {
			$("#verificationCode").attr("disabled",false)
			$("#verificationCode").css("cursor","pointer");
			$("#verificationCode").css("background-color","rgb(30,159,255)")
			$("#verificationCode").css("color","#FFFFFF")
			$("#verificationCode").text("获取验证码");
			clearInterval(time);
			time_text=30;
		}else{
		$("#verificationCode").text("获取"+time_text);	
		time_text--;
		}
	},1000)
})
//验证两次密码是否输入相同
$("#password2").keyup(function(){
	var pwd1 = $("#password").val();
	var pwd2 = $("#password2").val();
	console.log(pwd1+"................."+pwd2)
	if(pwd1==null||pwd1==""){
		$("#passwordHint").text("请先输入密码");
		return;
	}
	if(pwd1!=pwd2){
		$("#passwordHint").text("两次密码输入不一致");
	}else{
		$("#passwordHint").text("");
	}
})
//登录
$("#login_submit").click(function(){
	var user = $("#username").val();
	var pwd = $("#password").val();
	console.log(user)
	console.log(pwd)
	if(user==null||user==""||pwd==null||pwd==""){
		 alert("账号或者密码不能为空")
		 return;
	 }
	 var adata = {
	 	"username" : user,
	 	"password" : pwd
	 	
	 }
	 $.ajax({
		 type : "post",
		 data : adata,
		 url : "logUser",
		 success : function(data){
			 console.log(data)
		 }
		 
	 })
})