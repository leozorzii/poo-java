package aula10.exercicio01;

public class NaveCombate extends NaveEspacial {
    private int numeroArmas;
    private boolean escudoAtivado;

    public NaveCombate(String identificador, double combustivelMaximo, double velocidadeBase,
            int numeroArmas, boolean escudoAtivado) {
        super(identificador, combustivelMaximo, velocidadeBase);
        this.numeroArmas = numeroArmas;
        this.escudoAtivado = escudoAtivado;
    }

    public int getNumeroArmas() {
        return numeroArmas;
    }

    public void setNumeroArmas(int numeroArmas) {
        this.numeroArmas = numeroArmas;
    }

    public boolean isEscudoAtivado() {
        return escudoAtivado;
    }

    public void setEscudoAtivado(boolean escudoAtivado) {
        this.escudoAtivado = escudoAtivado;
    }

    @Override
    public double calcularConsumo(double distanciaEmAnosLuz) {
        double consumo = distanciaEmAnosLuz * 0.8;

        if (escudoAtivado) {
            consumo *= 1.15;
        }

        return consumo;
    }
}
