package ratatouille.model.dao;

import ratatouille.model.entity.Receita;

public interface IReceitaDAO {
    public boolean Salvar(Receita receita);
    public boolean Apagar(int cod);
    public Receita Ler(int cod);
    public boolean Editar(Receita receita);
}
