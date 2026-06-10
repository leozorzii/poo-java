package src.models;

import java.util.ArrayList;

import src.interfaces.GeradorDeRelatorio;

public class Personal extends Pessoa implements GeradorDeRelatorio {
 private String especialidade;
 private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
 
 public String getEspecialidade() {
    return especialidade;
}

 public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
 }

 public ArrayList<Aluno> getAlunos() {
    return alunos;
 }

 public void setAlunos(ArrayList<Aluno> alunos) {
    this.alunos = alunos;
 }

 public Personal(String cpf, String nome, int idade, String especialidade) {
    super(cpf, nome, idade);
    this.especialidade = especialidade;
    this.alunos = new ArrayList<Aluno>();
 }
@Override
public void exibirDados() {
    System.out.println("Nome: " + this.getNome());
    System.out.println("CPF: " + this.getCpf());
}
@Override
public void gerarRelatorio(){
    System.out.println("Nome: " + this.getNome());
    System.out.println("Especialidade: " + this.getEspecialidade());
    System.out.println("Alunos: ");
    for(Aluno aluno : alunos){
        System.out.println(aluno.getNome());
    }
}
public void adicionarAluno(Aluno aluno){
    this.alunos.add(aluno);
    }
}
