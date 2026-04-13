package aula07Execoes;

import java.util.Scanner;

public class Conversoes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        String idade = teclado.nextLine();
        try { 
            
            int valor = Integer.parseInt(idade);
        } catch (NumberFormatException e) {
            System.out.println("Erro: " + teclado + "Não é numero decimal, utilize algarismos numericos.");
        }finally{
        teclado.close();
        }
    }
}
