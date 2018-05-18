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
        <option name="Apple">Apple</option>
        <option name="Mango">Mango </option>
        <option name="Orange">Orange </option>
        <option name="Pineapple">PineApple </option>

    </select>

    <input type="number" name="quantity">
    <div id="prices">
        <p> Apple : 10 php</p>
        <p> Pineapple : 20 php</p>
        <p> Orange: 9 php</p>
        <p> Mango : 15 php</p>
    </div>
</form>
</body>
</html>
