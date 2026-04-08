package aula06Heranca;

public class Violao extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando violao: plin plin");
    }
}
