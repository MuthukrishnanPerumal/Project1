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
<h2>Hi Welvome to login page</h2>
<form action="/login" method="post">
<center><label>User Name:</label><input type="text" name="username"></center><br>
<center><label>Password:</label><input type="text" name="password"></center><br>
<center><button type="submit"> login</button></center><br></form>

<form action="index">
<button type="submit">HOME</button></form></label></div>

</body>
</html>