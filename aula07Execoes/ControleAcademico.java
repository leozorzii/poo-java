package aula07Execoes;

import java.sql.SQLException;

public class ControleAcademico {

    // camada de banco: lanca SQLException simulando falha de conexao
    private static String buscarAluno(int matricula) throws SQLException {
        throw new SQLException("Falha de conexao com o banco de dados.");
    }

    // camada de negocio: captura SQLException e relanca como excecao de negocio
    private static void gerarBoletim(int matricula) throws AlunoNaoEncontradoException {
        try {
            String nome = buscarAluno(matricula);
            System.out.println("Boletim gerado para: " + nome);
        } catch (SQLException e) {
            // troca excecao tecnica por excecao de negocio
            throw new AlunoNaoEncontradoException(matricula, e);
        }
    }

    // camada de interface: so conhece excecao de negocio, nao sabe nada do banco
    public static void main(String[] args) {
        try {
            gerarBoletim(2024001);
        } catch (AlunoNaoEncontradoException e) {
            System.out.println("Nao foi possivel gerar o boletim. " + e.getMessage());
        }
    }
}
