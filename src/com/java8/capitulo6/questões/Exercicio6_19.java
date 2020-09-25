package com.java8.capitulo6.questões;

import java.util.Scanner;

public class Exercicio6_19 {

	// TODO Auto-generated method stub

	public static void quadrado(int quantidade, int tipo) {
		int quantidadeTipo = quantidade;
		char asterisco = '*';
		char jogoVelha = '#';

		switch (tipo) {
		case 1:
			for (int i = 1; i <= quantidadeTipo; i++) {
				for (int j = 1; j <= quantidadeTipo; j++) {
					System.out.printf("%s", asterisco);
				}
				System.out.println();
			}
			break;

		case 2:
			for (int i = 1; i <= quantidadeTipo; i++) {
				for (int j = 1; j <= quantidadeTipo; j++) {
					System.out.printf("%s", jogoVelha);
				}
				System.out.println();
			}
			break;
		default:

			System.out.println("Não temos este simbolo em nossa biblioteca");

		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int quantidade = 0;
		int tipo = 0;

		System.out.println("Digite o tmanho quadrado lembrando que obedecera a regra de n x n.");
		quantidade = scan.nextInt();

		do {
			System.out.println("Escolha o tipo de quadrado digite 1 para * e 2 para #.");
			tipo = scan.nextInt();
		} while (tipo != 1 && tipo !=2);

		quadrado(quantidade, tipo);

		scan.close();
	}

}
