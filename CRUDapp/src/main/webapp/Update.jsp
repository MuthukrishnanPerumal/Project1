<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<html>
<head>
<title>Welcome to Muthu.com</title>
<style type="text/css">
	label
	{
	width:150px;
	display:inline-block;
	text-align:center;
		
	}
	form{
	width:400px;
	height:500px;
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
</style>

</head>
<body>
<div>
<h2> To be Update User</h2>
<form action="UpdateSuccess">

<center><label>ID</label><input type="text" name="id"></center><br>
<center><label> Name </label><input type="text" name="name"></center><br>
<center><label>Age   </label><input type="text" name="age"></center><br>
<center><label> City </label><input type="text" name="city"></center><br>
<center><label>Phone_Number </label><input type="text" name="phone_number"></center><br>
<center><label>Password </label><input type="text" name="password"></center><br>
<center><label>UserName </label><input type="text" name="username"></center><br>
<center><label><input type="submit" name="submit"></label></center><br>
</form>

</div>
<div>
<form action="index">
</label><center><button type="submit">HOME</button></center></label></form>
</div>
</body>
<html>
