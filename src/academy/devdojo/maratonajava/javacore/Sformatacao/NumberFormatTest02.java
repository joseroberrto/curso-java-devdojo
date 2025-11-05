package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        //formatação de valor moeda segundo cada local
        Locale localeBR = Locale.getDefault();
        Locale localeJapan = Locale.JAPAN;
        Locale localeItalia = Locale.ITALY;
        Locale localeEUA =Locale.US;
        NumberFormat[]nfa =new NumberFormat[4];

        nfa[0] =NumberFormat.getCurrencyInstance(localeBR);
        nfa[1] =NumberFormat.getCurrencyInstance(localeItalia);
        nfa[2] =NumberFormat.getCurrencyInstance(localeJapan);
        nfa[3] =NumberFormat.getCurrencyInstance(localeEUA);

        double numero = 10_000.25;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(numero));
            System.out.println(numberFormat.getMaximumFractionDigits());
        }

        String valorString ="￥10,000";//valor precisa esta na mesma formatação da moeda para fazer o parse
        try {
            System.out.println(nfa[2].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
