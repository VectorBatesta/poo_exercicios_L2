package exercicio5;

/*
 Exercicio 4
 Autor(es): Vitor Luis de Queiroz Batista e Arnald Souza
 Data: 14/10/2022
*/

import java.util.ArrayList;

public class Principal {
	
    public Principal() {
    }

    public static void main(String[] args) {

        float operando1 = 5;
        float operando2 = 7;
        String nome;
        float resultado;
        int instancias;

        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao multi = new Multiplicacao();
        Divisao div = new Divisao();

        ArrayList <IOperacoes> lista = new ArrayList<IOperacoes>();

        lista.add(soma);
        lista.add(sub);
        lista.add(multi);
        lista.add(div);

        for(IOperacoes ope : lista) {
            ope.setOperando1(operando1);
            System.out.println("Operador 1: "+ operando1);
            ope.setOperando2(operando2);
            System.out.println("Operador 2 "+ operando2 + "\n");

            nome = ope.getNome();
            System.out.println("Operação: "+ nome);

            resultado = ope.getResultado();
            System.out.println("Resultado: "+ resultado);

            instancias = ope.getQuantidade();
            System.out.println("Instancias: "+ instancias);

            System.out.println("\n");
        }
    }
}
