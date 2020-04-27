<%-- 
    Document   : afficherClient
    Created on : 27 avr. 2020, 12:41:36
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="client" class="MVC.Client" scope="session" />
        
        <h2>Nom:
            <jsp:getProperty name="client"
                         property="nom" />
        </h2>
         <h2>Prenom:
            <jsp:getProperty name="client"
                         property="prenom" />
        </h2>
        <h2> Adresse:
            <jsp:getProperty name="client" property="adresse" />
        </h2>
        
        <h2> Téléphone:
            <jsp:getProperty name="client" property="telephone" />
        </h2>
        <h2> Email:
            <jsp:getProperty name="client" property="email" />
        </h2>
        
        
    </body>
</html>
