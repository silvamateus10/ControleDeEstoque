<%-- 
    Document   : excluir
    Created on : 19/05/2016, 22:28:33
    Author     : Mateus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <title>Excluir</title>
    </head>
    <body>
         <div class="interfaceOperacoes">
             <font size="5"><a href="menu.jsp" class="linkButton">Menu<a/></font>
            <div class="operacoes">
                <fieldset>
                    <legend>Digite o código do aparelho a ser excluido:</legend>    
            <form  action="ExcluirServlet" method="POST" class="formOpreracoes">
            <br/><br/><br/>
                <input type="text" name="id" value="" />  
                <input type="submit" value="Excluir" />
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  <font size="4">
                    <a href="buscar.jsp" class="linkButton">Consultar Código<a/>
                </font>
            </form>
                </fieldset>
            </div>
         </div>
        
    </body>
</html>
