package com.java8.capitulo4;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		// inicializaçao
		int total = 0;
		int gradeCounter = 0;

		// solicita a entrada e le a nota do usuario
		System.out.println("Enter grade -1 to quit: ");
		int grade = scan.nextInt();

		// fase de processamento utiliza repetição controlada por contador
		while (grade != -1) { // loop 10 vezes
			total += grade; // adiciona grade a total
			gradeCounter += 1; // incrementa contador 1
			System.out.println("Enter grade"); // prompt
			grade = scan.nextInt(); // insere proxima nota

		}
		// termino

		if (gradeCounter != 0) {
			double average = (double) total / gradeCounter; // divisao inteiro produz resultado inteiro

			// exibe o total e amedia das notas
			System.out.printf(" Total of all 10 grades is %d%n", total);
			System.out.printf("Class average is %d%n ", average);
		} else {
			System.out.println("No grades were entered");
		}

		scan.close();
	}

}
