package com.java8.capitulo4.questoes;

public class Exercicio4_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double populacaoAtual = 690800000.0;
		double taxaCrescimentoPopulacional = 1.2/100;
		int anos = 1;

		while (anos <= 3) {
			populacaoAtual *= (1.0 + taxaCrescimentoPopulacional);
			System.out.printf("Ano:%d População Atual : %,.0f \n" ,anos, populacaoAtual);
            System.out.println();
			anos += 1;
		}

	}

}
