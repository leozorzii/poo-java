package src.models;
public abstract class Pessoa {
    private String cpf;
    private int id;
    private String nome;
    private int idade;
    private static int contador = 0;

    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.id = ++contador;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract void exibirDados();
}
