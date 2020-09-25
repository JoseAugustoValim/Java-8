package com.java8.capitulo6.questões;

import java.util.Scanner;

public class Exercicio6_20 {
	public static void areaCirculo(double raio) {
		double pi = 3.14;
		double area = pi * Math.pow(raio, 2);
		System.out.println(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double raio = 0;

		System.out.println("Digite o raio do circulo:");
		raio = scan.nextDouble();

		areaCirculo(raio);
		scan.close();
	}

}
