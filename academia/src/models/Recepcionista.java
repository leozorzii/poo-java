package src.models;
import src.exception.AcessoNegadoException;

public class Recepcionista extends Pessoa{
 private String turno;

    public Recepcionista(String cpf, String nome, int idade, String turno) {
        super(cpf, nome, idade);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    public void cancelarPlano(Aluno aluno){
        System.out.println("Plano cancelado");
        aluno.setStatusPlano(false);
    }
     public void ativarPlano(Aluno aluno){
        System.out.println("Plano ativado!");
        aluno.setStatusPlano(true);
    }
    public void verificarPagamento(Aluno aluno){
        if(aluno.isStatusPlano()){
            System.out.println("Pagamento confirmado");
        }else{
            System.out.println("Pagamento pendente");
        }
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Turno: " + this.turno);
    }

    public void verificarAcesso(Aluno aluno) throws AcessoNegadoException{
        if(!aluno.isStatusPlano()){
            throw new AcessoNegadoException("Acesso negado");
        }else{
            System.out.println("Acesso permitido");
        }
    }
  
}
