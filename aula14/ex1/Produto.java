package ex1;

public abstract class Produto {
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco){
        if(preco < 0){
            throw new IllegalArgumentException("O preço não pode ser negativo");
        }
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }

     public abstract double calcularFrete();
}
