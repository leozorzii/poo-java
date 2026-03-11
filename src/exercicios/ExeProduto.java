package exercicios;

import java.util.Scanner;

public class ExeProduto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("nome do produto: ");
        produto.nome = leitor.nextLine();
        System.out.println("preço do produto: ");
        produto.preco = leitor.nextDouble();
        leitor.nextLine();
        System.out.println("quantidade em estoque: ");
        produto.quantidade = leitor.nextInt();

        System.out.println("Produto: " + produto.nome + "preço: " + produto.preco + "quantidade em estoque: " + produto.quantidade);
        System.out.println("valor total em estoque: " + produto.preco * produto.quantidade);

        leitor.close();
    }
}
