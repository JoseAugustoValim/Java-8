package com.java8.capitulo6.questões;

import java.util.Scanner;

public class Exercicio6_9 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double y = 0;
		double x = 0;

		do {
			System.out.println("Digite o valor em Double por favor:");
			x = scan.nextDouble();
			y = Math.floor(x + 0.5);

			System.out.println(y);
		} while (x != 0);

		scan.close();
	}
}
