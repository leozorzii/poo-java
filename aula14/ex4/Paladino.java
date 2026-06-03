package ex4;

public class Paladino extends Personagem implements Curandeiro {
    public Paladino(String nome, int pontosDeVida){
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
    @Override
    public void curar(Personagem aliado) throws AlvoInvalidoException {
        if(aliado.getPontosVida() == 0){
            throw new AlvoInvalidoException("O aliado está morto");
        }else{
            aliado.setPontosVida(aliado.getPontosVida() + 20);
            System.out.println(getNome() + " curou " + aliado.getNome() + " causando 20 de vida");
        }
    }
}
