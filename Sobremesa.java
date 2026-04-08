package aula06Heranca;

public class Sobremesa extends ItemMenu {
    protected boolean contemAcucar;

    public Sobremesa(String nome, double preco, boolean contemAcucar) {
        super(nome, preco);
        this.contemAcucar = contemAcucar;
    }
}
