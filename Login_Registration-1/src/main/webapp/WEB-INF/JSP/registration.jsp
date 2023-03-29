<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<html>
<head>
<title>Welcome to Registration</title>
<style type="text/css">

	body{background-color:#e8e8e8;}
	label
	{
	font-size:13px;
	width:150px;
	display:inline-block;
	text-align:center;
	font-family:"Times New Roman",times,sans-serif;
	}
	
	#form1{
	width:350px;
	height:450px;
	background-color:#ffffff;
	color:block;
	font-weight:bold;
	box-shadow:1px 1px 2px;
	border-radius:25px;
	margin:0.5% auto;
	padding:30px;
	
	}
	
	 #select1{
	width:50%;
	margin:5px 0;
	}
	
	input{
	width:100%;
	padding: 10px 15px;
	margin:5px 0;
	box-sizing: border-box;
	}
	
	h2{
	margin:1% auto;
	text-align:center;
	color:blue;
	font-size:25px;
	}
	
	.space{
	width:10px;
	height:auto;
	display:inline-block;}
	
	.box{
	width:175px;
	height:20px;
	display:inline-block;}
</style>

</head>
<body background-color:#e8e8e8;>
<div>
<div th:if="${param.success}">
				<div class="alert alert-info">You've successfully registered to our awesone application!</div>
				<h1>Registration</h1>
<form id="form1" action="register">
<label>NAME</label><input class="box" type="text" name="name" autocomplete="off"><br>
<label>DATE OF BIRTH</label><input class="box" type="date" name="bday" required/><br>
<label>PHONE NUMBER</label><input class="box" type="text" name="phnumber" autocomplete="off"><br>
<label>E_MAIL</label><input class="box" type="email" name="email" autocomplete="off"><br>
<label>COUNTRY</label><input class="box" type="text" name="country" autocomplete="off"><br>
<label>STATE</label><input class="box" type="text" name="state" autocomplete="off"><br>
<label>CREATED DATE</label><input class="box" type="datetime-local" name="createddate"><br>
<label>CREATED BY</label><input class="box" type="text" name="createdby"><br>
<label>USER NAME</label><input class="box" type="text" name="username" autocomplete="off"><br>
<label>PASSWORD</label><input class="box" type="password" name="password" autocomplete="off"><br>
<label>STATUS</label><select id="select1" class="box"><option value="default">Choose..<option><option>ACTIVE<option><option>INACTIVE<option></select>
<label>ROLE</label><select  id="select1" class="box"><option value="default">Choose..<option><option>ROLE_ADMIN<option><option>ROLE_USER<option></select><br><br>
<center><label><button type="submit" name="submit">SIGN UP</button><div class="space"></div><button type="reset" name="submit">RESET</button></label></center><br>


</dialog>
</form>
</div>

</body>
</html>
