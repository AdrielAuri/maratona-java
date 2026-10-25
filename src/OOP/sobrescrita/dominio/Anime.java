package OOP.sobrescrita.dominio;

public class Anime{
    private String nome;

    //Esta anotação serve para ter certeza que está sendo feita a sobrescrita e não a criação de um novo metodo
    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
