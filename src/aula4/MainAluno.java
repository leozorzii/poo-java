package pkg;

public class MainAluno {
    public static void main(String[] args) {
        //setando os atributos da classe aluno
        Aluno aluno = new Aluno("Leonardo Zorzi", 6.5, 9.5);
        //mostrando os dados usando get
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Media das notas de: " + aluno.getNota1() + "  "+ aluno.getNota2());
        //chamada da funcao
      aluno.calcularMedia();
    }
}
