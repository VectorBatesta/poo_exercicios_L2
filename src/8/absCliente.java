package poo_exercicios_l2;

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