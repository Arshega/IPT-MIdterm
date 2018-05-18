<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/11/2018
  Time: 1:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String s = request.getAttribute("value").toString();
    out.print(" Hello " + s +"<br>");
%>

<p> Drink Selection </p>
<form method="post" action="/Transaction">
    <select name="Fruits">
        <option name="Nature Spring">Nature Spring</option>
        <option name="C2">C2 </option>
        <option name="Cobra Energy Drink">Cobra Energy Drink </option>
        <option name="Sting">Sting </option>

    </select>

    <input type="number" name="quantity">
    <div id="prices">
        <p> Nature Spring : 25 php</p>
        <p> C2 : 15 php</p>
        <p> Cobra Energy Drink: 10 php</p>
        <p> Sting : 10 php</p>
    </div>
</form>
</body>
</html>
