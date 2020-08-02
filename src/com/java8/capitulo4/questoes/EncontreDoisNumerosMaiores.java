package com.java8.capitulo4.questoes;

import java.util.Scanner;

public class EncontreDoisNumerosMaiores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int numero = 0;
		int maior = 0;
		int segundoMaior = 0;
		int contador = 1;

		System.out.printf("Digite o %d numero: ", contador);
		numero = scan.nextInt();
		maior = numero;

		contador += 1;
		
       //caso seja maior copia o numero pra maior e o segundo maior recebe o maior anterior ou seja o segundo maior
		while (contador <= 10) {
			System.out.printf("Digite o %d numero: ", contador);
			numero = scan.nextInt();
			if (numero > maior) {
				segundoMaior = maior;
				maior = numero;

			} else if (numero > segundoMaior) {
				segundoMaior = numero;
			}

			contador += 1;
		}

		System.out.println("O maior numero é:" + maior);
		System.out.println("O segundo numero é:" + segundoMaior);

		scan.close();
	}

}
