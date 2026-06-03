package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Produto> carrinho = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        String continuar = "s";

        do {
            System.out.println("1 - Produto Fisico");
            System.out.println("2 - Produto Digital");
            int tipoProd = leitor.nextInt();
            leitor.nextLine(); // Limpa o buffer

            System.out.println("Digite o nome do produto: ");
            String nome = leitor.nextLine();

            System.out.println("Digite o preço do produto: ");
            double preco = leitor.nextDouble();
            leitor.nextLine(); // Limpa o buffer

            Produto novoProduto = null;

            try {
                if (tipoProd == 1) {
                    novoProduto = new ProdutoFisico(nome, preco);
                } else if (tipoProd == 2) {
                    novoProduto = new ProdutoDigital(nome, preco);
                }
                
                if (novoProduto != null) {
                    carrinho.add(novoProduto);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                // se der erro na criação, pula para a próxima iteração
                continue; 
            }

            System.out.println("Avaliar Produto? (s/n):");
            String avaliacao = leitor.nextLine();

            if (avaliacao.equalsIgnoreCase("s")) {
                try {
                    System.out.println("Digite a nota do produto (1 a 5): ");
                    int nota = leitor.nextInt();
                    leitor.nextLine(); 
                    if (nota < 1 || nota > 5) {
                        throw new NotaInvalidaException("Nota deve ser entre 1 e 5.");
                    }
                } catch (NotaInvalidaException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
            System.out.print("Adicionar outro produto? (s/n): ");
            continuar = leitor.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        leitor.close();
        System.out.println("Programa encerrado. Itens no carrinho: " + carrinho.size());
    }
}
