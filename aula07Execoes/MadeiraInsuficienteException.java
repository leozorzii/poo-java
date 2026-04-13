package aula07Execoes;

// excecao unchecked: herdar de RuntimeException nao obriga declarar throws
public class MadeiraInsuficienteException extends RuntimeException {

    public MadeiraInsuficienteException(String tipo, double solicitado, double disponivel) {
        super("Estoque insuficiente de " + tipo + ": solicitado " + solicitado + " m, disponivel " + disponivel + " m.");
    }
}
