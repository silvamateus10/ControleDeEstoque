
<%@page contentType="text/html" pageEncoding="UTF-8"%>




<%
   String id = (String) session.getAttribute("id");
   //String nome = (String) session.getAttribute("nome");
   //String marca = (String) session.getAttribute("marca");
   //String descricao = (String) session.getAttribute("descricao");
   //String precoCompra = (String) session.getAttribute("precoCompra");
   //String precoVenda = (String) session.getAttribute("precoVenda");
   //String lucro = (String) session.getAttribute("lucro");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <table border="1">
            <thead>
                <tr>
                    <th>Código</th>
                    <th>Nome</th>
                    <th>Marca</th>
                    <th>Descrição</th>
                    <th>Preço de Compra</th>
                    <th>Preço de Venda</th>
                    <th>Lucro</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%=id %></td>
                    <td><%=//nome %></td>
                    <td><%=//marca %></td>
                    <td><%=//descricao %></td>
                    <td><%=//precoCompra %></td>
                    <td><%=//precoVenda %></td>
                    <td><%=//lucro %></td>
                </tr>
            </tbody>

    </body>
</html>
