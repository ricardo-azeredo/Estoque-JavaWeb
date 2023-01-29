package br.com.estoque.DAO;

import br.com.estoque.DTO.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDAO {
    Connection conn;
    PreparedStatement pstm;
    //ResultSet rs;
    
    public void CadastrarProduto(Produto produto) throws ClassNotFoundException{
        String sql = "INSERT INTO produtos (nome,valor,quantidade,min_quantidade) VALUES (?,?,?,?)";
        conn = new ConexaoDAO().conexaoDB();
        
        try {
           pstm = conn.prepareStatement(sql);
           String nome = produto.getNome();
           double valor = produto.getValor();
           int quantidade = produto.getQuantidade();
           int minQuantidade = produto.getMinQuantidade();
           pstm.setString(1,nome);
           pstm.setDouble(2, valor);
           pstm.setInt(3, quantidade);
           pstm.setInt(4, minQuantidade);
           
           pstm.execute();
           pstm.close();
           
           
        } catch(SQLException e){
            System.out.println("Não cadastrou o Produto. Erro: " + e);
        }
    
    }
}
