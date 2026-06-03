package ex1;

public class ProdutoDigital extends Produto implements Avaliavel {
     public ProdutoDigital(String nome, double preco){
       setNome(nome);
       setPreco(preco);
    }
    @Override
    public double calcularFrete() {
        return  0.0;
    }
    public void adicionarAvaliacao(int nota) throws NotaInvalidaException{
        if(nota < 1 || nota > 5){
            throw new NotaInvalidaException("Nota inválida");
        }
        System.out.println("Avaliação:" + nota);
    }
}
