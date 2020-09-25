package com.java8.capitulo6.questões;

import java.util.Scanner;

public class Exercicio6_16 {

	public static boolean multiplo(int numero1, int numero2) {
		int numeroa = numero1;
		int numerob = numero2;
		boolean emultiplo = true;

		if (numeroa % numerob != 0) {
			emultiplo = false;
		}

		return emultiplo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int numero1 = 0;
		int numero2 = 0;
		boolean resultado;

		System.out.println("Digite o primeiro numero: ");
		numero1 = scan.nextInt();

		System.out.println("Digite o segundo numero: ");
		numero2 = scan.nextInt();

		resultado = multiplo(numero1, numero2);

		System.out.println(resultado);

		scan.close();

	}

}
