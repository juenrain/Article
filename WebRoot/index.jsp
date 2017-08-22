<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="service.ArticleService"%>
<%
    //查询出编程代码类的相关文章
    List<Map<String,Object>>  articles2 = ArticleService.getArticlesByCategoryId(2, 0, 6);
    pageContext.setAttribute("articles2", articles2);
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<link rel="stylesheet" type="text/css" href="css/index.css">
	<link rel="stylesheet" type="text/css" href="css/zns_style.css">
	<script src="js/jquery.js"></script>
	<!-- <script src="js/qrcode.js"></script> -->
	<script src="js/zns_script.js"></script>
	<script src="js/mouse_action.js"></script>
	
	<script type="text/javascript" src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script type="text/javascript" src="http://static.runoob.com/assets/qrcode/qrcode.min.js"></script>
  </head>
  
  <body>
    <div class="header" >
    	<div class="logo">
    	<img class="imglogo" alt="我的logo" src="image/logo.jpg">
    	</div>
    	<div class="guide">
    		<ul>
	    		<li class="firstpage"><a href="index.jsp">首页</a></li>
	    		<li><a href="javascript:void(0)">原创故事</a></li>
	    		<li><a href="javascript:void(0)">经典美文</a></li>
	    		<li><a href="javascript:void(0)">完结全本</a></li>
	    		<li><a href="javascript:void(0)">连载待续</a></li>
    		</ul>
    	</div>
    	<div class='login'>
		    <c:choose>
		        <c:when  test="${empty sessionScope.username}">
		            <span class="dz"><a id="name" href="jsp/login.jsp">登陆</a></span>  
		            <span>|</span>
		            <span class="dz"><a href="jsp/signup.jsp">注册</a></span>
		        </c:when>
		        <c:otherwise>
		            <span class="dz"><a id="name" href="javascript:void(0)">${sessionScope.username}</a></span>  
		            <span> | </span>
		            <span class="dz"><a href="controller/logoutController.jsp">登出</a></span>
		        </c:otherwise>
		    </c:choose>
		</div>
    	
    </div>
    <div id="first_show" class="banner">
		<div class="zns_box">
			<ul class="zns_box_head"> 
				<li><a href=""><img src="image/img_show/1.jpg" alt=""/></a><a id="aa">iPod shuffle</a></li>
				<li><a href=""><img src="image/img_show/2.jpg" alt=""/></a><a id="aa">iPod nano</a></li>
				<li><a href=""><img src="image/img_show/3.jpg" alt=""/></a><a id="aa">iPod shuffle</a></li>
				<li><a href=""><img src="image/img_show/4.jpg" alt=""/></a><a id="aa">iPod shuffle</a></li>
				<li><a href=""><img src="image/img_show/5.jpg" alt=""/></a><a id="aa">iPod shuffle</a></li>
				<li><a href=""><img src="image/img_show/6.jpg" alt=""/></a><a id="aa">iPod shuffle</a></li>
				<li><a href=""><img src="image/img_show/7.jpg" alt=""/></a><a id="aa">iPod shuffle</a></li>
				<li><a href=""><img src="image/img_show/8.jpg" alt=""/></a><a id="aa">iPod shuffle</a></li>
				<li><a href=""><img src="image/img_show/9.jpg" alt=""/></a><a id="aa">iPod shuffle</a></li>
				<li><a href=""><img src="image/img_show/10.jpg" alt=""/></a><a id="aa">iPod shuffle</a></li>
				<li><a href=""><img src="image/img_show/11.jpg" alt=""/></a><a id="aa">iPod shuffle</a></li>
				<li><a href=""><img src="image/img_show/12.jpg" alt=""/></a><a id="aa">iPod shuffle</a></li>
			</ul>
		</div>
		<div class="zns_box_foot">
			<span style="left: 445px;" class="caret"></span>
			<a class="show">男生专区</a>
			<a>女生专区</a>
		</div>
	</div>
	<div class='bottom'>
    	<div class='category'>
	        <div class='title'>连载小说</div>
		        <ul class='items'>
		            <li class='item' style="background-image:url(image/img_show/1.jpg);" onmouseover="mouse_action(event, '${articles2}')" onmouseout="mouse_action(event, 0)"></li>
		            <a href="jsp/ArticleContent.jsp"><li class='item' style="background-image:url(image/img_show/2.jpg);"></li></a>
		            <li class='item' style="background-image:url(image/img_show/3.jpg);"></li>
		            <div style="clear:both"></div>
		        </ul>
    	</div>
    	<div class='category'>
	        <div class='title'>完结小说</div>
		        <ul class='items'>
		            <li class='item' style="background-image:url(image/img_show/5.jpg);"></li>
		            <li class='item' style="background-image:url(image/img_show/6.jpg);"></li>
		            <div style='clear:both'></div>
		        </ul>
	    	</div>
	</div>
    <script type="text/javascript">
    </script>
    <%@include file="common/footer.jsp" %>
    
    <script>
	//初始化页面加载信息
	$(document).ready(function(){
		qrload();
		/* var sessionValue = session.getAttribute("username");
		if(sessionValue =="" || sessionValue ==null){
    		alert("登陆失效，请重新登陆");
    		window.location.href = "jsp/login.jsp";
  		} */
	});  
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
