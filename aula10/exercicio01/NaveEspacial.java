package aula10.exercicio01;

public abstract class NaveEspacial {
    private String identificador;
    private double combustivelMaximo;
    private double combustivelAtual;
    private double velocidadeBase;

    public NaveEspacial(String identificador, double combustivelMaximo, double velocidadeBase) {
        this.identificador = identificador;
        this.combustivelMaximo = combustivelMaximo;
        this.combustivelAtual = combustivelMaximo;
        this.velocidadeBase = velocidadeBase;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getCombustivelMaximo() {
        return combustivelMaximo;
    }

    public void setCombustivelMaximo(double combustivelMaximo) {
        if (combustivelMaximo < 0 || combustivelAtual > combustivelMaximo) {
            throw new CombustivelInvalidoException("Valor de combust\u00edvel inv\u00e1lido!");
        }
        this.combustivelMaximo = combustivelMaximo;
    }

    public double getCombustivelAtual() {
        return combustivelAtual;
    }

    public void setCombustivelAtual(double combustivelAtual) {
        if (combustivelAtual < 0 || combustivelAtual > combustivelMaximo) {
            throw new CombustivelInvalidoException("Valor de combust\u00edvel inv\u00e1lido!");
        }
        this.combustivelAtual = combustivelAtual;
    }

    public double getVelocidadeBase() {
        return velocidadeBase;
    }

    public void setVelocidadeBase(double velocidadeBase) {
        this.velocidadeBase = velocidadeBase;
    }

    public abstract double calcularConsumo(double distanciaEmAnosLuz);

    public void viajar(double distancia) throws CombustivelInsuficienteException {
        double consumo = calcularConsumo(distancia);

        if (combustivelAtual < consumo) {
            throw new CombustivelInsuficienteException("Combustivel insuficiente para realizar a viagem!");
        }

        setCombustivelAtual(combustivelAtual - consumo);
        System.out.println(String.format(
                "A nave %s viajou %.2f anos-luz. Combustivel restante: %.2f",
                identificador,
                distancia,
                combustivelAtual));
    }
}
