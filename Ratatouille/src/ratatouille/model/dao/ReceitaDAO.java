package ratatouille.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        
        String comando = "INSERT INTO receitas (nomeDaReceita, nomeAutor,"
                + "rendimentoPorcao, categoria, tempo, passos, ingredientes) "
                + "VALUES (?,?,?,?,?,?,?)";
        
        
        
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(comando);
            
            preparedStatement.setString(1, receita.getNomeDaReceita());
            preparedStatement.setString(2, receita.getNomeAutor());
            preparedStatement.setInt(3, receita.getRendimentoPorcao());
            preparedStatement.setString(4, receita.getCategoria());
            preparedStatement.setFloat(5, receita.getTempo());
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
        Connection conn = connFactory.getConnection();
        String comando = "delete from receitas where cod = ?";
       
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(comando);
            preparedStatement.setInt(1, cod);  
            
            preparedStatement.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ReceitaDAO.class.getName()).log(Level.SEVERE, 
                    null, ex);
           
        }
        connFactory.closeConnection(conn);
        return false;
         
    }




    
    public Receita Ler(int cod) {
        
        Connection conn = connFactory.getConnection();
        String comando = "select * from receitas";  
        Receita receita = new Receita();
        
        try { 
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(comando);
            
            while(resultSet.next()){
                
                  
                  receita.setNomeDaReceita(resultSet.getString("nomeDaReceita"));
                  receita.setNomeAutor(resultSet.getString("nomeAutor"));
                  receita.setRendimentoPorcao(resultSet.getInt("rendimentoPorcao"));
                  receita.setCategoria(resultSet.getString("categoria"));
                  receita.setTempo(resultSet.getFloat("tempo"));
                  receita.setPassos(resultSet.getString("passos"));
                  receita.setIngredientes(resultSet.getString("ingredientes"));
                  
               
                
            } 
            
            statement.close();
            
            return receita;
           
        } catch (SQLException ex) {
            Logger.getLogger(ReceitaDAO.class.getName()).log(Level.SEVERE, 
                    null, ex);
           
        }
        connFactory.closeConnection(conn);
            
        return receita;
    }
   


    public boolean Editar(Receita receita) {
        
        Connection conn = connFactory.getConnection();
        String comando = "update receitas set nomeAutor = ?,"
                + "rendimentoPorcao = ?, categoria = ?,"
                + "tempo = ?, passos = ?, ingredientes = ?  "
                + "where cod = ?";
        
      
       
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(comando);
            preparedStatement.setString(1, receita.getNomeDaReceita());
            preparedStatement.setString(2, receita.getNomeAutor());
            preparedStatement.setInt(3, receita.getRendimentoPorcao());
            preparedStatement.setString(4, receita.getCategoria());
            preparedStatement.setFloat(5, receita.getTempo());
            preparedStatement.setString(6, receita.getPassos());
            preparedStatement.setString(7, receita.getIngredientes()); 
            
            preparedStatement.executeUpdate();
            return true;
            
           
        } catch (SQLException ex) {
            Logger.getLogger(ReceitaDAO.class.getName()).log(Level.SEVERE, 
                    null, ex);
           
        }
        connFactory.closeConnection(conn);
        return false;
        
    }
}
