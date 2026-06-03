package aula10.exercicio01;

public class NaveCargueiro extends NaveEspacial {
    private double pesoCargaAtual;
    private double capacidadeMaximaCarga;

    public NaveCargueiro(String identificador, double combustivelMaximo, double velocidadeBase,
            double pesoCargaAtual, double capacidadeMaximaCarga) {
        super(identificador, combustivelMaximo, velocidadeBase);
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
        setPesoCargaAtual(pesoCargaAtual);
    }

    public double getPesoCargaAtual() {
        return pesoCargaAtual;
    }

    public void setPesoCargaAtual(double pesoCargaAtual) {
        if (pesoCargaAtual < 0 || pesoCargaAtual > capacidadeMaximaCarga) {
            throw new IllegalArgumentException("Peso de carga invalido");
        }
        this.pesoCargaAtual = pesoCargaAtual;
    }

    public double getCapacidadeMaximaCarga() {
        return capacidadeMaximaCarga;
    }

    public void setCapacidadeMaximaCarga(double capacidadeMaximaCarga) {
        if (capacidadeMaximaCarga < 0 || capacidadeMaximaCarga < pesoCargaAtual) {
            throw new IllegalArgumentException("Capacidade maxima de carga invalida");
        }
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
    }

    @Override
    public double calcularConsumo(double distanciaEmAnosLuz) {
        return (distanciaEmAnosLuz * 0.5) + (pesoCargaAtual * 0.2);
    }
}
