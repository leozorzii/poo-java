package aula11.exe2;

public class Bebida extends ItemCardapio {
    private boolean isAlcoolica;

    public Bebida(String nome, double precoBase, boolean isAlcoolica){
        super(nome, precoBase);
        this.isAlcoolica = isAlcoolica;
    }
    @Override
    public double calcularPrecoFinal(){
        if(isAlcoolica == true){
            return this.precoBase * 1.10;
        }
        return this.precoBase;
    }
}
