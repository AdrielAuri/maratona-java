package OOP.metodos.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimirDados() {

        System.out.println("Funcionário: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salários: ");
        if(salarios == null){ //em caso da variável salarios não receber nenhum valor!
            return;
        }
        for (double salario : salarios) {
            System.out.println("R$" + salario);
        }
        System.out.println("========================");
        mediaSalarios();
    }

    public void mediaSalarios() {
        if(salarios == null){
            return;
        }
        for (double salario : salarios) {
            media += salario;
        }
        media = media / salarios.length;
        System.out.println("Média salarial do funcionário " + this.nome + ": R$" + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
