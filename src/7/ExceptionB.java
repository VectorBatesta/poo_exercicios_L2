
package exercicio7;

public class ExceptionB extends ExceptionA{

    private int numero;
    private int denominador;

    public ExceptionB() {
    }

    public ExceptionB(int numerador , int denominador) {
        this.numero = numerador;
        this.denominador = denominador;
    }

    public String toString() {
        return "Exception capturando uma Exception B: A divisão não resulta em um número inteiro";
    }
}
