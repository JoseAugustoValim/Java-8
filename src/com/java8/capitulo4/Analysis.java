package com.java8.capitulo4;

import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// inicializando variaveis nas declaracoes
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;

		// processa 10 alunos utilizando loop controlado por contador
		while (studentCounter <= 10) {
			// solicita ao usuario uma entrada e obte seu valor
			System.out.println("Enter result (1=pass, 2 = fail):");
			int result = scan.nextInt();

			// if else aninhados estrutura while
			if (result == 1) {
				passes += 1;
			} else {
				failures += 1;
			}

			// incrementa contador ate terminar loop
			studentCounter += 1;
		}

		System.out.printf("Passed %d%n Failed%d%n", passes, failures);

		// determina se mais de 8 alunos foram aprovados
		if (passes > 8) {
			System.out.println("Bonus to instructor!");
		}
		
		scan.close();
	}

}
