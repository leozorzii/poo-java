package aula07Execoes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        char op;
        Scanner leitor = new Scanner(System.in);
        
        try {
        System.out.println("Digite o numero: ");
            numero1 = leitor.nextInt();
            leitor.nextLine();
        System.out.println("Digite outro numero: ");
            numero2 = leitor.nextInt();
            leitor.nextLine();
        System.out.println("Digite a operação: ");
            op = leitor.next().charAt(0);
            switch (op) {
                case '+':
                    System.out.println(numero1 + numero2);
                    break;
                case '-':
                    System.out.println(numero1 - numero2);
                    break;
                case '*':
                    System.out.println(numero1 * numero2);
                    break;
                case '/':
                    System.out.println(numero1/numero2);
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("voce deve digitar numeros inteiros");
        } catch(ArithmeticException e){
            System.out.println("Erro: não é possivel dividir por zero");
        } catch(Exception e){
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            leitor.close();
        }
    }
}
