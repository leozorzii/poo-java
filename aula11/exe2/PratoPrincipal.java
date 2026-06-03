package aula11.exe2;

public class PratoPrincipal extends ItemCardapio{
    public int tempoPreparo;

    public PratoPrincipal(String nome, double precoBase, int tempoPreparo){
        super(nome, precoBase);
        this.tempoPreparo = tempoPreparo;
    }
    @Override
    public double calcularPrecoFinal(){
        return this.precoBase;
    }
}
