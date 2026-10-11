package arrays;

public class ArrayMultidimensional1 {

    static void main(String[] args) {

        //Imagina que existe um prédio com 10 andares e vários quartos
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 19;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 19;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 19;

        //É necessário de dois For para percorrer todos os elementos dessa matriz
        for( int i = 0; i<dias.length; i++){
            for( int j = 0; j<dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        //É possivel visualizar os elementos da seguinte maneira usando For-each
        for(int[] arrBase : dias){
            for (int resul : arrBase){
                System.out.println(resul);
            }
        }

    }

}
