package aula10.exercicio02;

public class Enfermeiro extends FuncionarioHospital {
    private String setor;
    private double percentualInsalubridade;

    public Enfermeiro(String nome, String matricula, double salarioBase, String setor,
            double percentualInsalubridade) {
        super(nome, matricula, salarioBase);
        this.setor = setor;
        setPercentualInsalubridade(percentualInsalubridade);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getPercentualInsalubridade() {
        return percentualInsalubridade;
    }

    public void setPercentualInsalubridade(double percentualInsalubridade) {
        if (percentualInsalubridade != 0.10 &&
                percentualInsalubridade != 0.20 &&
                percentualInsalubridade != 0.40) {
            throw new ValorInvalidoException(
                    "Percentual de insalubridade n\u00e3o reconhecido pelo sindicato.");
        }
        this.percentualInsalubridade = percentualInsalubridade;
    }

    @Override
    public double calcularSalarioFinal() {
        double bonusInsalubridade = getSalarioBase() * percentualInsalubridade;
        int horasExtras = 0;

        if (getHorasTrabalhadasMensais() > 160) {
            horasExtras = getHorasTrabalhadasMensais() - 160;
        }

        return getSalarioBase() + bonusInsalubridade + (horasExtras * 50.0);
    }
}
