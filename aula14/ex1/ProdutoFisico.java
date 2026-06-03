package ex1;

public class ProdutoFisico extends Produto implements Avaliavel {
    public ProdutoFisico(String nome, double preco){
        setNome(nome);
        setPreco(preco);
    }
    @Override
    public double calcularFrete() {
        return getPreco() * 0.10;
    }
    public void adicionarAvaliacao(int nota) throws NotaInvalidaException{
        if(nota < 1|| nota > 5){
            throw new NotaInvalidaException("Nota inválida");
        }
         System.out.println("Avaliação:" + nota);
    }
}
