
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>


<%@page import="controle.classes.Conexao"%>
<%@page import="controle.classes.Aparelho"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    
   String id = (String) session.getAttribute("id");
   String nome = (String) session.getAttribute("nome");
   String marca = (String) session.getAttribute("marca");
   String descricao = (String) session.getAttribute("descricao");
   String qtde = (String) session.getAttribute("qtde");
   String precoCompra = (String) session.getAttribute("precoCompra");
   String precoVenda = (String) session.getAttribute("precoVenda");
   String lucro = (String) session.getAttribute("lucro");
%>
<!DOCTYPE html>
<html xmlns:h="http://xmlns.jcp.org/jsf/html" xmlns:f="http://xmlns.jcp.org/jsf/core">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <title>Consulta</title>
    </head>
    <body>
        <div class="interfaceOperacoes">
            <font size="5"><a href="menu.jsp" class="linkButton">Menu<a/></font>
            <div class="operacoes">
                <fieldset>
                    <legend>Digite o nome do produto a ser procurado:</legend>    

                    <form  action="BuscarServlet" method="Post">
                        Insira o Nome: <input type="text" name="nome" value="" /><br/><br/><br/>
                        <input type="submit" value="Buscar" />
                    </form>
                    
                    <br/><br/><br/><br/><br/>
                    <table border="1">
                        <thead>
                            <tr>
                                <th>Código</th>
                                <th>Nome</th>
                                <th>Marca</th>
                                <th>Descrição</th>
                                <th>Quantidade</th>
                                <th>Preço de Compra</th>
                                <th>Preço de Venda</th>
                                <th>Lucro</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><%=id %></td>
                                <td><%=nome %></td>
                                <td><%=marca %></td>
                                <td><%=descricao %></td>
                                <td><%=qtde %></td>
                                <td><%=precoCompra %></td>
                                <td><%=precoVenda %></td>
                                <td><%=lucro %></td>
                            </tr>
                        </tbody>
                   </table>
                </fieldset>
            </div>
                <br/><br/><br/><br/><br/>
                <center>
                <font size="5"><a href="cadastro.jsp" class="linkButton">Cadastrar novo produto<a/></font>
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <font size="5"><a href="editar.jsp" class="linkButton">Editar produto<a/></font>  
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <font size="5"><a href="excluir.jsp" class="linkButton">Excluir produto<a/></font>
                </center>    
        </div>


        
                </body>
                </html>
