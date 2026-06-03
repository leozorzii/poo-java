package aula10.exercicio03;

public class BracoRoboticoMontagem extends MaquinaIndustrial {
    private double percentualCalibracao;

    public BracoRoboticoMontagem(String numeroSerie) {
        super(numeroSerie);
        this.percentualCalibracao = 100.0;
    }

    public double getPercentualCalibracao() {
        return percentualCalibracao;
    }

    public void recalibrar() {
        percentualCalibracao = 100.0;
    }

    @Override
    public void produzirLote(int quantidade) throws Exception {
        if (!isLigada()) {
            throw new MaquinaDesligadaException("Maquina desligada.");
        }

        if (percentualCalibracao < 20.0) {
            throw new EquipamentoDescalibradoException("Equipamento descalibrado!");
        }

        percentualCalibracao -= quantidade * 0.5;

        if (percentualCalibracao < 0) {
            percentualCalibracao = 0.0;
        }

        registrarProducao(quantidade, 15.0);
        System.out.println("Braco " + getNumeroSerie() + " montou " + quantidade
                + " pecas. Calibracao atual: " + percentualCalibracao + "%");
    }
}
