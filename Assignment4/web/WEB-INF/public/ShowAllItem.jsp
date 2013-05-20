<%-- 
    Document   : ShowAllItem
    Created on : 19 May 2013, 3:08:49 PM
    Author     : Wallied
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stock</title>
    </head>
    <body>
        <center>
        
         <table class="table table-hover">
        <caption> <h1>All  Item  In  Stock</h1></caption>
        <thead>
            <tr>
                <th>Description</th>
                <th>Item  ID </th>
                <th>Size</th>
                <th>Model</th>
                <th>Price</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach var="msg3" items="${msg3}">
                <tr>
                    <td>${msg3.Description}</td>
                    <td>${msg3.Item_ID} </td>
                    <td>${msg3.sizes}</td>
                    <td>${msg3.model}</td>
                    <td>${msg3.Price}</td>
                </tr>

            </c:forEach>

        </tbody>
        </center>
    </body>
</html>