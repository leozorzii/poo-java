package ex5;

public class Musica extends Midia implements Baixavel, Compartilhavel{
    public Musica(String titulo, int duracaoSegundos) {
        super(titulo, duracaoSegundos);
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo musica: " + getTitulo());
    }

    @Override
    public void realizarDownload(boolean conexaoEstavel) throws FalhaNoDownloadException {
        if (!conexaoEstavel) {
            throw new FalhaNoDownloadException("Falha ao baixar musica: Conexão instavel.");
        }
        System.out.println("Download da musica '" + getTitulo() + "' concluído com sucesso.");
    }

    @Override
    public String gerarLink() {
        return "https://streaming.com/musica/" + getTitulo().toLowerCase().replace(" ", "-");
    }

}
