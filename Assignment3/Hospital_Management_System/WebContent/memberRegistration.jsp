<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
table tr td {
    vertical-align: top;
    font-family: "Times New Roman", Times, serif;
    font-size: 40px;
    
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Patient Registration Details</title>
</head>
<body>
<form action="Register" method="post">
<table>

<tr><td> Register As a New Patient:  </td><td>
<tr><td>User Name: </td><td><input type="text" name="uname"></td></tr>

<tr><td>Password: </td><td><input type="password" name="password"></td></tr>
<tr><td>Confirm Password: </td><td><input type="text" name="confirmPassword"></td></tr>

<tr><td>Email: </td><td><input type="text" name="email"></td></tr>
<tr><td>Phone: </td><td><input type="text" name="phone"></td></tr>
<tr><td></td><td><input type="submit" value="register"></td></tr>
</table>
</form>
</body>
</html>