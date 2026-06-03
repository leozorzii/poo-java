package aula10.exercicio02;

public class Medico extends FuncionarioHospital {
    private String especialidade;
    private double valorPorPlantao;
    private int quantidadePlantoes;

    public Medico(String nome, String matricula, double salarioBase, String especialidade,
            double valorPorPlantao, int quantidadePlantoes) {
        super(nome, matricula, salarioBase);
        this.especialidade = especialidade;
        this.valorPorPlantao = valorPorPlantao;
        setQuantidadePlantoes(quantidadePlantoes);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getValorPorPlantao() {
        return valorPorPlantao;
    }

    public void setValorPorPlantao(double valorPorPlantao) {
        this.valorPorPlantao = valorPorPlantao;
    }

    public int getQuantidadePlantoes() {
        return quantidadePlantoes;
    }

    public void setQuantidadePlantoes(int quantidadePlantoes) {
        if (quantidadePlantoes < 0) {
            throw new ValorInvalidoException("Quantidade de plantoes invalida.");
        }
        this.quantidadePlantoes = quantidadePlantoes;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + (valorPorPlantao * quantidadePlantoes);
    }
}
