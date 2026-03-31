package pkg;

public class Cronometro {
    //6 - Crie uma classe Cronometro com o atributo segundos .
    // Implemente um método passarTempo() que incrementa 1 segundo. O usuário não deve ter um setSegundos , apenas o get .
    private int segundos;

    public int getSegundos() {
        return segundos;
    }

    public void passarTempo(){
     this.segundos ++;
    }
}
