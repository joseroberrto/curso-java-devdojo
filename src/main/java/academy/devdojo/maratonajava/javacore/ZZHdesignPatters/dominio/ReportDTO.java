package academy.devdojo.maratonajava.javacore.ZZHdesignPatters.dominio;

public class ReportDTO {
    private String personName;
    private Currency currency;
    private Country country;

    private String email;

    private ReportDTO(String personName, Currency currency, Country country, String email) {
        this.personName = personName;
        this.currency = currency;
        this.country = country;
        this.email = email;
    }

    public static class ReportBuider{
        private String personName;
        private Currency currency;
        private Country country;

        private String email;

        public ReportDTO buider(){
            return new ReportDTO(personName,currency,country,email);
        }
        public  ReportBuider personName(String personName){
            this.personName = personName;
            return this;
        }

        public  ReportBuider currency (Currency currency){
            this.currency = currency;
            return this;
        }

        public  ReportBuider country(Country country){
            this.country = country;
            return this;
        }

        public  ReportBuider email(String email){
            this.email = email;
            return this;
        }

    }

    @Override
    public String toString() {
        return "ReportDTO{" +
                "personName='" + personName + '\'' +
                ", currency=" + currency +
                ", country=" + country +
                ", email='" + email + '\'' +
                '}';
    }
}
