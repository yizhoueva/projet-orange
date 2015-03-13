<%-- 
    Document   : response
    Created on : 25 févr. 2015, 16:41:24
    Author     : nicolascapon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="noyaufonctionnel.NameHandler" />
        <jsp:setProperty name="request" property="name"/>
        <h1> <jsp:getProperty name="mybean" property="name" /> </h1>
</body>
</html>
