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
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <div id="contentWrapper">
        <c:if test="${GameBean.currentNumber > GameBean.totalQuestions}">
            <c:if test = "${(GameBean.correct == false) && (GameBean.currentNumber > 1)}">
                <h2 class="incorrect">Incorrect. The correct answer was ${GameBean.countries.get(GameBean.currentNumber-2)}</h2>
            </c:if>
            <c:if test="${(GameBean.correct == true) && (GameBean.currentNumber > 1)}">
                <h2 class="correct">Correct. The country was ${GameBean.countries.get(GameBean.currentNumber-2)}</h2>
            </c:if>
            <div class="gameOver">
                <h2>Game Over</h2>
                <p>You scored ${GameBean.currentScore} out of ${GameBean.totalQuestions} possible questions </p>
                <p><a href="/FlagGame">Play Again</a></p>
            </div>
        </c:if>
        
        <c:if test="${GameBean.currentNumber <= GameBean.totalQuestions}">
            <h2 id="question">Question ${GameBean.currentNumber} out of ${GameBean.totalQuestions}</h2>
            <c:if test = "${(GameBean.correct == false) && (GameBean.currentNumber > 1)}">
                <h2 class="incorrect">Incorrect. The correct answer was ${GameBean.countries.get(GameBean.currentNumber-2)}</h2>
            </c:if>
            <c:if test="${(GameBean.correct == true) && (GameBean.currentNumber > 1)}">
                <h2 class="correct">Correct. The country was ${GameBean.countries.get(GameBean.currentNumber-2)}</h2>
            </c:if>

            <div id="flag">
                <img src="${GameBean.urls.get(GameBean.currentNumber-1)}" />
            </div>

            <form name="flagForm" action="GameServlet2" method="POST" autocomplete="off" onsubmit="return(validateCountry())">
                <label for="country">Enter the country: </label>
                    <input type="text" name="country" value="" autocomplete="off" id="countryInput"/>
                <input type="submit" value="Submit" name="submit" />
            </form>
            <p id="error"></p>
        </c:if>
        </div>
        <script>
            document.getElementById("countryInput").focus();
        </script>
            <script lang="javascript" type="text/javascript" src="validate.js"></script>
    </body>
</html>
