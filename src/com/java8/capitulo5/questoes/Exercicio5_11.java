package com.java8.capitulo5.questoes;

import java.util.Scanner;

public class Exercicio5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int maior = 0;
		int menor = 0;

		System.out.println("Digite o 1 valor: Inteiro Por favor");
		numero = scan.nextInt();

		maior = numero;
		menor = numero;

		for (int i = 1; i <= 9; i++) {
			System.out.printf("Digite o %d valor: Inteiro Por favor\n", i + 1);
			numero = scan.nextInt();

			if (numero > maior) {
				maior = numero;
			} else if (numero < menor) {
				menor = numero;
			}
		}

		System.out.println("Maior Numero " + maior);
		System.out.println("Menor Numero " + menor);
		scan.close();
	}

}
