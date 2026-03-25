package pkg;
//Crie uma classe Triangulo com três lados privados.
// O setter de cada lado deve validar a "Desigualdade Triangular" (a soma de dois lados deve ser sempre maior que o terceiro).
// Se a alteração de um lado invalidar o triângulo, a operação deve ser cancelada.
public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3){
       this.lado1 = lado1;
       this.lado2 = lado2;
       this.lado3 = lado3;
    }

    private boolean validar(int lado1, int lado2, int lado3){
        return (lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2);
    }


    public void setLado1(int lado1) {
       if(validar(lado1, this.lado2, this.lado3)){
       }
    }


    public void setLado2(int lado2) {
        if(validar( this.lado1, lado2,  this.lado3)){
            this.lado2 = lado2;
        }
    }

    public int getLado1() {return lado1;}

    public int getLado2() {return lado2;}

    public int getLado3() {return lado3;}

    public void setLado3(int lado3) {
        if(validar(this.lado1, this.lado2, lado3)){
            this.lado3 = lado3;
        }
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }
}
