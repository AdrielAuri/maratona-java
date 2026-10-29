package OOP.classeAbstratas.dominio;

// uma class abstrata é um template e logo não pode ser instanciada, Apenas é possivel instanciar a classe que extende. ex: Funcionario > Gerente
// ela é um tipo de classe que foi criada para ser extendida e ser uma super classe
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    // também é possível criar um metodo abstrato, tornando ele um template, da mesma forma que uma classe
    // servindo apenas como base para outras classes instancia-lo.
    // Se você extende uma classe abstrata e nela existe um metodo abstrato, é obrigatorio implementar esse metodo.
    public abstract void calcularBonus();
}

//classe abstrata extendendo de outra classe abstrata > não precisa implementar os métodos