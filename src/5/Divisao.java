/*
 Exercicio 5
 Autor(es): Vitor Luis de Queiroz Batista e Arnald Souza
 Data: 14/10/2022
*/

package exercicio5;

public class Divisao implements IOperacoes{

    String nome = "Divisão";
    float operando1;
    float operando2;
    float resultado;
    int instancias = 0;

    public Divisao() {
        this.instancias++;
    }

    public void setOperando1(float operando1) {
        this.operando1 = operando1;	
    }

    public void setOperando2(float operando2) {
        this.operando2 = operando2;
    }

    public float getResultado() {
        resultado = this.operando1 / this.operando2;

        return resultado;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return instancias;
    }
}
