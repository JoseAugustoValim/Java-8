package com.java8.capitulo3.questoes;

import java.util.Scanner;

public class ClaseDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		ClasseDate data = new ClasseDate(0, 0, 0);

		System.out.println("Digite o dia:");
		int dia = scan.nextInt();
		data.setDia(dia);

		System.out.println("Digite o mes:");
		int mes = scan.nextInt();
		data.setMes(mes);

		System.out.println("digite o ano");
		int ano = scan.nextInt();
		data.setAno(ano);

		data.displayDate();
		
		scan.close();
	}
}
