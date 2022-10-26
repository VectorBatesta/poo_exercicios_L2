
package exercicio7;

public class ExceptionA extends Exception {

	private int numero;
	private int denominador;
		
	public ExceptionA() {
	}
	
	public ExceptionA(int numerador, int denominador) {
		this.numero = numerador;
		this.denominador = denominador;
	}	
        
	public String toString() {
            return "Exception capturando uma ExceptionA: Denominador igual a zero, divisão invalidada";
	}
}
