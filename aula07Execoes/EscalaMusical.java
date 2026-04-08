package aula07Execoes;

import java.util.Scanner;

public class EscalaMusical {
    public static void main(String[] args) {
        String [] notas = {"Do","Re", "Mi", "Fa", "Sol", "La", "Si"};
        Scanner input = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite um numero de 1 a 7: ");
        numero = input.nextInt();   
        try {
            System.out.println("nota baseada no indice: " + notas[numero-1]);
        } catch (Exception e) {
            System.out.println("Erro opcao invalida, digite um numero valido!");
        }

        input.close();
    }
}
