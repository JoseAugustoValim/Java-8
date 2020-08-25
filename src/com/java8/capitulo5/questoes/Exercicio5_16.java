package com.java8.capitulo5.questoes;

import java.util.Scanner;

public class Exercicio5_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int quantidadeAsterisco1 = 0;
		int quantidadeAsterisco2 = 0;
		int quantidadeAsterisco3 = 0;
		int quantidadeAsterisco4 = 0;
		int quantidadeAsterisco5 = 0;
		char asterisco = '*';

		System.out.println("Digite a quantidade de asterisco 1:");
		quantidadeAsterisco1 = scan.nextInt();

		System.out.println("Digite a quantidade de asterisco 2:");
		quantidadeAsterisco2 = scan.nextInt();
		
		System.out.println("Digite a quantidade de asterisco 3:");
		quantidadeAsterisco3 = scan.nextInt();
		
		System.out.println("Digite a quantidade de asterisco 4:");
		quantidadeAsterisco4 = scan.nextInt();
		
		System.out.println("Digite a quantidade de asterisco 5:");
		quantidadeAsterisco5 = scan.nextInt();

		for (int j = 1; j <= quantidadeAsterisco1; j++) {
			System.out.printf(" %c ", asterisco);
		}
		
		System.out.println();
		
		for (int j = 1; j <= quantidadeAsterisco2; j++) {
			System.out.printf(" %c ", asterisco);
		}
		
		System.out.println();
		
		for (int j = 1; j <= quantidadeAsterisco3; j++) {
			System.out.printf(" %c ", asterisco);
		}
		
		System.out.println();

		
		for (int j = 1; j <= quantidadeAsterisco4; j++) {
			System.out.printf(" %c ", asterisco);
		}
		
		System.out.println();

		
		for (int j = 1; j <= quantidadeAsterisco5; j++) {
			System.out.printf(" %c ", asterisco);
		}
		
		scan.close();

	}
}
