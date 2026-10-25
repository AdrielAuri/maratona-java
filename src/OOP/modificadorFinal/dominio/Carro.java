package OOP.modificadorFinal.dominio;

public class Carro {
    private String nome;

    //O modificador final indica uma constante e não pode ter seu valor alterado após ser iniciado
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
