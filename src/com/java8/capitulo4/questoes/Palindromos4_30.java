package com.java8.capitulo4.questoes;

import java.util.Scanner;

public class Palindromos4_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int numero = 0;
		int relembre = 0;
		int reverso = 0;

		System.out.println("Digite um numero de 1 a 99999");
		numero = scan.nextInt();
		int contador = numero;

		// se dividirmos o numero por 10 ele da o ultimo digito 123 % 10 = 3
		// se divide entao o quociente elimna o ultimo numero 123 = 12
		// Faça o porcentagem e tera o ultmio digito faca a divisao e excluira o ultimo
		// digito
		// Depois faça o ultimo digito * 10 mais o ultimo digito exe. 123 %10 = 3 123/10
		// = 12 o numero inverso é ultimo digito*10+3 isso irá deixar o ultimo digito
		// como algarismo da posição
		while (contador != 0) {
			relembre = contador % 10;
			reverso = reverso * 10 + relembre;
			contador = contador / 10;

		}
		if (reverso == numero) {
			System.out.println("Palindromo");
		} else {
			System.out.println("Nao e palindromo");
		}
		scan.close();
	}

}
