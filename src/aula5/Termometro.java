package pkg;
//Crie uma classe Termometro que armazena a temperatura em celsius .
// Crie um getFahrenheit() que faz a conversão e um setFahrenheit(double f) que converte para Celsius antes de armazenar.
public class Termometro {
    private double temperatura;//em graus C;

    public Termometro(){
        this.temperatura = 0.0;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getFahrenheit(){
        return (this.temperatura * 1.8) + 32;
    }
    public void setFahrenheit(double f){
        this.temperatura = (f -32) / 1.8;
    }

}
