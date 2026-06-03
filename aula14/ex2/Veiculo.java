package ex2;

public abstract class Veiculo {
    private String placa;
    private double capacidadeCarga;

    public Veiculo(String placa, double capacidadeCarga){  
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
}


    protected void registrarManutencao(){
        System.out.println("Manutencao registrada do veiculo: " + placa);
    }
    public abstract void iniciarViagem();
}
