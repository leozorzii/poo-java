package aula11.exe3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Eletronico("NoteGamer", 5500));   
        produtos.add(new Vestuario("Camiseta Nike", 70.99));
        produtos.add(new Alimento("suco de laranja", 15));
        produtos.add(new Eletronico("relogio", 1500));
    
        try {
            produtos.get(0).aplicarDesconto(10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        double totalImpostos = 0;

        for(Produto prod : produtos){
            if(prod instanceof Tributavel){
                Tributavel t = (Tributavel) prod;
                double imposto = t.calcularImposto();
                totalImpostos += imposto;
                System.out.printf("Produto: %s - Imposto: R$ %.2f\n", prod.getDescricao(), imposto);
            }else{
                System.out.printf("Produto: %s - isento\n", prod.getDescricao());
            }
        }
        System.out.printf("Total de impostos: R$ %.2f\n", totalImpostos);
    }
}
