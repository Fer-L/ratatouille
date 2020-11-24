package ratatouille.model.dao;
    
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory implements IConnectionFactory {

    
    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/ratatouille";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, "root", "ratocozinheiro");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void closeConnection(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
    }

    
    
    
}
