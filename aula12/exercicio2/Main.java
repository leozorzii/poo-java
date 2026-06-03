public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("Leonardo");

        conta.depositar(500.0);
        System.out.println("Saldo após depósito: R$" + conta.getSaldo());

        try {
            conta.sacar(600.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro no saque: " + e.getMessage());
        }

        try {
            conta.depositar(-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no depósito: " + e.getMessage());
        }

        conta.fazerPix("leozorzi@banco.com", 50.0);
        conta.calcularImpostos();
    }
}
