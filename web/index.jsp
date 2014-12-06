<%-- 
    Document   : index
    Created on : Nov 21, 2014, 6:32:43 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Flag Game</title>
    </head>
    <body>
        <h1 id="welcome">Welcome to Chris's Awesome Flag Game!</h1>
            <form name="nameForm" action="GameServlet" method="POST" onsubmit="return(validateName());">
                <p><label for="name">Enter your name:</label></p>
                <p><input type="text" name="name" value="" /></p>
                <p><input type="submit" value="Start Game" name="submit" /></p>
            </form>
        <p id="error"></p>
        <script lang="javascript" type="text/javascript" src="validate.js"></script> 
    </body>
</html>
