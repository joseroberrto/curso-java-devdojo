package academy.devdojo.maratonajava.introducao.javacore.Tformatacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        Date date = new Date();


        //formato personalizado
        String  pattern = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        System.out.println(simpleDateFormat.format(date));




    }
}
