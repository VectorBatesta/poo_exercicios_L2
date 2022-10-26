package poo_exercicios_l2;
/*
 Exercicio 4
 Autor(es): Vitor Luis de Queiroz Batista e Arnald Souza
 Data: 14/10/2022
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
	public class InicializaListaObjetos{
		ArrayList<Empregado> lista = new ArrayList<>();
		
		public InicializaListaObjetos(
				float salarioBase,
				float bonificacao,
				float salarioSemanal,
				float taxaComissao,
				int horas){
			Bonificado b1 = new Bonificado("Joao","Silva", salarioBase, bonificacao, salarioSemanal);
			Comissionado c1 = new Comissionado("Maria","Soares", salarioBase, taxaComissao);
			Horista h1 = new Horista("Jomar","Silva Soares", salarioBase, horas);
			lista.add(b1);
			lista.add(c1);
			lista.add(h1);
		}
	}
	
	
	public void iniciar(){
		InicializaListaObjetos triplaEmpregados = new InicializaListaObjetos(1000f, 50f, 100f, 50f, 8);
		
		ArrayList<Empregado> lista = new ArrayList<>();
		lista = triplaEmpregados.lista;
		
		for(Empregado emp : lista){
			emp.imprimir();
			emp.ganhos();
		}
	}
	
	public static void main(String [] args){
		Principal p = new Principal();
		p.iniciar();
	}
}

