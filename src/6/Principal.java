
/*
 Exercicio 6
 Autor(es): Vitor Luis de Queiroz Batista e Arnald Souza
 Data: 18/10/2022
*/

package exercicio6;

public class Principal {

    public class ExceptionA extends Exception {
    	public ExceptionA(){
		
	}
    }
    
    public class ExceptionB extends ExceptionA {
    	public ExceptionB(){
		super();
	}
    }

    public class ExceptionC extends ExceptionB {
        public ExceptionC(){
		super();
	}
    }       
    
    public static void main(String[] args) {
        try{
		exceptionC;
	}
	catch{
		ExceptionC exc = new ExceptionC();
	}
    }
    
}
