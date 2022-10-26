package poo_exercicios_l2;
/*
	A)	Nome membro 1: Vitor Luis de Queiroz Batista;
		RA membro 1: 2104679;
		(só 1 membro)
	B)	NÃO! Errado.
		Isso se deve pois "Maria" é um valor de String, e não float, o qual o
		método "lerSaldo" recebe como Scanner. [entrada.nextFloat()]
		O ouptut também está incorreto, pois no código não há nenhum método
		que imprima String (não há nenhum método que imprima algo após o input).

	C)		Movido o scanner de entrada de lerSaldo pois ler saldo do
		restaurante não é preciso de entrada;
			Adicionado membro "tesouraria" para ser lido em lerSaldo;
			Adicionado método "pagamento" para interagir com tesouraria,
		adicionado na interface também;
			Adicionado classe "Alimento" para interagir com o método pagamento;
			Adicionado membros na classe "Alimento" para ter coesão com o método
		pagamento e funcionar com tesouraria;
			Adicionado membro na classe "Restaurante" para ter em contexto os
		alimentos no restaurante, como ArrayList;
			Adicionado detecção de pagamento e impressão de troco;
			Adicionado detecção se foi pago menos que esperado;

		Obs: parece que adicionei muita coisa porém eu tive que adicionar o
	que era necessário para fazer sentido com o que eu fiz primeiramente, que
	foi arrumar o código em questão do método "lerSaldo" o qual não fez muito
	sentido com um input.

		Dica para o próximo grupo: o pagamento poderia detectar qual alimento o
	usuário comprou, colocar como referência no método "pagamento".
		Também seria preferível se a inicialização de almoço fosse feita em
	outro método dentro do restaurante, nomeado como "registrarNovoAlimento",
	por exemplo.

	D)	input:
			4
		output:
			Quanto foi pago: 4
			Troco: 0.5
			Tesouraria atual: 3.5

*/

import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
	public interface IRestaurante{
		public abstract void lerSaldo();
		public abstract void pagamento();
	}

	public class Restaurante implements IRestaurante{
		private float tesouraria;
		private ArrayList<Alimento> alimentos;
		
		/* Inicializa os objetos e membros iniciais
		*/
		public Restaurante(){
			alimentos = new ArrayList<>();
			Alimento almoco = new Alimento("Almoco", 3.5f);
			this.alimentos.add(almoco);
			this.tesouraria = 0f;
		}
		
		//Imprime quanto de dinheiro o restaurante tem.
		public void lerSaldo(){
			System.out.println("\nSaldo: " + this.tesouraria);
		}
		//Faz um pagamento que alguém comprar.
		public void pagamento(){
			Alimento compra = alimentos.get(0);
			float valorParaPagar = compra.preco;
			
			System.out.println("Valor para pagar: " + valorParaPagar);
			
			System.out.print("\nQuanto foi pago: ");
			Scanner entrada = new Scanner(System.in);
			float valorPago = entrada.nextFloat();
			
			if (valorPago - valorParaPagar < 0){
				System.err.println("ERRO: valor pago abaixo do preco!");
				System.exit(1);
			}
			
			this.tesouraria =+ valorParaPagar;
			
			System.out.println("Troco: " + (valorPago - valorParaPagar)
							+  "\nTesouraria atual: " + this.tesouraria);
		}
	}
	
	public class Alimento{
		public String nome;
		public float preco;
		
		public Alimento(String nome, float preco){
			this.nome = nome;
			this.preco = preco;
		}
	}
	
	
	public void iniciar(){
		IRestaurante RU = new Restaurante();
		RU.lerSaldo();
		RU.pagamento();
	}
	
	public static void main(String [] args){
		Principal p = new Principal();
		p.iniciar();
	}
}

