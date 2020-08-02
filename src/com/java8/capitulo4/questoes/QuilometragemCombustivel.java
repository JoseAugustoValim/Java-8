package com.java8.capitulo4.questoes;

import java.util.Scanner;

public class QuilometragemCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int quilometrosDirigidos = 0;
		int gasolinaConsumida = 0;
		double consumo = 0;

		System.out.println("digite a quantidade de Quilometros Dirigidos");
		quilometrosDirigidos = scan.nextInt();

		System.out.println("Digite a quantidade de litros de combustivel Consumidos");
		gasolinaConsumida = scan.nextInt();

		consumo = quilometrosDirigidos / gasolinaConsumida;

		System.out.println("Quantidade de km dirigidos:" + quilometrosDirigidos);
		System.out.println("Quantidade de litros de combustivel consumidos:" + gasolinaConsumida);
		System.out.println("Consumo total: " + consumo);

		scan.close();

	}

}
