<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<form name="form1" method="get" >
	  <table width="300" border="1" align="center">
	  <tr>
	    <td colspan="2">memberinfo window</td>
	  </tr>
	  <tr>
	      <td>UserName:</td>
	      <td>${newmember.memberName}</td>
	  </tr>
	  <tr>
	  	  <td>UserEmail:</td>
	  	  <td>${newmember.memberEmail}</td>
	  </tr>
	  <tr>
	  	  <td>Gender:</td>
	  	  <td><%-- ${newmember.gender} --%>
	  	  	<c:choose>
	  	  		<c:when test = "${newmember.gender == 0}">
	  	  			Male
	  	  		</c:when>
	  	  		<c:when test = "${newmember.gender == 1}">
	  	  			Female
	  	  		</c:when>
	  	  		<c:otherwise>
	  	  			Unknown
	  	  		</c:otherwise>
	  	  	</c:choose>
	  	  </td>
	  </tr>
	  <tr>
	  	  <td>Age:</td>
	  	  <td>${newmember.age}</td>
	  </tr>
	  </table>
	  
	</form>
</body>
</html>