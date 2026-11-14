package OOP.classesUtilitarias.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    static void main(String[] args) {
        String pattern = " 'Brasil' dd 'de' MMMM 'de' yyyy"; // um dos modelos para formatar a exibição da data e hora
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
    }
}
