package pkg;

public class MainUsuario {
    public static void main(String[] args) {
                Usuario user = new Usuario();
                user.setNome("João Silva");

                System.out.println("--- Teste 1: Senha curta (inválida) ---");
                user.setSenha("123");
                System.out.println("Senha mascarada: " + user.getSenha());

                System.out.println("\n--- Teste 2: Senha válida (8+ caracteres) ---");
                user.setSenha("minhasenha123");
                System.out.println("Senha mascarada: " + user.getSenha()); //  exibe *************

                System.out.println("\n--- Teste 3: Conferindo o tamanho ---");
                int tamanhoOriginal = "minhasenha123".length();
                int tamanhoMascarado = user.getSenha().length();
                System.out.println("Tamanho original: " + tamanhoOriginal);
                System.out.println("Tamanho da máscara: " + tamanhoMascarado);
            }
        }

