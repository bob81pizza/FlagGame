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
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Flag Game</title>
    </head>
    <body>
        <div id="contentWrapper">
            <div class="gameOver">
                <h2>Game Over!</h2>
                <p>You scored ${GameBean.currentScore} out of ${GameBean.totalQuestions} possible questions </p>
                <p><a href="/FlagGame">Play Again</a></p>
            </div>
        </div>
    </body>
</html>
