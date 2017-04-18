<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

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
		    <span class="dz"><a href="javascript:void(0)">登陆</a></span>  
		    <span>|</span> 
		    <span class="dz"><a href="javascript:void(0)">注册</a></span>
		    <%-- <c:choose>
		        <c:when  test="${empty sessionScope.username}">
		            <span class="dz"><a href="login.jsp">登陆</a></span>  
		            <span>|</span>
		            <span class="dz"><a href="javascript:void(0)">注册</a></span>
		        </c:when>
		        <c:otherwise>
		            <span class="dz"><a href="javascript:void(0)">${sessionScope.username}</a></span>  
		            <span> | </span>
		            <span class="dz"><a href="controller/logoutController.jsp">登出</a></span>
		        </c:otherwise>
		    </c:choose> --%>
		</div>
    	
    </div>
