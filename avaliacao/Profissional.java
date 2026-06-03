public abstract class Profissional {
    private int id;
    private String nome;
    private double salarioBase; 

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    protected double bonusAcumulado;
    public static final double salario_MAXIMO = 100_000.00;

    public Profissional(int id, String nome, double salarioBase)throws ViolacaoOrcamentoException{
        this.id = id;
        this.nome = nome;
        this.salarioBase = 0;
        setSalarioBase(salarioBase);
    }
    public void setSalarioBase(double salario) throws ViolacaoOrcamentoException{
        if(salario < 0){
            throw new ViolacaoOrcamentoException("Erro: salario nao pode ser negativo");
        }
        if(salario > salario_MAXIMO){
            throw new ViolacaoOrcamentoException("Erro: Salario ultrapassa o teto salario");
        }
        this.salarioBase = salario;
    }
    public abstract void registrarDesempenho(int valor);
    public double calcularPagamentoMensal(){
        return salarioBase + bonusAcumulado;
    }
    @Override
    public String toString(){
        return String.format("ID: %d | Nome: %s | Salario base: %.2f | Bonus: %.2f | Total: %.2f", id, nome, salarioBase, bonusAcumulado, calcularPagamentoMensal());
    }
    
}
