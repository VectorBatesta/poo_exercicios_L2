package poo_exercicios_l2;

public class Cliente extends absCliente{
	public Cliente(String nome, float massa) {
		super(nome, massa);
	}

	public String toString(){
		return "Nome: " + this.getNome() +
			   "\nMassa em Kg: " + this.getMassaEmKg();
	}
}