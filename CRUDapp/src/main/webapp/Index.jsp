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
	background-color:#CD6155;
	color:white;
	font-weight:bold;
	box-shadow:5px 5px 10px;
	border-radius:10px;
	margin:2% auto;
	padding:30px;
	text-align:center;
	
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
<div>
<form action="New User.jsp">
<button type="submit">Add New User</button> 
</form>
</div>

<div>
<form action="Search">
<center><label>Enter Searching ID</label><input type="text" name="id"></center><br>
<center><label><input type="submit" name="submit" value="Search"></label></center><br>
</form>
</div>

<div>
<form action="updateUser">

<center><label>Enter Update ID</label><input type="text" name="id"></center><br>
<center><label><input type="submit" name="submit" value="Search"></label></center><br> 
</form>
</div>

<div>
<form action="deleteUser">
<center><label>Enter the ID to Delete</label><input type="text" name="id"></center><br>
<center><label><input type="submit" name="submit"></label></center><br> 
</form>
</div>



</body>
<html>
