package com.java8.capitulo6.questões;

import java.util.Scanner;

public class Exercicio6_14 {

	public static int exponeciacao(int base, int expoente) {
		int baseFuncao = 1;
		int expoenteFuncao = expoente;

		for (int i = 1; i <= expoenteFuncao; i++) {
			baseFuncao *= base;
		}
		return baseFuncao;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int base = 0;
		int expoente = 0;
		int potencia = 0;

		System.out.println("Digite o valor da base:");
		base = scan.nextInt();

		System.out.println("Digite o valor do expoente:");
		expoente = scan.nextInt();

		potencia = exponeciacao(base, expoente);

		System.out.println("Resultado é: " + potencia);

		scan.close();
	}

}
