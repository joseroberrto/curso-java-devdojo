package academy.devdojo.maratonajava.introducao.javacore.Kenumeraação.dominio;

public enum DiaDaSemana {
    SEGUNDA(1 , "Segunda feira"),TERÇA(2 ,"Terça-Feira"),
    QUARTA(3 ,"Quarta-Feira"),QUINTA(4,"Quinta-Feira"),
    SEXTA(5,"Sexta-Feira"),SABADO(6,"Sexta-Feira"),
    DOMINGO(7,"Domingo");

    private int diaDaSemanaOrdinal;
    private String nomeDia;

    DiaDaSemana(int numeroDoDia , String nomeDia){
        this.diaDaSemanaOrdinal = numeroDoDia;
        this.nomeDia = nomeDia;
    }

    public int getDiaDaSemanaOrdinal() {
        return diaDaSemanaOrdinal;
    }

    public String getNomeDia() {
        return nomeDia;
    }

    public DiaDaSemana diaDaSemana (int numero){
         for (DiaDaSemana dia : DiaDaSemana.values()){
             if(dia.getDiaDaSemanaOrdinal() == diaDaSemanaOrdinal){
                 return dia;
             }
         }return null;
    }


}
