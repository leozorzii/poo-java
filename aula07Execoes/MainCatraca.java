package aula07Execoes;

public class MainCatraca {
    public static void main(String[] args) {
        Catraca torcedor = new Catraca();
        try {
            torcedor.validarIngresso(12, true, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro na catraca: " + e.getMessage());
        }

        
    }
}
