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
<h3>ID:${userinfo.id} in Details Added Successfully</h3> 
<table border='1'>
<thead>
<tr>
<th>ID</th>
<th>NAME</th>
<th>AGE</th>
<th>CITY</th>
<th>PHONE NUMBER</th>
<th>PASSWORD</th>
<th>USERNAME</th>
</tr></thead>
<tbody>
<tr>
<td>${userinfo.id}</td>
<td>${userinfo.name}</td>
<td>${userinfo.age}</td>
<td>${userinfo.city}</td>
<td>${userinfo.phone-number}</td>
<td>${userinfo.password}</td>
<td>${userinfo.username}</td>

</td>
</tr>
</tbody>
</table>


<form action="index">
<button type="submit">HOME</button></form></label></div>

</body>
</html>