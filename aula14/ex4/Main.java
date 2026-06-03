package ex4;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Guerreiro", 100);
        Mago mago = new Mago("Mago", 100);
        //Paladino paladino = new Paladino("Paladino", 100); - caso queira uma luta sem fim



        try{
            while(mago.getPontosVida() > 0){
                guerreiro.atacar(mago);
                //assim fica uma luta sem fim kkkkkkkk
                //paladino.curar(mago);
            }
            
            //forcando erro com personagem ja morto
            guerreiro.atacar(mago);
        }catch(AlvoInvalidoException e){
            System.out.println("Excecao capturada: " + e.getMessage());
        }
    }
}
