package poo_exercicios_l2;

public abstract class Assalariado extends Empregado{
	private float salarioSemanal;

	public Assalariado(
			String nome,
			String sobrenome,
			float salarioBase,
			float salarioSemanal){
		super(nome, sobrenome, salarioBase);
		this.salarioSemanal = salarioSemanal;
	}

	protected float getSalarioSemanal(){
		return this.salarioSemanal;
	}
}