<%-- 
    Document   : gameOver
    Created on : Dec 2, 2014, 6:56:48 PM
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
        <h1>Game Over!</h1>
        <p>You scored ${GameBean.currentScore} out of ${GameBean.totalQuestions} possible questions </p>
    </body>
</html>
