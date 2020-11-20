package ratatouille;

import java.sql.Connection;
import java.sql.SQLException;
import ratatouille.model.dao.ConnectionFactory;
import ratatouille.model.dao.IConnectionFactory;


public class Ratatouille {

    public static void main(String[] args) throws SQLException {
        IConnectionFactory conn = new ConnectionFactory();
        Connection testeConexao = conn.getConnection();
        
        if (testeConexao != null && !testeConexao.isClosed()) {
            System.out.println("Hello world");
        }
    }
    
}
