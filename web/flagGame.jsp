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
        <title>Flag Game</title>
    </head>
    <body>
        <c:if test="${GameBean.currentNumber > GameBean.totalQuestions}">
            <c:if test = "${(GameBean.correct == false) && (GameBean.currentNumber > 1)}">
                <h2>Incorrect. The correct answer was ${GameBean.countries.get(GameBean.currentNumber-2)}
            </c:if>
            <c:if test="${(GameBean.correct == true) && (GameBean.currentNumber > 1)}">
                <h2>Correct. The country was ${GameBean.countries.get(GameBean.currentNumber-2)}
            </c:if>
            <h2>Game Over</h2>
            <p>You scored ${GameBean.currentScore} out of ${GameBean.totalQuestions} possible questions </p>
            <p><a href="/FlagGame">Play Again</a></p>
        </c:if>
        
        <c:if test="${GameBean.currentNumber <= GameBean.totalQuestions}">
            <p>Question ${GameBean.currentNumber} out of ${GameBean.totalQuestions}</p>
            <c:if test = "${(GameBean.correct == false) && (GameBean.currentNumber > 1)}">
                <h2>Incorrect. The correct answer was ${GameBean.countries.get(GameBean.currentNumber-2)}
            </c:if>
            <c:if test="${(GameBean.correct == true) && (GameBean.currentNumber > 1)}">
                <h2>Correct. The country was ${GameBean.countries.get(GameBean.currentNumber-2)}
            </c:if>
            <h1>${GameBean.countries.get(GameBean.currentNumber-1)}</h1>
            <img src="${GameBean.urls.get(GameBean.currentNumber-1)}" />

            <form action="GameServlet2" method="POST" autocomplete="off">
                Enter the country: <input type="text" name="country" value="" autocomplete="off"/>
                <input type="submit" value="Submit" name="submit" />
            </form>
        </c:if>
    </body>
</html>
