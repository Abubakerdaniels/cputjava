<%-- 
    Document   : CreateSalesPerson
    Created on : 15 May 2013, 9:08:18 PM
    Author     : Wallied
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Cache-Control" content="no-cache"/>
        <title>Add  A  Sales Person</title>
    </head>
    <body>
        <form:form  method="post"  action="showSalesPerson.html">
        <table>
           <tr>
             <td>  <form:label  path="daily_SalesHandled">Daily  Sales Handled </form:label></td>
             <td>  <form:input  path="daily_SalesHandled"/></td>
           </tr> 
           <tr>
             <td> <form:label  path="hisMonthTurnOver">Month TurnOver</form:label></td>
             <td> <form:input  path="hisMonthTurnOver"/></td>
           </tr>
           <tr>
             <td> <form:label  path="temp"> Temp</form:label></td>
             <td> <form:input  path="temp"/></td>
           </tr>
           <tr>
             <td> <form:label  path="proceedPerYear"  > Proceed Per  Year</form:label></td>
             <td> <form:input  path="proceedPerYear"/></td>
           </tr>
           <tr>
             <td> <form:label  path="firstName"  > First Name</form:label></td>
             <td> <form:input  path="firstName"/></td>
           </tr>
           <tr>
              <td> <form:label  path="lastName"  >Last Name</form:label></td>
              <td> <form:input  path="lastName"/></td>
           </tr>
           <tr>
              <td> <form:label  path="dateOfBirth"  >Date Of Birth</form:label></td>
              <td> <form:input  path="dateOfBirth"/></td>
           </tr>
           <tr>
              <td> <form:label  path="emailAddress"  >Email Address</form:label></td>
              <td> <form:input  path="emailAddress"/></td>
           </tr>
           <tr>
              <td> <form:label  path="gender"  >Gender</form:label></td>
              <td> <form:input  path="gender"/></td>
           </tr>
            <tr>
              <td> <form:label  path="postalAddress"  >Postal Address</form:label></td>
              <td> <form:input  path="postalAddress"/></td>
           </tr>
          <tr>
              <td> <form:label  path="physicalAddress"  >Physical Address</form:label></td>
              <td> <form:input  path="physicalAddress"/></td>
           </tr>
            <tr>
              <td> <form:label  path="postalCode"  >Postal Code</form:label></td>
              <td> <form:input  path="postalCode"/></td>
           </tr>
           <tr>
               <td  colspan ="4">
                   <input  type="submit" value="CreateSalesPerson"/>
               </td>
           </tr>
        </table>
    </form:form>
    </body>
</html>
