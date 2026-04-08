package aula07Execoes;

import java.util.Scanner;

public class Conversoes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String string = teclado.nextLine();
        try {
            double valor; 
            valor = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            System.out.println("Erro: " + teclado + "Não é numero decimal.");
        }finally{
        teclado.close();
        }
    }
}
