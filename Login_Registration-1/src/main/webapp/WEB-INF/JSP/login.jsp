<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>User Management Application</title>
<style type="text/css">
	label
	{
	width:150px;
	display:inline-block;
	text-align:center;
		
	}
	table{
	width:400px;
	background-color:#CD6155;
	color:white;
	font-weight:bold;
	box-shadow:5px 5px 10px;
	border-radius:10px;
	margin:2% auto;
	padding:30px;
	
	}
	h2{
	text-align:center;
	}
	thead{
	
	color:black;
	font-weight:bold;
	}
	
</style>
</head>
<body>
<h2>${errorMsg}</h2>
<form action="loginSuccess">
<input type="text" placeholder="UserName"><br><br>
<input type="text" placeholder="UserName"><br>
<button type="submit">SING IN</button>

</form>
</body>
</html>