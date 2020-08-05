package com.java8.capitulo4.questoes;

import java.util.Scanner;

public class Exercicio4_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int codigoOriginal = 0;
		int contador1 = 0;
		int algarismo = 0;
		int codigoInicio = 0;
		int codigoAntesTroca = 0;
		int contadorSoma = 1;
		int chaveCriptografia = 7;
		int chaveCriptografia2 = 10;
		
		System.out.println("Digite o codigo de 1000 a 9999");
		codigoOriginal = scan.nextInt();

		if (codigoOriginal > 999 && codigoOriginal < 10000) {
			contador1 = codigoOriginal;

			while (contador1 > 0) {

				algarismo = contador1 % 10;
				codigoInicio = ((algarismo * chaveCriptografia) % chaveCriptografia2);
				codigoAntesTroca += codigoInicio * contadorSoma;
				contadorSoma *= 10;
				contador1 /= 10;

			}

			System.out.println("Código Convertido: " + codigoAntesTroca);
		} else {
			System.out.println("Numero Inválido!");
		}
		scan.close();
	}

}
