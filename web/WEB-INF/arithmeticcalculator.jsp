<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 14, 2018, 5:01:02 PM
    Author     : 738409
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arith Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
           
             
        <form method="post" action="calc">
             First: <input type="text"  name="first" value="${first}" ><br>
             Second: <input type="text"  name="second" value="${second}" ><br>
             <input type="submit" value="+" name="op">
             <input type="submit" value="-" name="op">
             <input type="submit" value="*" name="op">
             <input type="submit" value="%" name="op">
             </form>
             
           
             
       
             <div>
                 ${result}
                 
             </div>
             <a href="age">Back to Age Calculator</a>
    </body>
</html>
