package br.com.rogersantos;

public class CalculoMedio {
	
	public static void main(String args[]) {
		Notas notasRoger = new Notas(10, 9, 8, 10); 
		System.out.println("A média do aluno foi: " + notasRoger.calculaMedia());
		System.out.println(notasRoger.verificaAprovacao(notasRoger.calculaMedia(), 6));		
	}
}
