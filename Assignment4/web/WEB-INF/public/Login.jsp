<%-- 
    Document   : Login
    Created on : 19 May 2013, 7:26:11 PM
    Author     : Wallied
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
     <c e n t e r>
<form action="j_spring_securitycheck "method="POST">
<label for="j_username">User name </label>
<input type="text" name="j_username " id="j_username " />
<br/>
<label for="j_password">Password </label>
<input type="password" name="j_password" id="j_password"/>
<br/>
<input type='checkbox' name='spring_security_remember_me '/>Remember me
on this computer.
<br/>
<input type="submit" value="Login"/>
</form>
</center>
    </body>
</html>
