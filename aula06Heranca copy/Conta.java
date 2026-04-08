package aula06Heranca;

public class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void render() {
        System.out.println("Saldo: " + saldo);
    }
}
