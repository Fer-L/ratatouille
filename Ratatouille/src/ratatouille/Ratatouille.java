 package ratatouille;

import java.sql.Connection;
import java.sql.SQLException;
import ratatouille.model.dao.ConnectionFactory;
import ratatouille.model.dao.IConnectionFactory;
import ratatouille.model.dao.IReceitaDAO;
import ratatouille.model.dao.ReceitaDAO;
import ratatouille.model.entity.Receita;


public class Ratatouille {

    public static void main(String[] args) throws SQLException {
        IReceitaDAO receitaDAO = new ReceitaDAO();
        
        //java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        
        
        Receita r = new Receita();
        r.setNomeDaReceita("Bolo de fubá");
        r.setNomeAutor("Vovó");
        r.setRendimentoPorcao(1);
        r.setCategoria("Doces");
        r.setTempo(1.0f);
        r.setPassos("aqui vai a receita");
        r.setIngredientes("aqui vao os ingredientes");
        
        //receitaDAO.Salvar(r);
        //receitaDAO.Apagar(2);
        //receitaDAO.Editar(r);
        receitaDAO.Ler(1);
    }
    
}
