package ex3;

public class AlunoPosGraduacao extends MembroAcademico implements Pesquisador{
    public AlunoPosGraduacao(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public void mostrarFuncao() {
        System.out.println("Sou um aluno de pós-graduação");
    }

    @Override
    public void publicarArtigo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new DadosAcademicosInvalidosException("O artigo precisa ter titulo");
        }
        System.out.println("Artigo: " + titulo + " Autor: " + getNome());
    }

}
