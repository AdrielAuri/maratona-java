package OOP.classesUtilitarias.strings.string;

public class StringPerformanceTest01 {
    static void main(String[] args) {

        long inicio = System.currentTimeMillis(); // metodo para saber milisegundos
        concatStrings(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo para String: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo para StringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo para StringBuffer: " + (fim - inicio) + "ms");

    }

    private static void concatStrings(int tamanho) {
        String nome = "";
        for (int i = 0; i < tamanho; i++) {
            nome += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }


}
