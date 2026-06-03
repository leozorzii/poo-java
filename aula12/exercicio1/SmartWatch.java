package aula12.exercicio1;

public class SmartWatch extends Dispositivo implements Monitoramento, Conectividade{

    public SmartWatch(String marca) {
    super(marca);
}
@Override
public void ligar() {
    System.out.println("Ligando SmartWatch");
}
@Override
public void conectarBluetooth() {
    System.out.println("conectando bluetooth");
    }
    @Override
    public void medirBatimentos() {
        System.out.println("Medindo batimentos cardiacos");
    }
}
