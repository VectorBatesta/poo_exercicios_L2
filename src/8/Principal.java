package poo_exercicios_l2;
/*
 Exercicio 8
 Autor(es): Vitor Luis de Queiroz Batista e Arnald Souza
 Data: 16/10/2022
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
	public void iniciar(){
		IComida arroz = new Comida("Arroz", 200, 1.25f);
		//valor nutricional de arroz equivale a 1.25cal por 1g, ou 125cal por 100g.
		absCliente joao = new Cliente("Joao", 70);
		
		System.out.println("Nome da comida: " + arroz.getNome());
		System.out.println("Quantidade de calorias da comida: " + arroz.getCalorias());
		System.out.println("Quantidade de gramas somente em calorias da comida: " + arroz.conversaoCaloriasParaG());
		
		System.out.println("\nMassa de " + joao.getNome() + " em Kg é: " + joao.getMassaEmKg());
		joao.comer(arroz);
		System.out.println("Massa de " + joao.getNome() + " em Kg após comer arroz"
				+ "(ele absorveu apenas as calorias) é: " + joao.getMassaEmKg());
	}
	
	public static void main(String [] args){
		Principal p = new Principal();
		p.iniciar();
	}
}

