<%-- 
    Document   : login
    Created on : 23/05/2016, 18:36:37
    Author     : Mateus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Login</title>
    </head>
    <body>
        <div id="login">
        <fieldset id="fildLogin">
        <legend>Insira o e-mail e a senha: </legend>
        <form action="LoginServlet" method="POST" id="formLogin">
            Login:<input type="text" name="login" value="" /> <br/><br/><br/><br/>
            Senha:<input type="password" name="senha" value="" /> <br/><br/><br/><br/>
            <input type="submit" value="Acessar" />
        </form>
        </fieldset>    
        </div>
    </body>
</html>
