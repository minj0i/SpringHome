<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
	<title>Home</title>
	<style type="text/css">
		body { background-color: yellow; }
		h1 { color: blue;}
		p {color: green; font-weight: bold;}
		.wrap {font-size: 20px; line-height: 2;}
		.parent { font-size: 1.5em; line-height:200%}
		.child { font-size: 15px; line-height:200%}
	</style>
</head>
<body>
	<h1>
		Hello world!  
	</h1>
	<P>  The time on the server is ${serverTime}. </P>
	<div class="wrap">
		<div class="parent">
			<div class="child">line-height 값 계산</div>
		</div>
	</div>
</body>
</html>
