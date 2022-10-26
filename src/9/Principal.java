package poo_exercicios_l2;
/*
 Exercicio 9
 Autor(es): Vitor Luis de Queiroz Batista e Arnald Souza
 Data: 16/10/2022
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
	public interface IComida{
		public float getCalorias();
		public String getNome();
		public float conversaoCaloriasParaG();
	}
	public class Comida implements IComida{
		private float massaEmGrama;
		private float caloriaPorGrama;
		private String nomeComida;
		
		public Comida(String nome, float massa, float calpg){
			this.massaEmGrama = massa;
			this.caloriaPorGrama = calpg;
			this.nomeComida = nome;
		}
		
		public float getCalorias(){
			return this.massaEmGrama * this.caloriaPorGrama;
		}
		
		public float conversaoCaloriasParaG(){
			//1 caloria equivale a 0.129598 grama.
			return this.getCalorias() * 0.129598f;
		}
		
		public String getNome(){
			return this.nomeComida;
		}
	} 
	
	public abstract class absCliente{
		private String nome;
		private float massaEmG;
		private float massaEmKg;

		public absCliente(String nome, float massaKg) {
			this.nome = nome;
			this.massaEmKg = massaKg;
			this.massaEmG = massaKg * 1000;
		}
		
		public String getNome(){
			return this.nome;
		}
		
		public float getMassaEmKg(){
			return this.massaEmKg;
		}
		public float getMassaEmG(){
			return this.massaEmKg * 1000;
		}
		
		public void comer(IComida comida){
			this.massaEmG = comida.conversaoCaloriasParaG() + this.massaEmG;
			this.massaEmKg = this.massaEmG / 1000f;
		}
	}
	public class Cliente extends absCliente{
		public Cliente(String nome, float massa) {
			super(nome, massa);
		}
		
		public String toString(){
			return "Nome: " + this.getNome() +
				   "\nMassa em Kg: " + this.getMassaEmKg();
		}
	}
	
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

