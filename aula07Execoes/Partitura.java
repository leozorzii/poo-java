package aula07Execoes;

public class Partitura {

    private static final String NOTAS_VALIDAS = "CDEFGAB";
    
    public void registrarAcorde(String acorde) throws AcordeInvalidoException {
        boolean contemNotaValida = false;
        for (char c : acorde.toUpperCase().toCharArray()) {
            if (NOTAS_VALIDAS.indexOf(c) >= 0) {
                contemNotaValida = true;
                break;
            }
        }
        if (!contemNotaValida) {
            throw new AcordeInvalidoException(acorde);
        }
        System.out.println("Acorde registrado: " + acorde);
    }

    public static void main(String[] args) {
        Partitura partitura = new Partitura();

        // acorde valido
        try {
            partitura.registrarAcorde("Cm7");
        } catch (AcordeInvalidoException e) {
            System.out.println(e.getMessage());
        }

        // acorde invalido
        try {
            partitura.registrarAcorde("X#9");
        } catch (AcordeInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
