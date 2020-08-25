package com.java8.capitulo5.questoes;

public class Exercicio5_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int impar = 1;
		double valorPi = 0;
		int posicao = 0;

		for (int i = 1; i <= 200000; i++) {
			double numeroAtual = 0.0;

			if (i % 2 == 0) {
				numeroAtual = (double) -4 / impar;
			} else {
				numeroAtual = (double) 4 / impar;
			}
			impar += 2;
			valorPi += numeroAtual;
			System.out.println(valorPi);

			if (valorPi < 3.14159) {
				posicao = i;
				break;
			}
		}
		 System.out.println(posicao);
	}
	
}
