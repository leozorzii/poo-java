public class Atleta extends Profissional {
    private String posicao;
    private int gols;
    private static final double BONUS_POR_GOL = 500.00;

    public Atleta(int id, String nome, double salarioBase, String posicao) throws ViolacaoOrcamentoException{
        super(id, nome, salarioBase);
        this.posicao = posicao;
        this.gols = 0;
    }
    @Override
    public void registrarDesempenho(int gols){
        if(gols < 0){
            System.out.println("numero de gols nao pode ser negativo");
            return;
        }
        this.gols += gols;
        this.bonusAcumulado += gols * BONUS_POR_GOL;
        System.out.printf("Total de gols: %d - Bonus:R$ %.2f", gols, bonusAcumulado);
    }
    @Override
    public String toString(){
        return "Atleta [posicao= " + posicao + ", gols=" + gols + "]";
    }
}
