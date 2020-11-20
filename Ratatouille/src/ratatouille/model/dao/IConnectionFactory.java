package ratatouille.model.dao;

import java.sql.Connection;

public interface IConnectionFactory {
    public Connection getConnection();
    public void closeConnection(Connection conn);
}
