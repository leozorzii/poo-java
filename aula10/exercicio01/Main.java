package aula10.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NaveEspacial> frota = new ArrayList<NaveEspacial>();

        NaveCargueiro cargueiro = new NaveCargueiro("CRG-01", 1200.0, 450.0, 800.0, 1000.0);
        NaveCombate combate = new NaveCombate("CBT-77", 1500.0, 900.0, 12, true);
        NaveExploracao exploracao = new NaveExploracao("EXP-09", 900.0, 700.0, true);

        frota.add(cargueiro);
        frota.add(combate);
        frota.add(exploracao);

        try {
            cargueiro.setCombustivelAtual(cargueiro.getCombustivelMaximo() + 200.0);
        } catch (CombustivelInvalidoException e) {
            System.out.println(e.getMessage());
        }

        for (NaveEspacial nave : frota) {
            System.out.println("Tipo de nave: " + nave.getClass().getSimpleName() +
                    " | Identificador: " + nave.getIdentificador());

            try {
                nave.viajar(1000.0);
            } catch (CombustivelInsuficienteException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
