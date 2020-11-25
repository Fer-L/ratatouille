package ratatouille.model.entity;

import java.time.Duration;
import java.util.Date;

public class Receita {
    private int cod;
    private String nomeDaReceita;
    private String nomeAutor;
    private int rendimentoPorcao;
    private String categoria;
    private float tempo;
    private String passos;
    private String ingredientes;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNomeDaReceita() {
        return nomeDaReceita;
    }

    public void setNomeDaReceita(String nomeDaReceita) {
        this.nomeDaReceita = nomeDaReceita;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getRendimentoPorcao() {
        return rendimentoPorcao;
    }

    public void setRendimentoPorcao(int rendimentoPorcao) {
        this.rendimentoPorcao = rendimentoPorcao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    public String getPassos() {
        return passos;
    }

    public void setPassos(String passos) {
        this.passos = passos;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
