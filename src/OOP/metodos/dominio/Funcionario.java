package OOP.metodos.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimirDados() {

        System.out.println("Funcionário: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salários: ");
        if(salarios == null){ //em caso da variável salarios não receber nenhum valor!
            return;
        }
        for (double salario : salarios) {
            System.out.println("R$" + salario);
        }
        System.out.println("========================");
    }

    public void mediaSalarios() {
        if(salarios == null){
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media = media / salarios.length;
        System.out.println("Média salarial do funcionário " + this.nome + ": R$" + media);
    }


}
