package aula07Execoes;

// excecao checked: herdar de Exception obriga quem usa a tratar com try-catch ou throws
public class AcordeInvalidoException extends Exception {

    public AcordeInvalidoException(String acorde) {
        super("Acorde invalido: " + acorde + ". Use apenas C, D, E, F, G, A ou B.");
    }
}
