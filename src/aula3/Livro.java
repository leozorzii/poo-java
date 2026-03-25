package exercicios;

public class Livro {
    public String titulo = "Biblia Sagrado";
    public String autor = "Deus";
    public int anoDePublicacao = 1;

    public static void main(String[] args) {
        Livro livro = new Livro();
        System.out.println("Dados do livro: ");
        System.out.println(livro.titulo);
        System.out.println(livro.autor);
        System.out.println(livro.anoDePublicacao);
    }
}
