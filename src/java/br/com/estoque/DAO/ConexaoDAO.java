
package br.com.estoque.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    
    public Connection conexaoDB() throws ClassNotFoundException{
        Connection conn = null;
        
        try {
            Class.forName("jdbc:com.mysql.jdbc.Drive");
            String url = "jdbc:mysql://localhost:3306/estoque?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e){
            System.out.println("Não conectou. Erro: "+ e);
        }
        
        return conn;
    }
}
