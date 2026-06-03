package ex4;

public class Mago extends Personagem implements Magico{
    public Mago(String nome, int pontosDeVida){
        super(nome, pontosDeVida);
    }
    
    @Override
    public void atacar(Personagem alvo) throws AlvoInvalidoException {
        if(alvo.getPontosVida() == 0){
            throw new AlvoInvalidoException("O alvo está morto");
        }else{
            alvo.setPontosVida(alvo.getPontosVida() - 20);
            System.out.println(getNome() + " atacou " + alvo.getNome());
        }
}
    @Override
    public void lancarFeitico(Personagem alvo, String nomeFeitico) throws AlvoInvalidoException {
        if(alvo.getPontosVida() == 0){
            throw new AlvoInvalidoException("O alvo está morto");
        }else{
            alvo.setPontosVida(alvo.getPontosVida() - 20);
            System.out.println(getNome() + " lançou um feitiço de " + nomeFeitico + " causando 20 de dano");
        }
    }

}
