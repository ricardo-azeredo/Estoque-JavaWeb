package br.com.estoque.DAO;

import br.com.estoque.DTO.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ClienteDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Cliente> lista = new ArrayList<>();
    
    public void CadastrarCliente(Cliente cliente) throws ClassNotFoundException{
        String sql = "INSERT INTO clientes (nome,email,vip) VALUES (?,?,?)";
        conn = new ConexaoDAO().conexaoDB();
        
        try {
           pstm = conn.prepareStatement(sql);
           
           String nome = cliente.getNome();
           String email = cliente.getEmail();
           Boolean vip = cliente.getVip();
           
           pstm.setString(1,nome);
           pstm.setString(2, email);
           pstm.setBoolean(3, vip);
                      
           pstm.execute();
           pstm.close();
           
           
        } catch(SQLException e){
            System.out.println("Não cadastrou o Produto. Erro: " + e);
        }
    
    }
    
    public ArrayList<Cliente> PesquisarClientes(){
        String sql = "Select * from clientes";
        conn = new ConexaoDAO().conexaoDB();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setVip(rs.getBoolean("vip"));
                lista.add(cliente);
            }
            pstm.close();
        }catch(SQLException e){
        
        }
        return lista;
    }
}
