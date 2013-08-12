<%-- 
    Document   : CreateItem
    Created on : 15 May 2013, 9:09:47 PM
    Author     : Wallied
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Sending A Message</title>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Cache-Control" content="no-cache"/>
    </head>
	<body>
       <form:form  method="post"  action="showItem.html">
        <table>
           <tr>
             <td>  <form:label  path="quantity" class="text">Quantity</form:label></td>
             <td>  <form:input  path="quantity"/></td>
           </tr> 
           <tr>
               <td  colspan ="2">
                   <input  type="submit" value="CreateItem"/>
               </td>
           </tr>
        </table>
    </form:form>
    </body>
</html>