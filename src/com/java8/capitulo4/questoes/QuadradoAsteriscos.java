package com.java8.capitulo4.questoes;

import java.util.Scanner;

public class QuadradoAsteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int tamanho = 0;
		char asterisco = '*';
		char space = ' ';
		int contador = 1;

		System.out.println("Por favor digite o tamanho do quadrado:");
		tamanho = scan.nextInt();

		if (tamanho < 1) {
			tamanho = 1;
		} else if (tamanho > 20) {
			tamanho = 20;
		}

		// ********************
		// * *
		// ********************

		// consiste em um while que apresenta todos asteriscos no indice 1 e 20
		// caso não seja ele irá mostrar espaço
		
		while (contador <= tamanho) {
			if (contador == 1 || contador == tamanho) {
				int indice = 1;

				while (indice <= tamanho) {
					System.out.print(asterisco);
					indice += 1;
				}

			} else {
				int indice2 = 1;

				while (indice2 <= tamanho) {
					if (indice2 == 1 || indice2 == tamanho) {
						System.out.print(asterisco);
					} else {
						System.out.print(space);
					}
					indice2 += 1;
				}

			}
			System.out.println();
			contador += 1;
		}

		scan.close();

	}

}
