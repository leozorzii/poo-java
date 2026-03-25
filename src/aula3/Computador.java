package exercicios;

public class Computador {
    public String modelo;
    public String marca;
    public String tipo;
    public double preco;
    public static void main(String[] args) {
        Computador computador = new Computador();
        Computador computador2 = new Computador();
        computador2.marca = "Acer";
        computador2.modelo = "Nitro V15";
        computador2.tipo = "notebook";
        computador2.preco = 5.699;

        System.out.println("dados da maquina: ");
        System.out.println("marca: " + computador2.marca);
        System.out.println("modelo: " + computador2.modelo);
        System.out.println("tipo: " + computador2.tipo);
        System.out.println("preco: " + computador2.preco);
    }
}
