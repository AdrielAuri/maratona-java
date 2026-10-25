package OOP.modificadoresStatic.dominio;

public class Anime {
    //0 - Bloco de inicialização static da superclass é executado quando a JVM carregar a classe pai
    //1 - Bloco de inicialização static da subclass é executado quando a JVM carregar a classe filha
    //2 - Alocado espaço em memoria pro objeto da superclass
    //3 - Cada atributo da superclass é criado e inicialzado com valores defalut ou o que for passado
    //5 - Bloco de inicialização da superclass é executado na ordem em que aparece
    //5 - Construtor é executado na superclass
    //6 - Alocado espaço em memoria pro objeto da subclass
    //7 - Cada atributo da subclass é criado e inicialzado com valores defalut ou o que for passado
    //8 - Bloco de inicialização da subclass é executado na ordem em que aparece
    //9 - Construtor é executado na subclass

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

