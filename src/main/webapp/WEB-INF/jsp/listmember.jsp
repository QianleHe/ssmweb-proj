<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
			<form name="form1">
				  <table width="300" border="1" align="center">
				  <tr>
				    <td>Id</td>
				    <td>Name</td>
				    <td>Email</td>
				    <td>gender</td>
				    <td>age</td>
				    <td>password</td>
				  </tr>
				
				  <c:forEach var="m" items="${memberlist}"> 
				  <tr>
				      <td>${m.memberId}</td>
				      <td>${m.memberName}</td>
				      <td>${m.memberEmail}</td>
				      <td>${m.gender}</td>
				      <td>${m.age}</td>
				      <td>${m.password}</td>
				  </tr>
				  </c:forEach>
				  
				  </table>
			</form>
</body>
</html>