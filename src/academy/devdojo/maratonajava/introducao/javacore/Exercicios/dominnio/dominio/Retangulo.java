package academy.devdojo.maratonajava.introducao.javacore.Exercicios.dominnio.dominio;

public class Retangulo implements FormaGeometrica{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return (this.altura + this.base) *2;
    }
}
