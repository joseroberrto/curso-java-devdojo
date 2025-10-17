package academy.devdojo.maratonajava.introducao.javacore.Tformatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[]df =new DateFormat[7];

        //varios formatos
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.FULL);
        df[6] = DateFormat.getDateInstance(DateFormat.LONG);


    }
}
