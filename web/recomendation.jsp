<%@ page import="java.util.ArrayList" %>
<%@ page import="com.arriesga.controller.Logic.Solve" %><%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 5/11/2018
  Time: 1:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String s = request.getAttribute("value").toString()  ;
    String s1 = request.getAttribute("value2").toString()  ;
    out.print("Your Transaction : \n" + "<br>" +"     "+ s +  " \n " + s1 + "<br>");
    out.print("<br> I see you Like : " + s1 + "<br> Try: other fruits \n"  + " <br>" );
    ArrayList string = new ArrayList<String>();
    Solve m = new Solve();
    string =  m.recommendations(s1);
    int counter = 0 ;
    while(string.size() > counter){

        out.print(
                "<br> " + string.get(counter).toString() + " <br>");
        counter++;
    }

%>

<form action="login.jsp" method="get"><input type="submit" value="Try"></form>
</body>
</html>
