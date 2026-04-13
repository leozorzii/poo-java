package aula07Execoes;

import java.util.InputMismatchException;

public class TriagemHospital {

    // cadastra paciente validando nome e peso
    public void cadastrarPaciente(String nome, double peso) {
        if (nome == null || nome.isEmpty()) {
            throw new NullPointerException("Nome do paciente nao pode ser vazio.");
        }
        if (peso <= 0) {
            throw new InputMismatchException("Peso invalido: " + peso);
        }
        System.out.println("Paciente cadastrado: " + nome + " | Peso: " + peso + " kg");
    }

    public static void main(String[] args) {
        TriagemHospital triagem = new TriagemHospital();

        // testa nome vazio
        try {
            triagem.cadastrarPaciente("", 70.0);
        } catch (NullPointerException e) {
            System.out.println("Erro de nome: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        } catch (Exception e) {
            // polimorfismo: captura qualquer outro erro imprevisto
            System.out.println("Erro interno no sistema do hospital: " + e.getMessage());
        }

        // testa peso invalido
        try {
            triagem.cadastrarPaciente("Ana Lima", -5.0);
        } catch (NullPointerException e) {
            System.out.println("Erro de nome: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro interno no sistema do hospital: " + e.getMessage());
        }

        // testa dados validos
        try {
            triagem.cadastrarPaciente("Carlos Silva", 80.5);
        } catch (NullPointerException e) {
            System.out.println("Erro de nome: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro interno no sistema do hospital: " + e.getMessage());
        }
    }
}
