package com.java8.capitulo4.questoes;

import java.util.Scanner;

public class EquivalenteDecimal4_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int numeroBinario = 0;
		int inversor = 0;
		int algarismo = 1;
		int conversor = 0;

		System.out.println("Digite o numero binário");
		numeroBinario = scan.nextInt();
		int contador = numeroBinario;

		while (contador != 0) {
			inversor = contador % 10;
			conversor += inversor * algarismo;
			contador = contador / 10;
			algarismo *= 2;
		}
		System.out.println();
		System.out.println(conversor);

		scan.close();
	}

}
