package aula06Heranca;

public class Circulo extends Forma {
    protected double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }
}
