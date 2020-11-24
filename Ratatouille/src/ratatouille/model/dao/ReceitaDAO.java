package ratatouille.model.dao;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ratatouille.model.entity.Receita;

public class ReceitaDAO implements IReceitaDAO{
    
    private IConnectionFactory connFactory;
    
    public ReceitaDAO() {
        connFactory = new ConnectionFactory();
    }
    
    public boolean Salvar(Receita receita) {
        Connection conn = connFactory.getConnection();
        
        String comando = "INSERT INTO receitas VALUES (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(comando);
            
            preparedStatement.setString(1, receita.getNomeDaReceita());
            preparedStatement.setString(2, receita.getNomeAutor());
            preparedStatement.setInt(3, receita.getRendimentoPorcao());
            preparedStatement.setString(4, receita.getCategoria());
            preparedStatement.setDate(5, java.sql.Date.valueOf(receita.getTempo().toString()));
            preparedStatement.setString(6, receita.getPassos());
            preparedStatement.setString(7, receita.getIngredientes());

            preparedStatement.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ReceitaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        connFactory.closeConnection(conn);
        return false;
    }


    public boolean Apagar(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


    public Receita Ler(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


    public boolean Editar(Receita receita) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
