package OOP.exception.runTime.testes;

public class RunTimeExceptionTest04 {
    static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro no ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro no IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Erro no ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Erro no RuntimeException");
        }

        // Uma exceção mais generica precisa vir sempre por ultimo para não anular as outras exceções.
    }
}
