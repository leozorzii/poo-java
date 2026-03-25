package exercicios;

import java.util.Scanner;

public class ExeCarro {
    public static void main(String[] args) {
        //1 - Crie uma classe chamada Carro que possua 3 atributos: marca, modelo e anoFabricacao.
        //    // Além disso, crie uma classe executável para criar 2 objetos do tipo Carro e
        //    // exibir na tela os valores dos atributos criados.
        //    //•Esses valores devem ser solicitados ao usuário, por linha de execução.
        Carro carro = new Carro();
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite a marca: ");
        carro.marca = leitor.nextLine();
        System.out.println("Digite o modelo: ");
        carro.modelo = leitor.nextLine();
        leitor.nextLine();
        System.out.println("digite o ano de fabricação: ");
        carro.anoDeFabricacao = leitor.nextInt();

        Carro carro2 = new Carro();
        System.out.println("digite a marca: ");
        carro2.marca = leitor.nextLine();
        System.out.println("Digite o modelo: ");
        carro2.modelo = leitor.nextLine();
        leitor.nextLine();
        System.out.println("digite o ano de fabricação: ");
        carro2.anoDeFabricacao = leitor.nextInt();;

        System.out.println("Atributos Carro 1:");
        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.anoDeFabricacao);

        System.out.println("Atributos Carro 2: ");
        System.out.println(carro2.marca);
        System.out.println(carro2.marca);
        System.out.println(carro2.marca);


    }
}
