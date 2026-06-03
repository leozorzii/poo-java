package aula11.exe1;

public class AssentoOcupadoException extends Exception {
    public AssentoOcupadoException(){
        super("Assento ja esta ocupado!!!!");
    }
    public AssentoOcupadoException(String mensagem){
        super(mensagem);
    }
}
