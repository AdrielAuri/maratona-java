package OOP.metodos.dominio;

public class Estudante {

        public String nome;
        public int idade;
        public char sexo;

        //Quando um metodo precisa referenciar algo que está dentro da classe, usa-se this
        public void imprime(){
                System.out.println("==============");
                System.out.println(this.nome);
                System.out.println(this.idade);
                System.out.println(this.sexo);
        }

}
