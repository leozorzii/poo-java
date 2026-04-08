package aula06Heranca;

public class Main {
    public static void main(String[] args) {

        System.out.println("-- Animais --");
        Gato gato = new Gato();
        gato.emitirSom();
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();

        System.out.println("-- Veiculo --");
        Carro carro = new Carro();
        System.out.println(carro.velocidade + "KM/H");
        carro.acelerar();

        System.out.println("-- Funcionario --");
        Gerente gerente = new Gerente();
        System.out.println(gerente.salario);
        Vendedor vendedor = new Vendedor();
        System.out.println(vendedor.salario);

        System.out.println("-- Produto --");
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
        produtoEletronico.nome = "Notebook";
        produtoEletronico.preco = 2599;
        System.out.println(produtoEletronico.nome);
        System.out.println(produtoEletronico.preco);
        System.out.println(produtoEletronico.getGarantia() + "Anos");

        System.out.println("-- Ex6: Forma e Circulo --");
        Circulo circulo = new Circulo("Vermelho", 5.0);
        System.out.println(circulo.cor);
        System.out.println(circulo.raio);

        System.out.println("-- Ex7: Eletronico e Smartphone --");
        Smartphone smartphone = new Smartphone();
        smartphone.ligar();
        smartphone.conectar4G();

        System.out.println("-- Ex8: Conta e ContaPoupanca --");
        ContaPoupanca poupanca = new ContaPoupanca(1000.0);
        poupanca.render();

        System.out.println("-- Ex9: Pessoa e Aluno --");
        Aluno aluno = new Aluno("Zorzi", 19, 12343248);
        System.out.println(aluno);

        System.out.println("-- Ex10: Instrumentos --");
        Violao violao = new Violao();
        violao.tocar();
        Piano piano = new Piano();
        piano.tocar();

        System.out.println("-- Ex11: ItemMenu e Sobremesa --");
        Sobremesa sobremesa = new Sobremesa("Pudim", 12.50, false);
        System.out.println(sobremesa.nome + " R$" + sobremesa.preco + " Acucar: " + sobremesa.contemAcucar);

        System.out.println("-- Ex12: Livro e Ebook --");
        Ebook ebook = new Ebook("Clean Code", "Robert Martin", 2.5);
        System.out.println(ebook.titulo + " - " + ebook.autor + " - " + ebook.tamanhoArquivoMB + "MB");
    }
}
