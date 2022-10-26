package poo_exercicios_l2;
/*
 Exercicio 2
 Autor(es): Vitor Luis de Queiroz Batista e Arnald Souza
 Data: 10/10/2022
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
	public abstract class membroUniversidade{
		public membroUniversidade(){
			
		}
		
		public abstract float pagamento();
		public abstract void metodo2();
		public abstract void metodo3();
		public abstract void metodo4();
		public abstract void metodo5();
	}
	
	public class Administrativo extends membroUniversidade{
		public void Administrativo(){
			
		}
		
		public float pagamento(){
			return 0;
		}
		public void metodo2(){};
		public void metodo3(){};
		public void metodo4(){};
		public void metodo5(){};
	}
	public class Professor extends membroUniversidade{
		public void Professor(){
			
		}
		
		public float pagamento(){
			return 0;
		}
		public void metodo2(){};
		public void metodo3(){};
		public void metodo4(){};
		public void metodo5(){};
	}
	public class Técnico extends membroUniversidade{
		public void Técnico(){
			
		}
		
		public float pagamento(){
			return 0;
		}
		public void metodo2(){};
		public void metodo3(){};
		public void metodo4(){};
		public void metodo5(){};
	}
	public class Bolsista extends membroUniversidade{
		public void Bolsista(){
			
		}
		
		public float pagamento(){
			return 0;
		}
		public void metodo2(){};
		public void metodo3(){};
		public void metodo4(){};
		public void metodo5(){};
	}

	public void iniciar(){
		ArrayList<membroUniversidade> lista = new ArrayList<>();
		
		membroUniversidade membro = new Administrativo();
		lista.add(membro);
		membro = new Professor();
		lista.add(membro);
		membro = new Técnico();
		lista.add(membro);
		membro = new Bolsista();
		lista.add(membro);
		
		for(membroUniversidade i : lista)
			System.out.println(i.getClass());
	}
	
	public static void main(String [] args){
		Principal p = new Principal();
		p.iniciar();
	}
}

