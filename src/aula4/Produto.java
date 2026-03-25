package pkg;

public class Produto {
    //4 - Na classe Produto , o atributo quantidadeEmEstoque deve ser privado.
    // Crie métodos adicionarEstoque(int qtd) e removerEstoque(int qtd) .
    // O método de remoção não pode deixar o estoque ficar negativo.
    private int quantidadeEmEstoque;



    public void adicionarEstoque(int qtd){
         this.quantidadeEmEstoque += qtd;
    }
    public void removerEstoque(int qtd){
        if(qtd > 0){
            this.quantidadeEmEstoque -= qtd;
        }
    }
    public int getQuantidadeEmEstoque(){
        return this.quantidadeEmEstoque;
    }

}