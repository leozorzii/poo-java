package src.models;

import java.util.ArrayList;

public class FichaDeTreino {
private Aluno aluno;
private Personal personal;
private ArrayList<String> exercicios = new ArrayList<String>();
private String dataCriacao;
private String objetivo;

public FichaDeTreino(Aluno aluno, Personal personal, String dataCriacao, String objetivo) {
    this.aluno = aluno;
    this.personal = personal;
    this.exercicios = new ArrayList<String>();
    this.dataCriacao = dataCriacao;
    this.objetivo = objetivo;
}
public Aluno getAluno() {
    return aluno;
}
public void setAluno(Aluno aluno) {
    this.aluno = aluno;
}
public Personal getPersonal() {
    return personal;
}
public void setPersonal(Personal personal) {
    this.personal = personal;
}
public ArrayList<String> getExercicios() {
    return exercicios;
}
public void setExercicios(ArrayList<String> exercicios) {
    this.exercicios = exercicios;
}
public String getDataCriacao() {
    return dataCriacao;
}
public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
}
public String getObjetivo() {
    return objetivo;
}
public void setObjetivo(String objetivo) {
    this.objetivo = objetivo;
}
public void adicionarExercicio(String exercicio){
    this.exercicios.add(exercicio);
}
public void exibirFicha(){
    System.out.println("Aluno: " + this.aluno.getNome());
    System.out.println("Personal: " + this.personal.getNome());
    System.out.println("Data de criação: " + this.dataCriacao);
    System.out.println("Objetivo: " + this.objetivo);
    System.out.println("Exercicios: ");
    for(String exercicio : exercicios){
        System.out.println(exercicio);
        }
        System.out.println("--------------------");
    }
}
