public class ComissaoTecnica extends Profissional {
    private String cargo;
    private int vitorias;

    public static final double bonus_por_Vitoria = 1_200.00;

    public ComissaoTecnica(int id, String nome, double salarioBase, String cargo) throws ViolacaoOrcamentoException{
        super(id, nome, salarioBase);
        this.cargo = cargo;
        this.vitorias = 0;
    }
    @Override
    public void registrarDesempenho(int vitorias){
        if(vitorias < 0){
            System.out.println("Numero de Vitorias nao pode ser negativo");
            return;
        }
        this.vitorias += vitorias;
        this.bonusAcumulado += vitorias * bonus_por_Vitoria;
        System.out.printf("[DADOS REGISTRADOS] - Numeros de vitoria(s): %d para %s. Bonus Acumulado: R$ %.2f", vitorias,getNome(), bonusAcumulado );
    }
    @Override
    public String toString() {
        return "ComissaoTecnica [cargo=" + cargo + ", vitorias=" + vitorias + "]";
    }
    
}

