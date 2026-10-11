package arrays;

public class ArrayUnidimensional {
    static void main(String[] args) {

        //Um array precisa ser inicializado com a quantidade de elementos ou
        //Ser inicializado já com os valores pré definidos

        int[] numeros1 = new int[3];
        int[] numeros2 = new int[]{1,2,3,4,5,6};

        //Também há duas formas de visualização desses elementos como podemos ver a baixo

        //For tradicional
        for(int i=0; i <numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
        //For-each
        for (int c: numeros2){
            System.out.println(c);
        }

    }
}
