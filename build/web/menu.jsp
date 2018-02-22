<%-- 
    Document   : index
    Created on : 19/05/2016, 22:06:15
    Author     : Mateus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <title>Principal</title>
        <style>
            .lista{
                float: right;
            }
        </style>
        
    </head>
    <body>
            
            
            
        <div id="interface">   
            <br/>
                <form action="ListarTudoServlet" method="POST" class="lista">
                    <input type="submit" value="Listar Produtos" />
                </form>
             <br/> <br/>
                <form action="ListarMsgServlet" method="POST" class="lista">
                    <input type="submit" value="Listar Mensagens" />
                </form>
            <br/> <br/>
                <form action="ApagarMsgServlet" method="POST" class="lista">
                    <input type="submit" value="Apagar Todas as Mensagens" />
                </form>
            <div id="interface2">
        
                <h1>Controle Básico de Aparelhos:</h1> 

                <h2><a href="cadastro.jsp" class="menu">Cadastrar<a/></h2><br/>
                <h2><a href="editar.jsp" class="menu">Editar<a/></h2><br/>
                <h2><a href="excluir.jsp" class="menu">Excluir<a/></h2><br/>
                <h2><a href="buscar.jsp" class="menu">Consultar<a/></h2><br/><br/>
                
                
            </div>
        </div> 
    </body>
</html>
