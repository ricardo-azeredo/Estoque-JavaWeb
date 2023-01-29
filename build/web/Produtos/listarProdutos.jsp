<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="../Includes/head.jsp"></jsp:include>
    <body>
    <jsp:include page="../Includes/navbar.jsp">
        <jsp:param name="title" value="Lista de Produtos" />
    </jsp:include>
        
        <div class="container">
            <h1>Listar Livros</h1>
            <table class="table">
                <thead>
                  <tr>    
                    <th scope="col">Código</th>
                    <th scope="col">Produto</th>                    
                    <th scope="col">Valor</th>
                    <th scope="col">Quantidade</th>
                    <th scope="col">Quantidade Mínima</th>
                    
                    <th scope="col" colspan="2">Ação</th>
                  </tr>
                </thead>
                <tbody>
                    
                        <%
                           
                            

                       %>  
                             
                </tbody>
            </table>    
        </div>
    </body>
</html>
