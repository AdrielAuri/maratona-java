package OOP.metodos.dominio;

public class Calculadora {

    //métodos sem retorno, por isso levam o tipo void (vazio)
    public void somaDoisNumeros(){
        System.out.println(10 + 14);
    }
    public void subtraiDoisNumeros(){
        System.out.println(20-8);
    }

    //métodos com parâmetros usam variáveis locais dentro da função.
    public void muliplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    //A principal diferença entre uma variável primitiva e reference, é que a primitiva cria uma cópia da variavel
    //Enquanto a reference substitui instantaneamente o valor antigo pelo novo valor.

    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }
    public void somaArray(int[] numeros){
        int soma =0;
        for (int num : numeros) {
            soma+= num;
        }
        System.out.println(soma);
    }

    //VarArgs tem a mesma funcionalidade de um array, a diferença é que
    // não preciso iniciar uma variavel para depois atribuir ao objeto
    public void somaVarArgs(int... numeros){
        int soma =0;
        for (int num : numeros) {
            soma+= num;
        }
        System.out.println(soma);
    }

}
