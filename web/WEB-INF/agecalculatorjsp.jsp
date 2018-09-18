<%-- 
    Document   : agecalculatorjsp
    Created on : Sep 14, 2018, 4:23:44 PM
    Author     : 738409
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
            <body>
        <h1>Age Calculator</h1>
        <form method="post">
            Enter age: <input min = "0" name="age" value="${age}"><br>
            
            <input type="submit" value="Age next birthday">
        </form>
        <div>
            ${message}
            ${result}
           
            <a href="calc">Arithmetic Calculator</a>
        </div>
        
    </body>
    
</html>
