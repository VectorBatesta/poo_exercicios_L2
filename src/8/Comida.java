package poo_exercicios_l2;

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