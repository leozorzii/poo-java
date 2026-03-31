package pkg;
//7 - Crie uma classe Usuario com nome e senha . O método getSenha()
// deve retornar a senha mascarada (ex: "********") por segurança, enquanto o setSenha deve exigir no mínimo 8 caracteres.
public class Usuario {
    private String senha;
    private String nome;

    public String getSenha() {
        if(this.senha == null) return "";
        return "*".repeat(this.senha.length());//gera uma string substituindo os caracteres dela por *
    }

    public void setSenha(String senha) {
        if(senha != null && senha.length() >= 8){
            this.senha = senha;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
