package com.java8.capitulo5.questoes;

import java.util.Scanner;

public class Exercicicio5_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int dia = 0;

		System.out.printf("Digite o dia antes do Natal: ");
		dia = scan.nextInt();

		switch (dia) {
		case 1:
			System.out.println("On the first day of Christmas");
			break;
		case 2:
			System.out.println("On the second day of Christmas");
			break;

		default:
			System.out.println("Por favor são 12 dias");
			break;
		}

		switch (dia) {
		case 1:
			System.out.println("My true love gave to me\n" + "A partridge in a pear tree");
			break;
		case 2:
			System.out.println("My true love gave to me\n" + "Two turtle doves\n" + "And a partridge in a pear tree");
			break;

		}

		scan.close();

	}

}
