package aula07Execoes;
import java.util.Scanner;

public class Raiz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        try {
            System.out.println("Digite um numero inteiro: ");
                numero = leitor.nextInt();
            double raiz = Math.sqrt(numero);
            System.out.println("Raiz quadrada do numero " + numero + ": " + raiz);
        } catch (Exception e) {
            System.out.println("Erro: Por favor, digite apenas números inteiros.");
            leitor.next();
        }
        leitor.close();
    }
}
