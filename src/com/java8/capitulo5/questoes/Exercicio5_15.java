package com.java8.capitulo5.questoes;

public class Exercicio5_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char asterisco = '*';
		int tamanho = 10;
		char espaco = ' ';

		// a
		for (int i = 1; i <= tamanho; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print(asterisco);
			}
			System.out.println();
		}

		System.out.println();

		// b
		for (int i = tamanho; i >= 0; i--) {
			if (i >= 2) {
				for (int j = i; j > 0; j--) {
					System.out.print(asterisco);
				}
			}
			System.out.println();
		}

		// c

		for (int i = 1; i <= tamanho; i++) {
			for (int j = 1; j <= tamanho; j++) {
				if (i > j) {
					System.out.print(espaco);
				} else {
					System.out.print(asterisco);
				}
			}
			System.out.println();
		}

		// d
		for (int i = tamanho; i >= 0; i--) {

			for (int j = tamanho; j >= 0; j--) {
				if (j > i) {
					System.out.print(asterisco);
				} else {
					System.out.print(espaco);
				}

			}
			System.out.println();
		}
	}

}
