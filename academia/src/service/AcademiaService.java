package src.service;

import java.util.ArrayList;
import java.util.Scanner;

import src.exception.AcessoNegadoException;
import src.interfaces.GeradorDeRelatorio;
import src.models.Aluno;
import src.models.FichaDeTreino;
import src.models.Personal;
import src.models.Pessoa;
import src.models.Recepcionista;

public class AcademiaService {
    private Scanner leitor;
    private Recepcionista recepcionista;
    private ArrayList<Aluno> alunos;
    private ArrayList<Personal> personals;

    public AcademiaService() {
        this.leitor = new Scanner(System.in);
        this.recepcionista = new Recepcionista("987.654.321-00", "Ana", 25, "Manhã");
        this.alunos = new ArrayList<Aluno>();
        this.personals = new ArrayList<Personal>();
    }

    public void iniciarSessao() {
        int opcao = 0;
        do {
            System.out.println("\n===== Gerenciamento de Academia =====");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Personal");
            System.out.println("3. Ativar Plano");
            System.out.println("4. Cancelar Plano");
            System.out.println("5. Criar Ficha de Treino");
            System.out.println("6. Verificar Acesso Aluno");
            System.out.println("7. Gerar Relatorio");
            System.out.println("8. Sair");
            System.out.print("Opcao: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n-- Cadastrar Aluno --");
                    System.out.print("Nome do Aluno: ");
                    String nome = leitor.nextLine();

                    System.out.print("CPF do Aluno: ");
                    String cpf = leitor.nextLine();

                    System.out.print("Idade do Aluno: ");
                    int idadeAluno = leitor.nextInt();
                    leitor.nextLine();

                    System.out.print("Matricula do Aluno: ");
                    String matricula = leitor.nextLine();

                    System.out.println("Escolha o plano:");
                    System.out.println("1. Mensal");
                    System.out.println("2. Semestral");
                    System.out.println("3. Anual");
                    int opcaoPlano = leitor.nextInt();
                    leitor.nextLine();

                    String novoPlano = "";
                    switch (opcaoPlano) {
                        case 1: novoPlano = "Mensal"; break;
                        case 2: novoPlano = "Semestral"; break;
                        case 3: novoPlano = "Anual"; break;
                        default: System.out.println("Opcao invalida"); break;
                    }

                    Aluno novoAluno = new Aluno(cpf, nome, idadeAluno, matricula, novoPlano);
                    alunos.add(novoAluno);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n-- Cadastrar Personal --");
                    System.out.print("Nome do Personal: ");
                    String nomePersonal = leitor.nextLine();

                    System.out.print("CPF do Personal: ");
                    String cpfPersonal = leitor.nextLine();

                    System.out.print("Idade do Personal: ");
                    int idadePersonal = leitor.nextInt();
                    leitor.nextLine();

                    System.out.print("Especialidade do Personal: ");
                    String especialidade = leitor.nextLine();

                    Personal novoPersonal = new Personal(cpfPersonal, nomePersonal, idadePersonal, especialidade);
                    personals.add(novoPersonal);
                    System.out.println("Personal cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n-- Ativar Plano --");
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado");
                        break;
                    }
                    for (Aluno a : alunos) {
                        System.out.println("------------------");
                        System.out.println("ID: " + a.getId() + " | Nome: " + a.getNome() + " | Matricula: " + a.getMatricula());
                    }
                    System.out.println("------------------");
                    System.out.print("Digite o ID do aluno: ");
                    int idAlunoCadastrado = leitor.nextInt();
                    leitor.nextLine();

                    Aluno alunoCadastrado = null;
                    for (Aluno a : alunos) {
                        if (a.getId() == idAlunoCadastrado) {
                            alunoCadastrado = a;
                            break;
                        }
                    }
                    if (alunoCadastrado == null) {
                        System.out.println("Aluno nao encontrado");
                        break;
                    }

                    System.out.println("Escolha o plano:");
                    System.out.println("1. Mensal");
                    System.out.println("2. Semestral");
                    System.out.println("3. Anual");
                    int opcaoDefinirPlano = leitor.nextInt();
                    leitor.nextLine();

                    String definirPlano = "";
                    switch (opcaoDefinirPlano) {
                        case 1: definirPlano = "Mensal"; break;
                        case 2: definirPlano = "Semestral"; break;
                        case 3: definirPlano = "Anual"; break;
                        default: System.out.println("Opcao invalida"); break;
                    }
                    alunoCadastrado.setPlano(definirPlano);
                    recepcionista.ativarPlano(alunoCadastrado);
                    break;

                case 4:
                    System.out.println("\n-- Cancelar Plano --");
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado");
                        break;
                    }
                    for (Aluno a : alunos) {
                        System.out.println("------------------");
                        System.out.println("ID: " + a.getId() + " | Nome: " + a.getNome() + " | Matricula: " + a.getMatricula());
                    }
                    System.out.println("------------------");
                    System.out.print("Digite o ID do aluno: ");
                    int idAluno = leitor.nextInt();
                    leitor.nextLine();

                    Aluno alunoCancelado = null;
                    for (Aluno a : alunos) {
                        if (a.getId() == idAluno) {
                            alunoCancelado = a;
                            break;
                        }
                    }
                    if (alunoCancelado == null) {
                        System.out.println("Aluno nao encontrado");
                        break;
                    }
                    recepcionista.cancelarPlano(alunoCancelado);
                    break;

                case 5:
                    System.out.println("\n-- Criar Ficha de Treino --");
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado");
                        break;
                    }
                    if (personals.isEmpty()) {
                        System.out.println("Nenhum personal cadastrado");
                        break;
                    }

                    for (Aluno a : alunos) {
                        System.out.println("------------------");
                        System.out.println("ID: " + a.getId() + " | Nome: " + a.getNome());
                    }
                    System.out.println("------------------");
                    System.out.print("Digite o ID do aluno: ");
                    int idAlunoFicha = leitor.nextInt();
                    leitor.nextLine();

                    Aluno alunoEncontrado = null;
                    for (Aluno a : alunos) {
                        if (a.getId() == idAlunoFicha) {
                            alunoEncontrado = a;
                            break;
                        }
                    }
                    if (alunoEncontrado == null) {
                        System.out.println("Aluno nao encontrado");
                        break;
                    }

                    for (Personal p : personals) {
                        System.out.println("------------------");
                        System.out.println("ID: " + p.getId() + " | Nome: " + p.getNome());
                    }
                    System.out.println("------------------");
                    System.out.print("Digite o ID do Personal: ");
                    int idPersonal = leitor.nextInt();
                    leitor.nextLine();

                    Personal personalEncontrado = null;
                    for (Personal p : personals) {
                        if (p.getId() == idPersonal) {
                            personalEncontrado = p;
                            break;
                        }
                    }
                    if (personalEncontrado == null) {
                        System.out.println("Personal nao encontrado");
                        break;
                    }

                    System.out.print("Objetivo do treino: ");
                    String objetivo = leitor.nextLine();
                    System.out.print("Data de criacao: ");
                    String dataCriacao = leitor.nextLine();

                    FichaDeTreino fichaDeTreino = new FichaDeTreino(alunoEncontrado, personalEncontrado, dataCriacao, objetivo);

                    String exercicio;
                    do {
                        System.out.print("Digite o exercicio (sair para finalizar): ");
                        exercicio = leitor.nextLine();
                        if (!exercicio.equals("sair")) {
                            fichaDeTreino.adicionarExercicio(exercicio);
                        }
                    } while (!exercicio.equals("sair"));

                    fichaDeTreino.exibirFicha();
                    break;

                case 6:
                    System.out.println("\n-- Verificar Acesso --");
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado");
                        break;
                    }
                    for (Aluno a : alunos) {
                        System.out.println("------------------");
                        System.out.println("ID: " + a.getId() + " | Nome: " + a.getNome());
                    }
                    System.out.println("------------------");
                    System.out.print("Digite o ID do aluno: ");
                    int idAlunoAcesso = leitor.nextInt();
                    leitor.nextLine();

                    try {
                        Aluno alunoAcesso = null;
                        for (Aluno a : alunos) {
                            if (a.getId() == idAlunoAcesso) {
                                alunoAcesso = a;
                                break;
                            }
                        }
                        if (alunoAcesso == null) {
                            System.out.println("Aluno nao encontrado");
                            break;
                        }
                        recepcionista.verificarAcesso(alunoAcesso);
                        System.out.println("Acesso liberado!");
                    } catch (AcessoNegadoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    System.out.println("\n-- Gerar Relatorio --");
                    System.out.println("1 - Aluno");
                    System.out.println("2 - Personal");
                    System.out.print("Opcao: ");
                    int opcaoRelatorio = leitor.nextInt();
                    leitor.nextLine();

                    if (opcaoRelatorio == 1) {
                        if (alunos.isEmpty()) {
                            System.out.println("Nenhum aluno cadastrado");
                            break;
                        }
                        for (Aluno a : alunos) {
                            System.out.println("------------------");
                            System.out.println("ID: " + a.getId() + " | Nome: " + a.getNome());
                        }
                        System.out.println("------------------");
                        System.out.print("Digite o ID do aluno: ");
                        int idAlunoRelatorio = leitor.nextInt();
                        leitor.nextLine();

                        Aluno alunoRelatorio = null;
                        for (Aluno al : alunos) {
                            if (al.getId() == idAlunoRelatorio) {
                                alunoRelatorio = al;
                                break;
                            }
                        }
                        if (alunoRelatorio == null) {
                            System.out.println("Aluno nao encontrado");
                            break;
                        }
                        // usando a interface GeradorDeRelatorio - polimorfismo
                        GeradorDeRelatorio gerador = alunoRelatorio;
                        gerador.gerarRelatorio();

                    } else if (opcaoRelatorio == 2) {
                        if (personals.isEmpty()) {
                            System.out.println("Nenhum personal cadastrado");
                            break;
                        }
                        for (Personal p : personals) {
                            System.out.println("------------------");
                            System.out.println("ID: " + p.getId() + " | Nome: " + p.getNome());
                        }
                        System.out.println("------------------");
                        System.out.print("Digite o ID do personal: ");
                        int idPersonalRelatorio = leitor.nextInt();
                        leitor.nextLine();

                        Personal personalRelatorio = null;
                        for (Personal pe : personals) {
                            if (pe.getId() == idPersonalRelatorio) {
                                personalRelatorio = pe;
                                break;
                            }
                        }
                        if (personalRelatorio == null) {
                            System.out.println("Personal nao encontrado");
                            break;
                        }
                        // usando a interface GeradorDeRelatorio - polimorfismo
                        GeradorDeRelatorio gerador = personalRelatorio;
                        gerador.gerarRelatorio();
                    } else {
                        System.out.println("Opcao invalida");
                    }
                    break;

                case 8:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while (opcao != 8);
        leitor.close();
    }
}