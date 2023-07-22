<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style type="">

.title{
text-align:center;
font-size:85px;
font-family: cataneo Bt;
background-color: gray;
padding: 10px;

}

ul{
	list-style-type: none;
	margin: 0px;
	padding: 0px;
	background-color: black;
	overflow: hidden;
}

li{
	float: left;
}

li a{
	display: block;
	padding: 14px 18px;
	color:white;
	text-decoration: none;
}

li a:hover {
	background-color: gray;	
}
.header{
	margin-left: -10px;
}


</style>
<meta charset="ISO-8859-1">
<title>header</title>
</head>
<body>

<div class="header">
	<div class="title">Stock Management System</div>
	<div class="menu">
	<ul>
		<li><a href="#">Home</a></li>
		<li><a href="">Stock</a></li>
		<li><a href="dashboard.jsp">Customer</a></li>
		<li><a href="">Contact Us</a></li>
	</ul>
	
	</div>
</div>
</body>
</html>