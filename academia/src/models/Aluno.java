package src.models;

import src.interfaces.GeradorDeRelatorio;

public class Aluno extends Pessoa implements GeradorDeRelatorio{
    private String matricula;
    private String plano;
    private boolean statusPlano;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getPlano() {
        return plano;
    }
    public void setPlano(String plano) {
        this.plano = plano;
    }
    public boolean isStatusPlano() {
        return statusPlano;
    }
    public void setStatusPlano(boolean statusPlano) {
        this.statusPlano = statusPlano;
    }
    public Aluno(String cpf, String nome, int idade, String matricula){
        super(cpf, nome, idade);
        this.matricula = matricula;
        this.plano = "";
        this.statusPlano = false;
    }
    //caso de aluno que esta fazendo diaria
    public Aluno(String nome, String matricula){
        super("N/A", nome, 0);
        this.matricula = matricula;
        this.plano = "diaria";
        this.statusPlano = false;
    }
    @Override
    public void gerarRelatorio(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Status do plano: " + this.isStatusPlano());
    }
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Matricula: " + this.getMatricula());
    }
}
