package aula07Execoes;

public class EntradaPorExtensoException extends RuntimeException {
    public EntradaPorExtensoException() {
        super("Este sistema não possui processamento de linguagem natural (NLP). Use algarismos numéricos.");
    }
}
