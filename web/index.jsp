
<html>
    <jsp:include page="Includes/head.jsp"></jsp:include>
    <body>
    <jsp:include page="Includes/navbar.jsp">
        <jsp:param name="title" value="Home" />
    </jsp:include>
        
         <div class="container">
            <div>
                <h1>Java Web - Livraria</h1>
            </div>
             <a type="button" class="btn btn-primary" href="/Estoque/Produtos/frmCadastrarProduto.jsp" >Cadastrar Produto</a>
            
            <a type="button" class="btn btn-primary" href="/Estoque/Produtos/listarProdutos.jsp">Consultar Produtos</a>
        </div>
    </body>
</html>
