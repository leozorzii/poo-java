package aula06Heranca;

public class Aluno extends Pessoa {
    protected int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Matricula: " + matricula;
    }
}
