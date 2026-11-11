package OOP.classesUtilitarias.wrappers.test;

public class test01 {
    static void main(String[] args) {

        // Wrappers são objetos que irão encapsular tipos primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'a';
        boolean booleanP = true;

        //Após alterar o tipo das variáveis, teremos classes agora representando as variáveis

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;         // modelo autoboxing ou boxing (Java converte automaticamente)
        Float floatW = 10F;
        Double doubleW = 100D;
        Character charW = 'a';
        Boolean booleanW = true;

        int i = intW;             // modelo unboxing (Vai do wrappers para primitivo de forma manual)
        Integer intw2 = Integer.parseInt("1");
    }
}
