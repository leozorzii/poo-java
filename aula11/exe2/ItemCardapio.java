package aula11.exe2;

abstract class ItemCardapio {
    protected String nome;
    protected double precoBase;

    public ItemCardapio(String nome, double precoBase){
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome(){
        return nome;
    }

     public abstract double calcularPrecoFinal();
}
