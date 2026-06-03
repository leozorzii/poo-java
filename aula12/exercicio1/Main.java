package aula12.exercicio1;

public class Main {
    public static void main(String[] args) {
        SmartWatch smartWatch = new SmartWatch("Amazfit");
        smartWatch.ligar();
        smartWatch.conectarBluetooth();
        smartWatch.medirBatimentos();
        smartWatch.exibirMarca();
    }
}
