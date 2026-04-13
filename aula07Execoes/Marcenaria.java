package aula07Execoes;

public class Marcenaria {
    public static void instrucoes() throws Exception{
        boolean existeArquivo = false;

        if(!existeArquivo){
            throw new Exception("Arquivo 'projeto_mesa.txt'nao encontrado");
        }
        System.out.println("Lendo medidas...");
    }
    public static void main(String[] args) {
      try {
        instrucoes();
      } catch (Exception e) {
        System.out.println("Erro ao acessar projeto: " + e.getMessage());
      }finally{
        System.out.println("Limpando a bancada e desligando maquinas");
      }
     
    }
}
