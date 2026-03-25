package pkg;

public class Disciplina {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Laboratorio lab = new Laboratorio();
        professor.nome = "Ricardo Froilich";
        lab.local = "Sala 108";

        System.out.println("Nome do professor é " + professor.nome);
        System.out.println("O local da sala é " + lab.local);
    }
}
