package aula11.exe2;

import java.util.ArrayList;
import java.util.List;

class Pedido {
   private List<ItemCardapio> itens;

   public Pedido(){
    this.itens = new ArrayList<>();
   }

    public void adicionarItem(ItemCardapio item){
        itens.add(item);
    }
    public void fecharConta(){
      double total = 0;
      for(ItemCardapio item : itens){
        double precoFinal = item.calcularPrecoFinal();
        System.out.println(item.getNome() +  " com valor de " + precoFinal);
        total += precoFinal;
      }  
      System.out.println("----------------------");
      System.out.println("total da conta: " + total);

    }
}
