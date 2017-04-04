<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<br>
			<br>
			<br>
			<br>
			<br>
			<form name="form1" action="/register/i.do" method="post" >
				  <table width="300" border="1" align="center">
				  <tr>
				    <td colspan="2">Register</td>
				  </tr>
				  <tr>
				      <td>Email:</td>
				      <td><input  type="text" name="memberEmail"/>
				      </td>
				  </tr>
				  <tr>
				      <td>UserName:</td>
				      <td><input type="text" name="memberName">
				      </td>
				  </tr>
				  <tr>
				      <td>Password:</td>
				      <td><input  type="password" name="password"/>
				      </td>
				  </tr>
				  <tr>
				      <td>Age:</td>
				      <td><input  type="text" name="age"/>
				      </td>
				  </tr>
				  <tr>
				      <td>Gender:</td>
				      <td><input type="radio" name="gender" value="0" checked>Male
						  <input type="radio" name="gender" value="1">Female
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