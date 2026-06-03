package aula07Execoes;

import java.util.Scanner;

public class Conversoes extends ValidadorDeEntrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         System.out.println("Digite sua idade: ");
        String valor = teclado.nextLine();
        try {
            validar(valor);
        } catch (EntradaPorExtensoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        teclado.close();
    }
}
