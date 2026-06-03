package aula11.exe3;

class Eletronico extends Produto implements Tributavel{
    public Eletronico(String descricao, double valorOriginal){
        super(descricao, valorOriginal);
    }
    @Override
    public double calcularImposto(){
        return this.getValorOriginal() * 0.15;
    }    
}
