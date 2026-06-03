import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static List<Profissional> profissionais = new ArrayList<>();
    public static Scanner leitor = new Scanner(System.in);

    public static void exibirMenu(){
        System.out.println("1 - cadastrar atleta");
        System.out.println("2 - cadastrar comissao tecnica");
        System.out.println("3 - registrar desempenho");
        System.out.println("4 - imprimar folha salarial");
        System.out.println("5 - sair");
        System.out.println("Opcao: ");
    }
    public static void cadastrarAtleta(){
        try {
            int id = lerInt("ID: ");
            String nome = lerString("Nome: ");
            double salario = lerDouble("salario: ");
            String posicao = lerString("posicao: ");

            Atleta atleta = new Atleta(id, nome, salario, posicao);
            profissionais.add(atleta);
            System.out.println("Atleta " + nome + "cadastrado com sucesso");
        } catch (ViolacaoOrcamentoException e) {
            System.out.println(e.getMessage());
            System.out.println("Cadastro contem invalidez, retornando ao menu...");
        }
    }
    public static void cadastrarComissao(){
        try{
            int id = lerInt("ID: ");
            String nome = lerString("Nome: ");
            double salario = lerDouble("salario: ");
            String cargo = lerString("cargo: ");

            ComissaoTecnica comissaoTecnica = new ComissaoTecnica(id, nome, salario, cargo);
            profissionais.add(comissaoTecnica);
            System.out.println("Profissional " + nome + "cadastrado com sucesso");
        }catch(ViolacaoOrcamentoException e){
            System.out.println(e.getMessage());
            System.out.println("cadastro contem invalidez, retornando ao menu");
        }
    }
    public static void registrarDesempenho(){
        if(profissionais.isEmpty()){
            System.out.println("Nao pode ter 0 profissionais");
            return;
        }
        System.out.println("---Registrador de desempenho---");
        listarRegistrosProfissionais();

        int id = lerInt("Digite o ID do profissional");
        Profissional profissinalEncontrado = null;
         for(Profissional p: profissionais){
            if(p.getId() == id){
                profissinalEncontrado = p;
                break;
            }
         }
         if(profissinalEncontrado == null){
            System.out.println("Profissional com ID " + id + " nao encontrado!");
            return;
         }
         String tipo = (profissinalEncontrado instanceof Atleta) ? "gols" : "Vitorias";
         int valor = lerInt("Quantidade de " + tipo + ": ");
         profissinalEncontrado.registrarDesempenho(valor);
    }
    public static void imprimirFolhaPagamento(){
        if(profissionais.isEmpty()){
            System.out.println("Nenhum Profissional Cadastrado");
            return;
        }
        System.out.println("-- Folha Pagamento --");
        double totalGeral = 0;
        for(Profissional p : profissionais){
            System.out.println(p);
            totalGeral += p.calcularPagamentoMensal();
        }
        System.out.println("Custo total no mes:R$ " + totalGeral);
    }
    public static int lerInt(String entrada){
        while (true) {
            System.out.println(entrada);
            try{
                int valor = leitor.nextInt();
                return valor;
            }catch(InputMismatchException e){
                leitor.nextLine();
                System.out.println("Erro: valor invalido na entrada");
            }
        }
    }
    
    public static double lerDouble(String entrada){
        while (true) {
            System.out.println(entrada);
            try {
                double valor = leitor.nextDouble();
                return valor;
            } catch (InputMismatchException e) {
               System.out.println("Erro: valor invalido na entrada");
            }
        }
    }
    public static String lerString(String entrada){
        System.out.println(entrada);
        return leitor.nextLine().trim();
    }
    public static void listarRegistrosProfissionais(){
        System.out.println("profissinais cadastrados: ");
        for(Profissional p : profissionais){
            String tipo = (p instanceof Atleta) ? "Atleta" : "Comissao";
            System.out.printf("ID: %d, nome: %s, tipo: %s", p.getId(), p.getNome(), tipo);
        }
    }
    public static void main(String[] args) {
        System.out.println("Sistema de Gerenciamento - Los Cabreros FC");
        System.out.println("-------------------------------------");

        int opcao = -1;
        while (opcao != 0) {
            exibirMenu();
            opcao = lerInt("opcao: ");
            switch (opcao) {
                case 1:
                    cadastrarAtleta();
                    break;
                case 2:
                    cadastrarComissao();
                    break;
                case 3:
                    registrarDesempenho();
                    break;
                case 4:
                    imprimirFolhaPagamento();
                    break;
                case 5:
                    System.out.println("Saindo...");
                default:
                    System.out.println("OPCAO INVALIDA");
                    break;
            }
        }
    }
}
