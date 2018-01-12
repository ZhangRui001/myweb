<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*,entity.User" %>
<html>
<head>
    <title>用户</title>
    <style>
        table,td{
            border: 1px solid black;
            border-collapse:collapse ;
        }
        table{
            width: 800px;
            margin: auto;
        }
        table
    </style>
</head>
<body>
<%
    List<User> users=(List<User>) request.getAttribute("sno");
%>
<table>
    <tr>
        <td>sno</td>
        <td>cno</td>
        <td>degree</td>


    </tr>
    <%
        for (User user : users) {
    %>
    <tr>
        <td><% out.print(user.getSno());%></td>
        <td><%=user.getCno()%></td>
        <td><%=user.getDegree()%></td>

    </tr>
    <%
        }
    %>

</table>
</body>
</html>
