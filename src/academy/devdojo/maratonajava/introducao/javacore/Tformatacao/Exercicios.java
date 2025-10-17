package academy.devdojo.maratonajava.introducao.javacore.Tformatacao;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class Exercicios {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        Date dataAtual = calendario.getTime();
        String[]diasSemana = {"Domingo","Segunda" ,"Terça","Quarta","Quinta","Sexta","Sabado"};
        int diaDaSemana = calendario.get(Calendar.DAY_OF_WEEK);
        System.out.println("Data atual: "+dataAtual);
        System.out.println("Dia da semana: "+diasSemana[diaDaSemana -1]);
        System.out.println("Mes: "+(calendario.get(Calendar.MONTH)+1));
        System.out.println("Ano: "+(calendario.get(Calendar.YEAR)));

        System.out.println("---------------------------------------------");
        //mostrando data segundo local
        Locale localeBR = new Locale("pt","BR");
        Locale localeUSA = new Locale("en","US");

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,localeBR);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeUSA);

        System.out.println("Brasil: "+df.format(dataAtual));
        System.out.println("EUA: "+df2.format(dataAtual));
        System.out.println("---------------------------------------------");

        //formatando numeros,moedas,porcentagem segundo pais
        double valor = 1050.45;

        NumberFormat numberFormatMoedaChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat numberFormatNumeroChina = NumberFormat.getNumberInstance(Locale.CHINA);
        NumberFormat numberFormatPorcentagemChina = NumberFormat.getPercentInstance(Locale.CHINA);
        NumberFormat numberFormaMoedaFrance = NumberFormat.getCurrencyInstance(Locale.FRENCH);
        NumberFormat numberFormatMoedaFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat numberFormatNumeroFrance = NumberFormat.getNumberInstance(Locale.FRANCE);

        System.out.println("Valor: "+valor);
        System.out.println("Valor(moeda) França: "+numberFormaMoedaFrance.format(valor));
        System.out.println("Valor(numero) França: "+numberFormatNumeroFrance.format(valor));
        System.out.println("Valor(porcentagem) França: "+numberFormatNumeroFrance.format(valor));
        System.out.println();
        System.out.println("Valor(moeda) China: "+numberFormatMoedaChina.format(valor));
        System.out.println("Valor(numero) China: "+numberFormatNumeroChina.format(valor));
        System.out.println("Valor(porcentagem) China: "+numberFormatNumeroChina.format(valor));
        System.out.println("---------------------------------------------");

        //mostrando dia da semana segundo Locale
        Date date = new Date();
        SimpleDateFormat simpleDateFormatJapan = new SimpleDateFormat("EEEE",Locale.JAPAN);
        SimpleDateFormat simpleDateFormatBrasil = new SimpleDateFormat("EEEE",new Locale("pt","BR"));
        SimpleDateFormat simpleDateFormatFranca = new SimpleDateFormat("EEEE",Locale.FRANCE);

        System.out.println("Japao: "+simpleDateFormatJapan.format(date));
        System.out.println("Brasil: "+simpleDateFormatBrasil.format(date));
        System.out.println("FRança: "+simpleDateFormatFranca.format(date));







    }
}
