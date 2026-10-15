package OOP.sobrecargaMetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void imprimir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Episódios: " + getEpisodios());
        System.out.println("Genero: " + getGenero());
    }

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;

    }
    //Aqui é uma sobrecarga de métodos.
    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    public int getEpisodios(){
        return this.episodios;
    }

}
