<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'login.jsp' starting page</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="stylesheet" type="text/css" href="css/login.css">
    
    <script src="js/jquery.js"></script>
    <script type="text/javascript" src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script type="text/javascript" src="http://static.runoob.com/assets/qrcode/qrcode.min.js"></script>
    
    <style>
    	.header{position:relative;}
    </style>
  </head>
  
  <body>
  <%@include file="common/header.jsp" %>
  <div class="content">
		<div class="logo">用户登录</div>
		<div class="inputBox mt50 ml32">
			<input type="text" id="username" autofocus="autofocus" autocomplete="off" maxlength="60" placeholder="请输入账号/邮箱/手机号" >
		</div>
		<div class="inputBox mt50 ml32">
			<input type="password" id="password" autofocus="autofocus" autocomplete="off" maxlength="60" placeholder="请输入密码">
		</div>
		
		<div class="denglu mt50 ml32">
			<button class="login_btn" onclick="login()">登陆</button>
		</div>
  </div>
  <%@include file="common/footer.jsp" %>
  <script>
  	//初始化页面加载信息
	$(document).ready(function(){
		qrload();
	});  
  function login(){
  	var username = $("#username").val();
  	var password = $("#password").val();
  	$.ajax({
        type:"post",
        url:"controller/loginController.jsp",
        data:{username:username,password:password},
        async:false,
        error:function(){
            alert("登陆出错！");
        },
        success:function(data){
            if(data == -1){
                    alert('用户名和密码不能为空！');
                }else if(data == -2){
                    alert('用户名不存在！');
                }else if(data == -3){
                    alert('用户名或密码错误！');
                }else{
                    //登录成功后返回首页
                    window.location.href = "${basePath}";
                    /* window.location.href = "index.jsp";  */
                }
        }
    });
  }
  function qrload(){
		/* new QRCode(document.getElementById('qrcode'), 'your content');
		qrcode.makeCode(this.value); */
		var name = $("#name").html();
		//二维码生成
		// 设置参数方式
		var qrcode = new QRCode('qrcode', {
		  text: 'my content',
		  width: 100,
		  height: 100,
		  colorDark : '#000000',
		  colorLight : '#ffffff',
		  correctLevel : QRCode.CorrectLevel.H
		});
		// 使用 API
		qrcode.makeCode("http://www.baidu.com");//至于怎么联系！哈哈哈！
	}
  </script>
  </body>
</html>
