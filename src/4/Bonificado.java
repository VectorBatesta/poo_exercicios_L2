
package poo_exercicios_l2;

public class Bonificado extends Assalariado{
	private float bonificacao;

	public Bonificado(
			String nome,
			String sobrenome,
			float salarioBase,
			float bonificacao,
			float salarioSemanal){
		super(nome, sobrenome, salarioBase, salarioSemanal);
		this.bonificacao = bonificacao;
	}

	public float ganhos(){
		return (this.getSalario() + this.getSalarioSemanal() + this.bonificacao);
	}
	public String imprimir(){
		return ("Informacao do usuario Bonificado: " + this.getInfo());
	}
}