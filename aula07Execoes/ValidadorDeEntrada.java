package aula07Execoes;
public class ValidadorDeEntrada {
    public static String validar(String valor) {
        //evitar execao limpando espcaços vazio e mantendo somente numeros
        if(valor.trim().matches(".*[a-zA-ZÀ-ú].*")){
          throw new EntradaPorExtensoException();
        }
       valor = valor.trim().replaceAll("[^0-9]", "");
        try { 
            int idade = Integer.parseInt(valor, 16);
            System.out.println("Conversão bem sucedida! idade Decimal: " +idade);
        } catch (NumberFormatException e) {
            System.out.println( "Não é numero decimal, utilize algarismos numericos.");
            for(char c : valor.toCharArray()){
                if(Character.digit(c, 16) == 1){
                    System.out.println("caracter ofensivo: " + c);
                }
              }
              System.out.println("so aceita numeros decimais, use apenas 0-9 e A-F");
        }finally{
        }
        return valor;
    }
}
