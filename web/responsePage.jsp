<%-- 
    Document   : responsePage
    Created on : Apr 16, 2013, 2:00:35 PM
    Author     : lchastee
--%>

<jsp:useBean id="player" class="QuestBean.PlayerQuestBean" scope="session"/>
<jsp:setProperty name="player" property="*"/>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello! <%=player.getName()%></h1>
        
    </body> 
</html>
