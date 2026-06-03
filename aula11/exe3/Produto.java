package aula11.exe3;

public abstract class Produto {

    private double valorOriginal;
    private String descricao;

    public Produto(String descricao, double valorOriginal){
        this.descricao = descricao;
        this.valorOriginal = valorOriginal;
    }


    public String getDescricao() {
        return descricao;
    }
    public double getValorOriginal() {
        return valorOriginal;
    }

    public void aplicarDesconto(double porcentagem){
        if(porcentagem < 0 || porcentagem > 50){
            throw new IllegalArgumentException("Desconto invalido! somente  entre 1% e 50%");
        }
        double desconto = this.valorOriginal * (porcentagem / 100);
        this.valorOriginal -= desconto;
    }

}
