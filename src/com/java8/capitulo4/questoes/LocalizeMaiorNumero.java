package com.java8.capitulo4.questoes;

import java.util.Scanner;

public class LocalizeMaiorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int numero;
		int maior;
		int contador = 1;

		System.out.printf("Digite o %d numero: ", contador);
		numero = scan.nextInt();
		maior = numero;
		contador += 1;

		while (contador <= 10) {
			System.out.printf("Digite o %d numero: ", contador);
			numero = scan.nextInt();
			if (numero > maior) {
				maior = numero;
			}
			contador += 1;
		}

		System.out.println("O maior numero é:" + maior);

		scan.close();
	}

}
