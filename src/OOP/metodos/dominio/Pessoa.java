package OOP.metodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    //O this serve para referenciar a variavel principal da classe, para que outra variável não sobrescreva ela.
    public void setNome(String nome){
        this.nome = nome;
    }
    //set para setar um valor
    public void setIdade(int idade){
        if(idade < 0){
            return;
        }
        this.idade = idade;
    }
    //get para pegar um valor que ja foi setado
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
}
