package com.java8.capitulo6.questões;

import java.util.Scanner;

public class Exercicio6_15 {

	public static double hipotenusa(double ladoa, double ladob) {
		double lado1 = Math.pow(ladoa, 2);
		double lado2 = Math.pow(ladoa, 2);
		double soma = lado1 + lado2;
		double hipotenusa = Math.sqrt(soma);

		return hipotenusa;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		double lado1 = 0;
		double lado2 = 0;
		double resultado = 0;

		System.out.println("Digite o valor do lado 1");
		lado1 = scan.nextDouble();

		System.out.println("Digite o valor do lado 2");
		lado2 = scan.nextDouble();

		resultado = hipotenusa(lado1, lado2);

		System.out.println("O valor da hipotenusa é de: " + resultado);
		
		scan.close();
	}

}
