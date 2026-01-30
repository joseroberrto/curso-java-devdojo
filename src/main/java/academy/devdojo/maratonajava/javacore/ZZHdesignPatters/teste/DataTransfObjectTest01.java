package academy.devdojo.maratonajava.javacore.ZZHdesignPatters.teste;

import academy.devdojo.maratonajava.javacore.ZZHdesignPatters.dominio.*;

public class DataTransfObjectTest01 {
    public static void main(String[] args) {
        AirCraft airCraft = new AirCraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = new Person.PersonBuider()
                .firstName("Jose")
                .lastName("Roberto")
                .buider();
        ReportDTO buider = new ReportDTO.ReportBuider()
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .buider();

        System.out.println(buider);


    }
}
