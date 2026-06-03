public class ContaCorrente extends ContaBancaria implements Tributavel, TransacaoOnline {

    private static final double TAXA_SAQUE = 5.0;

    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor + TAXA_SAQUE > getSaldo()) {
            throw new SaldoInsuficienteException(
                "Saldo insuficiente, saldo atual: R$" + getSaldo() +
                ", valor solicitado (com taxa): R$" + (valor + TAXA_SAQUE)
            );
        }
        debitar(valor + TAXA_SAQUE);
    }

    @Override
    public double calcularImpostos() {
        double imposto = getSaldo() * 0.01;
        System.out.println("Imposto calculado: R$" + imposto);
        return imposto;
    }

    @Override
    public void fazerPix(String chavePix, double valor) {
        System.out.println("Pix de R$" + valor + " enviado para a chave: " + chavePix);
    }
}
