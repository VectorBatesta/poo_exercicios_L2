package poo_exercicios_l2;
/*
 Exercicio 3
 Autor(es): Vitor Luis de Queiroz Batista e Arnald Souza
 Data: 12/10/2022
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
	public interface IConversorMoeda{
		public float getConversaoDolar();
	}
	
	public class BitCoin implements IConversorMoeda{
		private float valorBTC;

		public BitCoin(){
			this.valorBTC = 1;
		}
		public BitCoin(float valuenew){
			this.valorBTC = valuenew;
		}
		public String proofOfWork(){
			return Float.toString(this.valorBTC);
		}
		
		public float getConversaoDolar(){
			return this.valorBTC * 19000; //BTC valendo atualmente 19k dolar
		}
	}
	
	public class Euro implements IConversorMoeda{
		private float valorEuro;
		
		public Euro(){
			this.valorEuro = 1;
		}
		public Euro(float value){
			this.valorEuro = value;
		}
		
		public float getConversaoDolar(){
			return this.valorEuro * 0.97f; //EUR valendo atualmente 0.97 dolar
		}
	}
	
	public class Real implements IConversorMoeda{
		private float valorReal;
		
		public Real(){
			this.valorReal = 1;
		}
		public Real(float value){
			this.valorReal = value;
		}
		
		public float getConversaoDolar(){
			return this.valorReal * 0.19f; //real valendo atualmente 0.19 dolar
		}
	}
	
	public void iniciar(){
		IConversorMoeda novamoeda;
		ArrayList<IConversorMoeda> lista = new ArrayList<>();
		
		novamoeda = new Euro(600);
		lista.add(novamoeda);
		novamoeda = new BitCoin(0.1929f);
		lista.add(novamoeda);
		novamoeda = new Real(2000);
		lista.add(novamoeda);
		
		int N = 1;
		for (IConversorMoeda i : lista){
			System.out.println(
				"Moeda " + N + " vale " +
				Float.toString( i.getConversaoDolar() )
				+ " dólares;"
			);
			N++;
		}
	}
	
	public static void main(String [] args){
		Principal p = new Principal();
		p.iniciar();
	}
}

