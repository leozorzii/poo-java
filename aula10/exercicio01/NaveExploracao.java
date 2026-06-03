package aula10.exercicio01;

public class NaveExploracao extends NaveEspacial {
    private boolean possuiSensoresAvancados;

    public NaveExploracao(String identificador, double combustivelMaximo, double velocidadeBase,
            boolean possuiSensoresAvancados) {
        super(identificador, combustivelMaximo, velocidadeBase);
        this.possuiSensoresAvancados = possuiSensoresAvancados;
    }

    public boolean isPossuiSensoresAvancados() {
        return possuiSensoresAvancados;
    }

    public void setPossuiSensoresAvancados(boolean possuiSensoresAvancados) {
        this.possuiSensoresAvancados = possuiSensoresAvancados;
    }

    @Override
    public double calcularConsumo(double distanciaEmAnosLuz) {
        double consumo = distanciaEmAnosLuz * 0.3;

        if (possuiSensoresAvancados) {
            consumo += 50.0;
        }

        return consumo;
    }
}
