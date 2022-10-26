/*
	Exercicio 7
	Autor(es): Vitor Luis de Queiroz Batista e Arnald Souza
	Data: 12/10/2022
*/
package exercicio7;

import java.io.IOException;

public class Principal {

    public Principal() {
    }

    public static void main(String[] args) {

        int [] numero = {3, 6, 9, 12, 15, 18};
        int [] denominador = {3, 2, 4, 12, 0, 3};

        for(int i = 0 ; i < numero.length; i++) {
            try {
                if(denominador[i] == 0) {
                    throw new ExceptionA(numero[i], denominador[i]); 
                }
                if(numero[i] % denominador[i] != 0 ) {
                    throw new ExceptionB(numero[i], denominador[i]);
                }
                System.out.println("i = "+i +": "+numero[i]+"/"+denominador[i] + "=" + numero[i]/denominador[i]);

            }catch(Exception e){
                e.printStackTrace();
            }
        }

        System.out.println("\n\n\n");

        try {
            throw new IOException();
        }
        catch(Exception e) {
            System.out.println("Exception capturando uma IOException:");
            e.printStackTrace();
        }

        try {
            throw new NullPointerException();
        }catch(Exception e){
            System.out.println("Exception capturando uma NullPointerException:");
            e.printStackTrace();	
        }
    }
}
