package aula11.exe2;

public class Main {
    public static void main(String[] args) {
        Pedido meuPedido = new Pedido();

        //adicionadno os itens
        ItemCardapio p1 = new PratoPrincipal("Iscas de Frango", 45.0, 15);
        ItemCardapio p2 = new Bebida("Coca Zero", 4.50, false);
        ItemCardapio p3 = new Bebida("Whisky", 40, true);

        meuPedido.adicionarItem(p1);
        meuPedido.adicionarItem(p2);
        meuPedido.adicionarItem(p3);
        meuPedido.fecharConta();
        
    }
}
