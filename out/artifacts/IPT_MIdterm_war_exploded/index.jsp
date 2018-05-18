<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/11/2018
  Time: 1:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/Register">
  <p>Register</p>
  <input type="text" placeholder="Username" name="user">
  <br>
  <br>
  <input type="password" placeholder="Password" name="pass">
  <br>
  <br>
  <input type="email" placeholder="Email" name="email">
  <br>
  <br>
  <br>
  <input type="text" placeholder="First Name" name="fname">
  <br>
  <br>
  <input type="text" placeholder="Last Name" name="lname">
  <br>
  <br>
  <input type="submit" value="Register">
  </form>
  <br>
  <form method="get" action="login.jsp"><input type="submit" value="Login"></form>
  </body>
</html>
