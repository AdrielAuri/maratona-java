package OOP.modificadoresStatic.dominio;

public class Anime {
    //0 - Bloco de inicialização é executado quando a JVM carregar a classe
    //1 - Alocado espaço em memoria pro objeto
    //2 - Cada atributo de classe é criado e inicialzado com valores defalut ou o que for passado
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado

    private String nome;
    private static int[] episodios;

    static {   //Aqui é um bloco de inicialização e ao usar o static aqui altera para so rode esse bloco uma vez.
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}

