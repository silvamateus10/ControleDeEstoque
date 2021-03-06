<%-- 
    Document   : cadastro
    Created on : 19/05/2016, 22:12:22
    Author     : Mateus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <title>Cadastro</title>
        <script type="text/javascript" src= "funcoes.js" ></script>
    </head>
    <body>

        <div class="interfaceOperacoes">
            <font size="5"><a href="menu.jsp" class="linkButton">Menu<a/></font>
            <div class="operacoes">
                <fieldset>
                    <legend>Insira os dados para realizar o Cadastro:</legend>    
                    <form action="CadastroServlet" method="POST" oninput="calc_lucro();"  class="formOpreracoes">
                        
                        Nome:<input type="text" name="nome" value="" /><br/><br/>
                        Marca:<input type="text" name="marca" value="" /><br/><br/>
                        Descrição:<br/>
                        <textarea name="descricao" rows="5" cols="50">
                        </textarea><br/><br/>
                        Quantidade: <input type="number" name="qtde"  min="0" max="30" value="1"/>
                        <br/><br/>
                        Preço de Compra: R$<input type="text" id="pComp" name="precoCompra" value="0" /><br/><br/>
                        Preço de Venda: R$<input type="text" id="pVend" name="precoVenda" value="0" /><br/><br/>
                        Lucro: R$<input type="text" name="lucro" id="pLuc" value="0" readonly="readonly" /><br/><br/>
                        <input type="submit" value="Salvar" />
                    </form>
                </fieldset>    
            </div>    
        </div>
    </body>
</html>
