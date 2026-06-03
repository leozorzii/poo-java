package ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MembroAcademico> membros = new ArrayList<>();
        membros.add(new Professor("Dr. Rafael", "P123"));
        membros.add(new AlunoPosGraduacao("Carlos Silva", "A456"));

        for (MembroAcademico membro : membros) {
            membro.mostrarFuncao();

            if (membro instanceof Pesquisador) {
                try {
                    ((Pesquisador) membro).publicarArtigo("");
                } catch (DadosAcademicosInvalidosException e) {
                    System.out.println("Erro de publicação interceptado: " + e.getMessage());
                }
            }

            if (membro instanceof Avaliador) {
                try {
                    ((Avaliador) membro).lancarNotas(11.0);
                } catch (DadosAcademicosInvalidosException e) {
                    System.out.println("Erro de notas interceptado: " + e.getMessage());
                }
            }
            System.out.println();
        }
    }
}