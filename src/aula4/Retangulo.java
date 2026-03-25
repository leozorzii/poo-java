package pkg;
//Crie uma classe Retangulo com largura e altura privados.
// Crie um método getArea() que calcula o valor no momento da chamada.

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getArea(double altura, double largura) {
        return this.altura * this.largura;
    }
}
