package exercicios;

import java.util.Scanner;

public class ExeAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("digite seu nome: ");
        aluno.nome = leitor.nextLine();
        System.out.println("digite sua matricula: ");
        aluno.matricula = leitor.nextInt();
        leitor.nextLine();
        System.out.println("digite sua primeira nota: ");
        aluno.nota1 = leitor.nextDouble();
        System.out.println("digite sua segunda nota: ");
        aluno.nota2 = leitor.nextDouble();
        System.out.println("digite sua terceira nota: ");
        aluno.nota3 = leitor.nextDouble();

        double mediaNotas = aluno.nota1 + aluno.nota2 + aluno.nota3 / 3;
        System.out.println("Dados do Aluno: ");
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matricula: " + aluno.matricula);
        System.out.println("Notas: ");
        System.out.println("Nota 1: " + aluno.nota1);
        System.out.println("Nota 2: " + aluno.nota2);
        System.out.println("Nota 3: " + aluno.nota3);
        System.out.println("--------------------");
        System.out.println("Boletim Final");
        if(mediaNotas == 6){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
        leitor.close();
        }
    }
