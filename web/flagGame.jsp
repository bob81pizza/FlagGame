<%-- 
    Document   : flagGame
    Created on : Dec 1, 2014, 6:59:36 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${GameBean.countries.get(GameBean.currentNumber-1)}</h1>
        <img src="${GameBean.urls.get(GameBean.currentNumber-1)}" />
        
    </body>
</html>