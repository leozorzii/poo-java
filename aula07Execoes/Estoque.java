package aula07Execoes;

public class Estoque {

    double quantidadeMdf;
    double quantidadeMacaudiba;

    public Estoque(double mdf, double macaudiba) {
        this.quantidadeMdf = mdf;
        this.quantidadeMacaudiba = macaudiba;
    }

    // nao precisa declarar throws pois a excecao e unchecked
    public void cortarPeca(String tipo, double metros) {
        if (tipo.equals("MDF")) {
            if (metros > quantidadeMdf) {
                throw new MadeiraInsuficienteException("MDF", metros, quantidadeMdf);
            }
            quantidadeMdf -= metros;
            System.out.println("Cortados " + metros + " m de MDF. Restante: " + quantidadeMdf + " m");

        } else if (tipo.equals("Macaudiba")) {
            if (metros > quantidadeMacaudiba) {
                throw new MadeiraInsuficienteException("Macaudiba", metros, quantidadeMacaudiba);
            }
            quantidadeMacaudiba -= metros;
            System.out.println("Cortados " + metros + " m de Macaudiba. Restante: " + quantidadeMacaudiba + " m");
        }
    }

    public static void main(String[] args) {
        Estoque estoque = new Estoque(5.0, 3.0);

        // corte valido
        estoque.cortarPeca("MDF", 2.0);

        // corte alem do estoque
        try {
            estoque.cortarPeca("Macaudiba", 10.0);
        } catch (MadeiraInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
