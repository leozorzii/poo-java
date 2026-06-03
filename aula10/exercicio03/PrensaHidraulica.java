package aula10.exercicio03;

public class PrensaHidraulica extends MaquinaIndustrial {
    private double temperaturaAtual;

    public PrensaHidraulica(String numeroSerie) {
        super(numeroSerie);
        this.temperaturaAtual = 25.0;
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void acionarRefrigeracao() {
        temperaturaAtual = 25.0;
    }

    @Override
    public void produzirLote(int quantidade) throws Exception {
        if (!isLigada()) {
            throw new MaquinaDesligadaException("Maquina desligada.");
        }

        if (temperaturaAtual >= 90.0) {
            throw new SuperaquecimentoException("Superaquecimento detectado!");
        }

        temperaturaAtual += quantidade * 1.5;
        double energia = quantidade * 2.0;

        registrarProducao(quantidade, energia);
        System.out.println("Prensa " + getNumeroSerie() + " prensou " + quantidade
                + " pecas. Temperatura atual: " + temperaturaAtual + " graus.");
    }
}
