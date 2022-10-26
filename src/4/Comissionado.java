package poo_exercicios_l2;

public class Comissionado extends Empregado{
	private float taxaComissao;

	public Comissionado(
			String nome,
			String sobrenome,
			float salarioBase,
			float taxaComissao){
		super(nome, sobrenome, salarioBase);
		this.taxaComissao = taxaComissao;
	}

	public float ganhos(){
		return (this.getSalario() + this.taxaComissao);
	}
	public String imprimir(){
		return ("Informacao do usuario Comissionado: " + this.getInfo());
	}
}