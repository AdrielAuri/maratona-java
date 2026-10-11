package arrays;

public class ArrayMultidimensional2 {
    static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        int[] array = {1, 2, 3};

        //É possível alocar qualquer quantidade de elementos para a matriz, por exemplo:
        arrayInt[0] = new int[2];
        arrayInt[1] = array; //Outra forma de alocar
        arrayInt[2] = new int[6];

        //Outra forma de alocar
        int[][] arrayInt2 = {{0, 1}, {5, 6, 7}, {12, 16, 6, 4, 8, 10}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int resul : arrayBase) {
                System.out.print(resul + " ");
            }
        }
    }
}
