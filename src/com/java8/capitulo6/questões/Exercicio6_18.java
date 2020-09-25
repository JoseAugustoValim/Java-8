package com.java8.capitulo6.questões;

import java.util.Scanner;

public class Exercicio6_18 {

	public static void quadradoAsterisco(int quantidade) {
		int quantidadeAsterisco = quantidade;
		char asterisco = '*';

		for (int i = 1; i <= quantidadeAsterisco; i++) {
			for (int j = 1; j <= quantidadeAsterisco; j++) {
				 System.out.printf("%s",asterisco);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int quantidade = 0;

		System.out.println("Digite o tmanho quadrado lembrando que obedecera a regra de n x n.");
		quantidade = scan.nextInt();

		quadradoAsterisco(quantidade);
		
		scan.close();
	}
}
