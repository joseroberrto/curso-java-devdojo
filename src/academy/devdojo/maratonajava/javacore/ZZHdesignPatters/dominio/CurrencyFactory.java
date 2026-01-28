package academy.devdojo.maratonajava.javacore.ZZHdesignPatters.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country){
        switch (country){
            case BRAZIL: return new Real();
            case USA:return new Dolar();
            default: throw new  IllegalArgumentException("moeda nao existe");
        }

    }


}
