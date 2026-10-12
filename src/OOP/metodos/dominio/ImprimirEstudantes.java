package OOP.metodos.dominio;

public class ImprimirEstudantes {

    //Também é possível usar como parametro uma outra classe
    public void mostrarEstudantes(Estudante estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        //Aqui você referenciou a classe e não o objeto, por isso, serve para
        //qualquer objeto que use a classe Estudante.
    }
}
