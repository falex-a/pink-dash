<%-- 
    Document   : newjsp
    Created on : Apr 15, 2016, 11:41:51 AM
    Author     : User


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
--%>

<%@ page import="main.*" %>
<%-- <%@ page import="main.notmain" %>
--%>
<%@ page import="java.util.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page </title>
    </head>
    <body>
        <h1>Hello World!</h1>        
        <% out.println("parsum = "+notmain.myvar); %>
    </body>
</html>
