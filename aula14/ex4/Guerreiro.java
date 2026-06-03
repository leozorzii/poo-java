package ex4;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int pontosDeVida){
        super(nome, pontosDeVida);
    }

    @Override
    public void atacar(Personagem alvo) throws AlvoInvalidoException {
        if(alvo.getPontosVida() == 0){
            throw new AlvoInvalidoException("O alvo está morto");
        }else{
            alvo.setPontosVida(alvo.getPontosVida() - 20);
            System.out.println(getNome() + " atacou " + alvo.getNome() + " causando 20 de dano");
        }
    }
}
