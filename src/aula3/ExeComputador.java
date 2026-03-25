package exercicios;

import java.util.Scanner;

public class ExeComputador {
    public static void main(String[] args) {
        //Essa classe Computador também deverá ser executável, entretanto crie uma outra classe executável que irá instanciar a
        // classe Computador, criando 2 objetos. O primeiro objeto deverá ser criado através
        // da solicitação dos valores ao usuário por linha de execução. Já,
        // os valores do segundo objeto, deverão ser definidos no código-fonte da classe que o criou. Exiba na tela os resultados.
        Scanner leitor = new Scanner(System.in);
        Computador computador = new Computador();
        System.out.println("digite a marca do pc: ");
        computador.marca = leitor.nextLine();
        System.out.println("digite o modelo do pc: ");
        computador.modelo = leitor.nextLine();
        System.out.println("digite o tipo do pc: ");
        computador.tipo = leitor.nextLine();
        leitor.nextLine();
        System.out.println("digite o preço do pc: ");
        computador.preco = leitor.nextDouble();

        leitor.close();
    }
}
