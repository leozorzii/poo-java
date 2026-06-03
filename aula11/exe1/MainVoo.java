package aula11.exe1;

public class MainVoo {
    public static void main(String[] args) {
        Voo voo = new Voo("Azul-AB23", "Sao Paulo", 100);
        System.out.println("Voo " + voo.getNumeroDoVoo() + " com destino a " + voo.getDestino());
        try {
            //reserva do assento 12
            voo.reservarAssento(150);
            System.out.println("Sucesso ao reservar assento");
        } catch (AssentoOcupadoException e) {
            System.out.println(e.getMessage());
        }
    }
}
