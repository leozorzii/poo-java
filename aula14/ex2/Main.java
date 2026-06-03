package ex2;

public class Main {
    public static void main(String[] args) {
        VanRefrigerada van = new VanRefrigerada("aba-1245", 1500);
        //forcar erro de temperatura
        try{
            van.ajustarTemperatura(15.0);
        }catch(TemperaturaCriticaException e){
            System.out.println("Erro: " + e.getMessage());
        }
        //forcar erro de temperatura valida
        try{
            van.ajustarTemperatura(2.0);
        }catch(TemperaturaCriticaException e){
            System.out.println("Erro: " + e.getMessage());
        }
        
    }
}
