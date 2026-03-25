package exercicios;

public class Pessoa {
    public String nome = "Zorzi";
    public int idade = 19;
    public String genero = "Konan";

    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        System.out.println(eu.nome);
        System.out.println(eu.idade);
        System.out.println(eu.genero);
    }
}
