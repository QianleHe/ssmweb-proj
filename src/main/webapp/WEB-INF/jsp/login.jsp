<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login page</title>
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<br>
	<form name="form1" action="/member/login.do" method="post" >
	  <table width="300" border="1" align="center">
	  <tr>
	    <td colspan="2">Login window</td>
	  </tr>
	  <tr>
	      <td>UserName:</td>
	      <td><input type="text" name="memberEmail">
	      </td>
	  </tr>
	  <tr>
	      <td>Password:</td>
	      <td><input  type="password" name="password"/>
	      </td>
	  </tr>
	  <tr>
	    <td colspan="2">
	      <input type="submit" name="submit" value="登录"/>
	    </td>
	
	
	  </tr>
	  </table>
</form>
</body>
</html>