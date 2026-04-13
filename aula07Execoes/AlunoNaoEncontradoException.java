package aula07Execoes;

// excecao de negocio que esconde detalhes tecnicos do banco
public class AlunoNaoEncontradoException extends Exception {

    public AlunoNaoEncontradoException(int matricula, Throwable causa) {
        super("Aluno com matricula " + matricula + " nao encontrado.", causa);
    }
}
