<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
*{
text-align: center;
}
</style>
<script type="text/javascript">
	function validate() {
		var email=document.form.email.value;
		var password=document.form.password.value;
		
		if(email==null || email==""){
			alert("Email Should not be blank..");
			return false;
		}
		else if(password==null || password==""){
			alert("Password Should not be blank..");
			return false;
		}
	}
</script>
</head>
<body>
<form name="form" action="../login.do" method="post" onsubmit="return validate()">
<fieldset>
<legend>Customer Login</legend>
<table>
<tr>
<td>Email ID</td>
<td><input type="text" name="email" required></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" required></td>
</tr>
<tr>
<td><input type="Submit" name="Login" value="Login"></td>
<td><input type="Reset" name="formreset" value="Reset"></td>
</tr>
</table>
</fieldset>
</form>
</body>
</html>