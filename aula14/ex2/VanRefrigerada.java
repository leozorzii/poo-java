package ex2;

public class VanRefrigerada extends Veiculo implements Refrigerado, Rastreador{
    public VanRefrigerada(String placa, int capacidadeCarga) {
        super(placa, capacidadeCarga);
    }

    @Override
    public void iniciarViagem() {
        System.out.println("Iniciando viagem da Van Refrigerada.");
    }

    @Override
    public String obterLocalizacao() {
        return "Localização atual da Van Refrigerada";
    }

    @Override
    public void ajustarTemperatura(double graus) throws TemperaturaCriticaException {
        if(graus > 10.0 || graus < -20.0){
            throw new TemperaturaCriticaException("Temperatura Critica, a carga pode ser danificada");
        }
        System.out.println("Temperatura ajustada para: " + graus + " °C");     
    }
}
