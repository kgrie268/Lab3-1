<%-- 
    Document   : login
    Created on : Sep 17, 2017, 6:36:06 PM
    Author     : 742227
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
            <h1>Login</h1>
            <form  action="login" name= "ageCal" method="post">
            <p>Username:  <input type ="text" name="userName" ></p>
            <p>Password:  <input type ="text" name="passWord" ></p>
            <input type ="submit" value="Login" > 
            </form>
            ${errorMessage}
            
    </body>
</html>
