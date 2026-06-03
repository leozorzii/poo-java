package aula10.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MaquinaIndustrial> maquinas = new ArrayList<MaquinaIndustrial>();

        InjetoraPlastico injetora = new InjetoraPlastico("INJ-100");
        BracoRoboticoMontagem braco = new BracoRoboticoMontagem("ROB-200");
        PrensaHidraulica prensa = new PrensaHidraulica("PRE-300");

        maquinas.add(injetora);
        maquinas.add(braco);
        maquinas.add(prensa);

        injetora.abastecerPlastico(10.0);

        for (MaquinaIndustrial maquina : maquinas) {
            try {
                maquina.produzirLote(60);
            } catch (MaquinaDesligadaException e) {
                System.out.println(maquina.getNumeroSerie() + ": " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Falha inesperada: " + e.getMessage());
            }
        }

        for (MaquinaIndustrial maquina : maquinas) {
            maquina.ligar();
        }

        for (int lote = 1; lote <= 3; lote++) {
            System.out.println("Executando lote " + lote);

            for (MaquinaIndustrial maquina : maquinas) {
                try {
                    maquina.produzirLote(40);
                } catch (FaltaMateriaPrimaException e) {
                    System.out.println("ALARME INJETORA: " + e.getMessage());
                } catch (EquipamentoDescalibradoException e) {
                    System.out.println("ALARME ROBO: " + e.getMessage());
                } catch (SuperaquecimentoException e) {
                    System.out.println("ALARME PRENSA: " + e.getMessage());
                } catch (MaquinaDesligadaException e) {
                    System.out.println("ALARME GERAL: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Falha inesperada: " + e.getMessage());
                }
            }
        }

        System.out.println("RELATORIO FINAL");
        for (MaquinaIndustrial maquina : maquinas) {
            System.out.println("Numero de serie: " + maquina.getNumeroSerie());
            System.out.println("Pecas produzidas: " + maquina.getPecasProduzidasTotais());
            System.out.println(String.format("Energia consumida: %.2f kWh", maquina.getEnergiaConsumidaKWh()));
            System.out.println("-------------------------------------");
        }
    }
}
