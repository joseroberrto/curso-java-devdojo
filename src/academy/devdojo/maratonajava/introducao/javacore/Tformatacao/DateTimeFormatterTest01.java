package academy.devdojo.maratonajava.introducao.javacore.Tformatacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1= date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3= date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20251017", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);


        LocalDateTime now = LocalDateTime.now();
        String format1 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(format1);



        //mudando formato de data
        DateTimeFormatter dateTimeFormatterBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatterJapao= DateTimeFormatter.ofPattern("yyyy/MM/dd");

        String formatBrasil = LocalDate.now().format(dateTimeFormatterBrasil);
        String formatJapao = LocalDate.now().format(dateTimeFormatterJapao);

        System.out.println("Brasil: "+formatBrasil);
        System.out.println("Japaoi: "+formatJapao);

        //formantando segundo o Locale
        DateTimeFormatter dateTimeFormatterJP=DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.JAPAN);
        String formatJP = LocalDate.now().format(dateTimeFormatterJP);
        System.out.println(formatJP);
    }
}
