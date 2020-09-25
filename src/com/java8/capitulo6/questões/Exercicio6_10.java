package com.java8.capitulo6.questões;

import java.util.Scanner;

public class Exercicio6_10 {

	public static double arredondaInteiro(double x) {
		double y = Math.floor(x + 0.5);
		return y;

	}

	public static void menu() {
		System.out.println("1  - Arredondamento pra inteiro");
		System.out.println("2  - Arredondamento pra centenas");
		System.out.println("3  - Arredondamento pra milhares");
		System.out.println("4  - Arredondamento pra milhoes");

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double y = 0;
		double x = 0;
		int opcao = 0;

		menu();

		System.out.println("Digite escolha a opção de arredontamento depois o valor a ser arredondado");
		opcao = scan.nextInt();

		switch (opcao) {
		case 1:
			x = scan.nextDouble();
			y = arredondaInteiro(x);
			System.out.println("Novo Número Aredondado " + y);
			break;
		default:
			System.out.println("Opcao Inválida!");
		}

		System.out.println(y);

		scan.close();
	}
}
