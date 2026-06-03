package aula11.exe3;

class Vestuario extends Produto implements Tributavel {
    public Vestuario(String descricao, double valorOriginal){
        super(descricao, valorOriginal);
    }
    @Override
    public double calcularImposto(){
        return this.getValorOriginal() * 0.05;
    }
}
