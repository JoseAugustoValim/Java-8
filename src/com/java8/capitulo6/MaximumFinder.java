package com.java8.capitulo6;

import java.util.Scanner;

public class MaximumFinder {

	public static double maximum(double x, double y, double z) {

		double maximumValue = x;

		if (y > maximumValue) {
			maximumValue = y;
		}

		if (z > maximumValue) {
			maximumValue = z;
		}

		return maximumValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter three floating - point values separated by spaces");
		System.out.println("Entre com 3 numeros de pontos flutuantes separado por espaço");

		double number1 = scan.nextDouble();
		double number2 = scan.nextDouble();
		double number3 = scan.nextDouble();

		double result = maximum(number1, number2, number3);

		System.out.println("Maximum is: " + result);

		scan.close();
	
		
	}
}

