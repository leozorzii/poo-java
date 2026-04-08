package aula06Heranca;

public class Ebook extends LivroEx12 {
    protected double tamanhoArquivoMB;

    public Ebook(String titulo, String autor, double tamanhoArquivoMB) {
        super(titulo, autor);
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }
}
