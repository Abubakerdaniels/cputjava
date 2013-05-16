<%-- 
    Document   : WelcomePage
    Created on : 15 May 2013, 10:13:32 PM
    Author     : Wallied
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Cache-Control" content="no-cache"/>
        <title>JSP Page</title>
    </head>
    <body>
      
         
        <h2> ${msg.welcome}</h2>
        <p> Today is ${msg.today}</p>
        
        
        <table>
            <tr>
                <th colspan="3">
                <td><a  href="CreateCustomer.html" > Create  an customer<a></td>
                <td><a href="CreateSalesPerson.html"> Create  an  Sales Person</a> <td></td> 
                <td><a href="CreateItem.html">  Create  an  Item</a><td>     
                </th>
            </tr>
        </table>
    </body>
</html>
