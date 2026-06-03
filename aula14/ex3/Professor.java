package ex3;

public class Professor extends MembroAcademico implements Pesquisador, Avaliador {
public Professor(String nome, String matricula){
    super(nome, matricula);
    }
    @Override
    public void mostrarFuncao() {
        System.out.println("Sou um professor");
    }    
    @Override
    public void publicarArtigo(String titulo) {
        if(titulo == null || titulo.trim().isEmpty()){
            throw new DadosAcademicosInvalidosException("O artigo precisa ter titulo");
        }
        System.out.println("Artigo: " + titulo + "Autor: " + getNome());
    }

    @Override
    public void lancarNotas(double nota) {
        if(nota < 0 || nota > 10){
        throw new DadosAcademicosInvalidosException("nota invalida lançada pelo professor");
        }
        System.out.println("Nota: " + nota + "lançada pelo professor: " + getNome());
    }
}
