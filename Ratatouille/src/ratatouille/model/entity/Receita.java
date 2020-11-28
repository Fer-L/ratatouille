package ratatouille.model.entity;

public class Receita {
    private int cod;
    private String nomeDaReceita;
    private String nomeAutor;
    private int rendimentoPorcao;
    private String categoria;
    private float tempo;
    private String passos;
    private String ingredientes;

    public Receita(String nomeDaReceita, String nomeAutor, int rendimentoPorcao, 
            String categoria, float tempo, String passos, String ingredientes){
        
      
        this.nomeDaReceita = nomeDaReceita;
        this.nomeAutor = nomeAutor;
        this.rendimentoPorcao = rendimentoPorcao;
        this.categoria = categoria;
        this.tempo = tempo;
        this.passos = passos;
        this.ingredientes = ingredientes;
    }

    public Receita() {
    } 
    
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
    
    public Object[] obterDados(){
        return new Object[]{nomeDaReceita, nomeAutor, 
            Integer.toString(rendimentoPorcao),categoria, Float.toString(tempo),
            ingredientes, passos, Integer.toString(cod)};
            
        
    } 
}
