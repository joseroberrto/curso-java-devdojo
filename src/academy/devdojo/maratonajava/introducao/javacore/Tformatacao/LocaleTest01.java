package academy.devdojo.maratonajava.introducao.javacore.Tformatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it","IT");
        Locale localeSuica = new Locale("it","CH");
        Locale localeJapan = new Locale("ja","JP");


        //formatção para datas
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeJapan);

        System.out.println("Italia: "+df1.format(calendar.getTime()));
        System.out.println("Suica: "+df2.format(calendar.getTime()));
        System.out.println("Japão: "+df3.format(calendar.getTime()));


        //exibindo nome do pais segundo o local
        System.out.println(localeItaly.getDisplayCountry(localeSuica));
    }
}
