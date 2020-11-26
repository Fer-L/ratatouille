package Controllers;

import java.util.List;
import ratatouille.model.dao.IReceitaDAO;
import ratatouille.model.dao.ReceitaDAO;
import ratatouille.model.entity.Receita;

public class receitaController {
    public boolean cadastrarReceita (Receita receita) {
        IReceitaDAO receitaDAO = new ReceitaDAO();
        return receitaDAO.Salvar(receita);
    }
    
    public boolean excluirReceita (int cod) {
        IReceitaDAO receitaDAO = new ReceitaDAO();
        return receitaDAO.Apagar(cod);
    }
    
    public boolean EditarReceita (Receita receita) {
        IReceitaDAO receitaDAO = new ReceitaDAO();
        return receitaDAO.Editar(receita);
    }
    
    public Receita LerReceita (int cod) {
        IReceitaDAO receitaDAO = new ReceitaDAO();
        return receitaDAO.Ler(cod);
    }
   
    public List<Receita> LerTodasReceitas () {
        IReceitaDAO receitaDAO = new ReceitaDAO();
        return receitaDAO.LerTodasReceitas();
    } 
    
}
