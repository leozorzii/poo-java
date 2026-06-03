package ex2;

public class CaminhaoPadrao extends Veiculo implements Rastreador {
    public CaminhaoPadrao(String placa, double capacidadeCarga) {
        super(placa, capacidadeCarga);
    }

    @Override
    public void iniciarViagem() {
        System.out.println("Iniciando viagem do Caminhão Padrão.");
    }

    @Override
    public String obterLocalizacao() {
        return "Localização atual do Caminhão Padrão";
    }
}
