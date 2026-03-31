package pkg;

public class Estudante {
    //2 - Crie uma classe Estudante com o atributo nota .
    // O método setNota(double nota) deve garantir que a nota esteja estritamente entre 0 e 10.
    //  Se for inválida, a nota não deve ser alterada.
    private double nota;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if(nota > 0 && nota <= 10){
            this.nota = nota;
        }
    }
}
