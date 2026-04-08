package aula06Heranca;

public class Piano extends Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando piano: dim dim dim");
    }
}
