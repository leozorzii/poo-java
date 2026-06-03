package aula10.exercicio02;

public abstract class FuncionarioHospital {
    private String nome;
    private String matricula;
    private double salarioBase;
    private int horasTrabalhadasMensais;

    public FuncionarioHospital(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        setSalarioBase(salarioBase);
        this.horasTrabalhadasMensais = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 1412.0) {
            throw new ValorInvalidoException(
                    "Sal\u00e1rio base n\u00e3o pode ser inferior ao m\u00ednimo legal.");
        }
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabalhadasMensais() {
        return horasTrabalhadasMensais;
    }

    public void setHorasTrabalhadasMensais(int horasTrabalhadasMensais) {
        if (horasTrabalhadasMensais < 0 || horasTrabalhadasMensais > 300) {
            throw new ValorInvalidoException(
                    "Carga hor\u00e1ria inv\u00e1lida. O limite humano \u00e9 300 horas.");
        }
        this.horasTrabalhadasMensais = horasTrabalhadasMensais;
    }

    public abstract double calcularSalarioFinal();

    public void exibirResumoMensal() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Horas trabalhadas: " + horasTrabalhadasMensais);
        System.out.println(String.format("Salario final: R$ %.2f", calcularSalarioFinal()));
        System.out.println("-------------------------------------");
    }
}
