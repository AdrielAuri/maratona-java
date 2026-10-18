package OOP.construtores.dominio;

public class Filme {
    private String nome;
    private String genero;
    private int indicacao;
    private String estudio;

    //Um construtor ele inicia antes de qualquer metodo que esteja na classe, por isso ele substitui o init
    public Filme(String nome, String genero, int indicacao) {
        this();//Esse this serve para referenciar a sobrecarga desse construtor
        this.nome = nome;
        this.genero = genero;
        this.indicacao = indicacao;
    }
    public Filme(String nome, String genero, int indicacao, String estudio) {
        this(nome, genero, indicacao); //quando chamar outro construtor, ele precisa estar na primeira linha,
        this.estudio = estudio;
    }

    //Também é possivel fazer sobrecarga/overload de construtores
    public Filme() {
        System.out.println("Dentro do construtor vazio");

    }

    public void imprime() {
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Gênero do filme: " + this.genero);
        System.out.println("Indicação do filme: " + this.indicacao);
        System.out.println("Estudio do filme: " + this.estudio);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIndicacao(int indicacao) {
        this.indicacao = indicacao;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getIndicacao() {
        return indicacao;
    }
}
