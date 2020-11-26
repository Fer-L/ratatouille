 package ratatouille;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import ratatouille.model.dao.ConnectionFactory;
import ratatouille.model.dao.IConnectionFactory;
import ratatouille.model.dao.IReceitaDAO;
import ratatouille.model.dao.ReceitaDAO;
import ratatouille.model.entity.Receita;
import ratatouille.view.TelaCadastro;
import ratatouille.view.TelaInicio;


public class Ratatouille {

    public static void main(String[] args) throws SQLException {
        IReceitaDAO receitaDAO = new ReceitaDAO();
        
        Receita r = new Receita();
        Receita receita = new Receita();
        
        List<Receita> receitas = new ArrayList();
        
        r.setNomeDaReceita("Batata");
        r.setNomeAutor("Carlinhos");
        r.setRendimentoPorcao(3);
        r.setCategoria("Salgado");
        r.setTempo(2.5f);
        r.setPassos("aqui vai a receita");
        r.setIngredientes("aqui vao os ingredientes");
        
        
//        TelaCadastro telacadastro = new TelaCadastro();
//        telacadastro.setVisible(true);
        
        TelaInicio telaInicio = new TelaInicio();
        telaInicio.setVisible(true);
        
//        receitaDAO.Salvar(r);
//        receitaDAO.Editar(r);
//        receita = receitaDAO.Ler(5);
//        System.out.println(receita.getNomeDaReceita());
//
//        receitas = receitaDAO.LerTodasReceitas();
//
//        System.out.println(receitas.get(0).getNomeDaReceita());
//        System.out.println(receitas.get(1).getNomeDaReceita());


    }
    
}
