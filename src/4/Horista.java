package poo_exercicios_l2;

public class Horista extends Empregado{
	private float taxaHoras;
	private int horas;

	public Horista(
			String nome,
			String sobrenome,
			float salarioBase,
			int horas){
		super(nome, sobrenome, salarioBase);
		this.horas = horas;
		this.taxaHoras = 50f;
	}

	public float ganhos(){
		return (this.getSalario() + this.horas * this.taxaHoras);
	}
	public String imprimir(){
		return ("Informacao do usuario Horista: " + this.getInfo());
	}
}