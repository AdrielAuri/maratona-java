package OOP.heranca.testes;

import OOP.heranca.dominio.Funcionario;

//0 - Bloco de inicialização é executado quando a JVM carregar a classe
//1 - Alocado espaço em memoria pro objeto
//2 - Cada atributo de classe é criado e inicialzado com valores defalut ou o que for passado
//3 - Bloco de inicialização é executado
//4 - Construtor é executado

public class HerancaInicializacaoTest {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Adriel");
    }
}
