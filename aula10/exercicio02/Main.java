package aula10.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FuncionarioHospital> folhaPagamento = new ArrayList<FuncionarioHospital>();

        Medico medico = new Medico("Carlos Souza", "MED-100", 18000.0, "Cirurgia", 1200.0, 5);
        Enfermeiro enfermeiro = new Enfermeiro("Marina Silva", "ENF-200", 4200.0, "UTI", 0.40);
        Administrativo administrativo = new Administrativo("Paulo Mendes", "ADM-300", 3200.0,
                "Recursos Humanos", true);

        medico.setHorasTrabalhadasMensais(160);
        enfermeiro.setHorasTrabalhadasMensais(180);
        administrativo.setHorasTrabalhadasMensais(160);

        folhaPagamento.add(medico);
        folhaPagamento.add(enfermeiro);
        folhaPagamento.add(administrativo);

        try {
            administrativo.setSalarioBase(900.0);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            enfermeiro.setPercentualInsalubridade(0.99);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            medico.setHorasTrabalhadasMensais(400);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }

        for (FuncionarioHospital funcionario : folhaPagamento) {
            funcionario.exibirResumoMensal();
        }
    }
}
