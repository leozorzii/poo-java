package aula06Heranca;

public class Smartphone extends Eletronico {
    @Override
    public void ligar() {
        System.out.println("Smartphone ligado");
    }

    public void conectar4G() {
        System.out.println("Conectado ao 4G");
    }
}
