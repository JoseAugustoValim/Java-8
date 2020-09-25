package com.java8.capitulo6.questões;

import java.util.Scanner;

public class Exercicio6_17 {

	public static boolean ePar(int numero) {
		int numeroTeste = numero;
		boolean resultadoTeste = true;

		if (numeroTeste % 2 != 0) {
			resultadoTeste = false;
		}
		return resultadoTeste;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		boolean resultado = true;

		System.out.println("Digite o primeiro numero");
		numero1 = scan.nextInt();
		resultado = ePar(numero1);
		if (resultado == true) {
			System.out.println("É par!");
		} else {
			System.out.println("É impar!");
		}

		System.out.println("Digite o segundo numero");
		numero2 = scan.nextInt();
		resultado = ePar(numero2);
		if (resultado == true) {
			System.out.println("É par!");
		} else {
			System.out.println("É impar!");
		}

		System.out.println("Digite o terceiro numero");
		numero3 = scan.nextInt();
		resultado = ePar(numero3);
		System.out.println(resultado);
		if (resultado == true) {
			System.out.println("É par!");
		} else {
			System.out.println("É impar!");
		}

		scan.close();

	}

}
