package com.java8.capitulo4.questoes;

import java.util.Scanner;

public class Exercicio4_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int numeroFatorial = 0;
		int contador = 0;
		int tamanhoE = 0;
		double contadorE = 1;
		double contadorEFatorial = 0;
		double numeroEFatorial = 0;
		double constanteE = 1;
		

		// Exercicio A
		System.out.println("Digite o Fatorial");
		numeroFatorial = scan.nextInt();

		if (numeroFatorial < 0) {
			System.out.println("Não use numero negativo!");
		}

		contador = numeroFatorial - 1;

		while (contador > 0) {

			numeroFatorial *= contador;

			contador -= 1;
		}

		// Exercicio B
		System.out.println("Digite o valor da constante");
		tamanhoE = scan.nextInt();

		while (contadorE <= tamanhoE) {
			numeroEFatorial = contadorE;

			if (contadorE > 1) {
				contadorEFatorial = contadorE - 1;

				while (contadorEFatorial > 0) {
					numeroEFatorial *= contadorEFatorial;
					contadorEFatorial -= 1;
				}

				constanteE += 1 / numeroEFatorial;

			}

			contadorE += 1;

		}

		// Exercicio C

		System.out.println(constanteE);
		System.out.println(numeroFatorial);

		scan.close();
	}

}
