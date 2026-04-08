package aula06Heranca;

public class Gerente extends Funcionario{
    protected double salarioBase = 3600;

    @Override
    public double calcularSalario() {
        return salario;
    }
}
