package poo_exercicios_l2;
/*
 Exercicio 1
 Autor(es): Vitor Luis de Queiroz Batista e Arnald Souza
 Data: 02/10/2022
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
	public class Animal{
		public String nome;
		public Animal(){
			this.nome = "Sem nome";
		}
		public Animal(String nome){
			this.nome = nome;
		}
		
		public String toString(){
			return this.nome;
		}
	}
	
	public class Anfíbio extends Animal{
		protected String quantidadeEscamas;
		public Anfíbio(){
			super();
			this.quantidadeEscamas = "pouco";
		}
		public Anfíbio(String nome){
			super(nome);
			this.quantidadeEscamas = "pouco";
		}
	}
	public class Terrestre extends Animal{
		protected String quantidadePelos;
		public Terrestre(){
			super();
			this.quantidadePelos = "pouco";
		}
		public Terrestre(String nome){
			super(nome);
			this.quantidadePelos = "pouco";
		}
	}
	
	public class Sapo extends Anfíbio{
		public Sapo(){
			super();
		}
		public Sapo(String nome){
			super(nome);
		}
	}
	public class Rã extends Anfíbio{
		public Rã(){
			super();
		}
		public Rã(String nome){
			super(nome);
		}
	}
	public class Leão extends Terrestre{
		public Leão(){
			super();
		}
		public Leão(String nome){
			super(nome);
		}
	}
	public class Macaco extends Terrestre{
		public Macaco(){
			super();
		}
		public Macaco(String nome){
			super(nome);
		}
	}
	
	public void iniciar(){
		ArrayList<Animal> lista = new ArrayList<>();
		Animal novoAnimal = new Animal();
		
		novoAnimal = new Sapo("Bufo bufo");
		lista.add(novoAnimal);
		
		novoAnimal = new Rã("Ranidae");
		lista.add(novoAnimal);
		
		novoAnimal = new Leão("Panthera leo");
		lista.add(novoAnimal);
		
		novoAnimal = new Macaco("Primates");
		lista.add(novoAnimal);
		
		for(Animal i : lista){
			System.out.println(i);
		}
	}
	
	public static void main(String [] args){
		Principal p = new Principal();
		p.iniciar();
	}
}

