package pkg;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    //construtor de aluno
    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    //metodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota3(double nota2) {
        this.nota2 = nota2;
    }
    //metodo de calcular media
    public void calcularMedia() {
        System.out.println((nota1 + nota2) / 2);
    }
}