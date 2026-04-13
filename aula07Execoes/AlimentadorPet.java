package aula07Execoes;

public class AlimentadorPet {
    public void liberarRacao(int quantidadeGramas){
        if(quantidadeGramas < 0){
            throw new IllegalArgumentException("quantidade invalida");
        }
        if(quantidadeGramas > 100){
            throw new IllegalArgumentException("tigela vai transbordar");
        }
    }
    public static void main(String[] args) {
        AlimentadorPet alimentador = new AlimentadorPet();
        int quantidadeDeRacao = 150;

        try {
            alimentador.liberarRacao(quantidadeDeRacao);
            System.out.println("Gata alimentada");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        }catch(IllegalStateException e){
            System.out.println("Erro no alimentador: " + e.getMessage());
        }
    }
}
