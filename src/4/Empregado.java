package poo_exercicios_l2;

public abstract class Empregado{
	private String nome;
	private String sobrenome;
	private float salarioBase;

	public Empregado(String nome, String sobrenome, float salarioBase){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioBase = salarioBase;
	}

	protected float getSalario(){
		return this.salarioBase;
	}
	protected String getInfo(){
		return (this.nome + this.sobrenome + Float.toString(salarioBase));
	}

	public abstract float ganhos();
	public abstract String imprimir();
}