package com.java8.capitulo6.questões;

import java.util.Scanner;

public class Exercicio6_8 {

	public static double calculaTarifa(int horas) {
		int numeroHoras = horas;
		double valor = 0;

		if (numeroHoras == 24) {
			valor = 10;
		} else if (numeroHoras > 3) {
			valor = (numeroHoras * 2) + (numeroHoras * 0.50);
		} else {
			valor = (numeroHoras * 2);
		}

		return valor;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numeroHoras = 0;
		double valor;

		System.out.println("Digite o numero de horas: As horas só podem ser de 1 a 9 horas");
		numeroHoras = scan.nextInt();

		while (numeroHoras <= 0 || numeroHoras > 24) {
			System.out.println("Esse numero de horas é invalido!");
			numeroHoras = scan.nextInt();
		}

		if (numeroHoras == 24) {
			valor = calculaTarifa(numeroHoras);
		}

		valor = calculaTarifa(numeroHoras);

		System.out.println("O valor foi de R$ " + valor + " reais");

		scan.close();
	}

}
