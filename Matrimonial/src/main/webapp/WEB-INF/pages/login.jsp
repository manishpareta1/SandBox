<%@ page language="java" contentType="text/html; charset=UTF-8"  
 pageEncoding="UTF-8"%>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Login</title>  
</head>  
<body>  
 <center>  
  
  <div style="color: teal; font-size: 30px">User Login</div>  
  
  
  
  <c:url var="userLogin" value="saveUser.html" />  
  <form:form id="loginForm" modelAttribute="userLogin" method="post"  
   action="login">  
   <table width="400px" height="150px"> 
   <tr>  
     <td><form:label path="userName">User Name</form:label>  
     </td>  
     <td><form:input path="userName" />  
     </td>  
    </tr>   
    <tr>  
     <td><form:label path="password">password</form:label>  
     </td>  
     <td><form:input path="password" />  
     </td>  
    </tr>  
   <tr>
     <td></td>  
     <td><input type="submit" value="Login" /></td>  
    </tr>  
   </table>  
  </form:form>  
  
  
  <a href="register">Not a user, Sign up here!!</a>  
 </center>  
</body>  
</html>  