<%-- 
    Document   : showCustomer
    Created on : 19 May 2013, 12:54:59 PM
    Author     : Wallied
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create  Sales Person</title>
    </head>
    <body>
         <p>Daily  Sales:   ${msg2.daily_SalesHandled}<p>
           
       <p>Full Time :  ${msg2.fulltime}</p>
       <p>Monthly TurnOver:     ${msg2.hisMonthTurnOver}</p>
       <p>Name :   ${msq2.firstName}</p>
       <p>Last Name: ${msg2.lastName}</p>
       <p>Sales Person ID: ${msg2.id}
    </body>
</html>
