package OOP.exception.runTime.testes;

public class RunTimeExceptionTest03 {
    static void main(String[] args) {
        abreConexao();
    }

    // É possível usar o try só com o finally ou catch, mas nunca sozinho.

    private static String abreConexao() {
        try {
            System.out.println("\nAbrindo código");
            System.out.println("Escrevendo dados do arquivo");
            return "Conexão aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally { // Esse bloco sempre irá rodar antes do catch
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}
