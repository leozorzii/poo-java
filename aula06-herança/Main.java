package aula06;
public class Main {
    //parte de classes de animal
    public static void main(String[] args) {
        System.out.println("--Classes de Animais--");
        Gato gato = new Gato();
        gato.emitirSom();
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();

        System.out.println("--------------------------");
        System.out.println("--Classes de Pessoa--");

        //parte de classes Pessoa
        Aluno aluno = new Aluno();
        System.out.println(aluno.nome);
        System.out.println(aluno.idade);
        System.out.println(aluno.matricula);

        //parte de classes Veiculo
        System.out.println("--------------------------");
        System.out.println("--Classes de Veiculo--");
        Carro carro = new Carro();
        System.out.println(carro.velocidade + "KM/H");
        carro.acelerar();


        //parte de funcionario
        Gerente gerente = new Gerente();
        System.out.println(gerente.salario);
        Vendedor vendedor = new Vendedor();
        System.out.println(vendedor.salario);

        //parte de Produto
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();

        produtoEletronico.nome = "Notebook";
        produtoEletronico.preco = 2599;

        System.out.println(produtoEletronico.nome);
        System.out.println(produtoEletronico.preco);
        System.out.println(produtoEletronico.getGarantia() + "Anos");//garantia que foi dada na classe ProdutoEletronico
    }
}