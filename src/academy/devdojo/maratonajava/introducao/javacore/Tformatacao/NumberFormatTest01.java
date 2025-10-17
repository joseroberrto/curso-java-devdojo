package academy.devdojo.maratonajava.introducao.javacore.Tformatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        //formatação de numeros segundo local
        Locale localeBR = Locale.getDefault();
        Locale localeJapan = Locale.JAPAN;
        Locale localeItalia = Locale.ITALY;
        Locale localeEUA =Locale.US;
        NumberFormat[]nfa =new NumberFormat[4];

        nfa[0] =NumberFormat.getInstance(localeBR);
        nfa[1] =NumberFormat.getInstance(localeItalia);
        nfa[2] =NumberFormat.getInstance(localeJapan);
        nfa[3] =NumberFormat.getInstance(localeEUA);

        double numero = 10_000.25;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(numero));
            System.out.println(numberFormat.getMaximumFractionDigits());
        }

        String valorString ="1000.23";
        try {
            System.out.println(nfa[3].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
