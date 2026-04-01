package pkg;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite titulo, diretor, ano de lançamento e genero do filme: ");
        System.out.println("qual nome: ");
        filme.titulo = leitor.nextLine();

        System.out.println("titulo: " + filme.titulo);
        System.out.println("qual diretor: ");
        filme.diretor = leitor.nextLine();
        System.out.println("diretor: " + filme.diretor);

        System.out.println("qual ano: ");
        filme.anoDeLancamento = leitor.nextInt();
        leitor.nextLine();
        System.out.println("ano de lançameneto: " + filme.anoDeLancamento);

        System.out.println("qual genero: ");
        filme.genero = leitor.nextLine();
        System.out.println("genero: " + filme.genero);

        Filme filme2 = new Filme();
        System.out.println("Digite titulo, diretor, ano de lançamento e genero do filme: ");
        System.out.println("qual nome: ");
        filme2.titulo = leitor.nextLine();

        System.out.println("qual diretor: ");
        filme2.diretor = leitor.nextLine();

        System.out.println("qual ano: ");
        filme2.anoDeLancamento = leitor.nextInt();

        System.out.println("qual genero: ");
        leitor.nextLine();

        filme2.genero = leitor.nextLine();

        System.out.println("titulo: " + filme2.titulo);
        System.out.println("diretor: " + filme2.diretor);
        System.out.println("ano: " + filme2.anoDeLancamento);
        System.out.println("genero: " + filme2.genero);
        leitor.close();
    }
}
