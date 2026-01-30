package academy.devdojo.maratonajava.javacore.Zcolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone obj1 = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(obj1.serialNumber) ;



    }

    //se x.equals(y)== true ,entao x.hashCode == y.hashCode
    //se y.hashCode == x.hashCode, não necessariamente x.equals(y) será true
    // se y.hashCode != x.hashCode , logo x.equals(y) será false
    @Override
    public int hashCode() {
        return serialNumber == null? 0: this.serialNumber.hashCode();
    }

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
