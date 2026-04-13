package aula07Execoes;

public class Catraca {

    public void validarIngresso(int idadeTorcedor, boolean isSocio, boolean temAcompanhante){
        if(isSocio && idadeTorcedor >= 18 && !temAcompanhante){
            throw new IllegalArgumentException("Acesso negado! Menores nao-socios precisam de acompanhante");
        }
    }
    
}
