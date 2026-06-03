package aula11.exe1;

public class Voo {
   private String numeroDoVoo;
   private String destino; 
   private boolean [] assentos  = new boolean[100];
   
   public String getNumeroDoVoo() {
    return numeroDoVoo;
}
   public String getDestino() {
    return destino;
}
   public Voo(String numeroDoVoo, String destino, int totalAssentos){
    this.numeroDoVoo = numeroDoVoo;
    this.destino = destino;
    this.assentos = new boolean[100];
   }
   public void reservarAssento(int numeroAssento) throws AssentoOcupadoException{
        if(numeroAssento < 1 || numeroAssento > 100){
            throw new IllegalArgumentException("Numero de assento invalido!");
        }
        int indiceAssento = numeroAssento -1;

        if(assentos[indiceAssento]){
            throw new AssentoOcupadoException("Assento: " + numeroAssento + "ocupado");
        }else{
        assentos[indiceAssento] = true;
        System.out.println("Assento: " + numeroAssento + " reservado com sucesso");
      }
    }
}


