package com.java8.capitulo5.questoes;

import java.util.Scanner;

public class Exercicio5_32 {

	public static void menu() {
		System.out.println("1 cadastrar despesa Moradia");
		System.out.println("2 cadastrar despesa Alimentacao");
		System.out.println("3 cadastrar despesa Vestuario");
		System.out.println("4 cadastrar despesa Transporte");
		System.out.println("5 cadastrar despesa Educação");
		System.out.println("0 fechar sistema");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int opcao;
		double moradia = 0;
		double alimentacao = 0;
		double vestuario = 0;
		double transporte = 0;
		double educacao = 0;
		double total = 0;

		System.out.println("Bem Vindo ao programa nacional de Fair Tax");
		System.out.println("Estaremos pedindo para você usuário os seus gastos com determinads depesas");
		System.out.println("Digite os valores utlizando . para centavos, exemplo (2.50 serão 2 reais e 50 centavos");
		System.out.println("Por favor não se esqueça dos pontos");
		System.out.println(
				"Nosso sistema ainda nao possui a opcao de retirar um cadastro por isso apos cadastrar um despesa fica impossivel deleta-la");

		do {
			menu();
			System.out.println("Digite a opcao que deseja");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Quanto gasta com moradia?");
				moradia = scan.nextDouble();
				break;

			case 2:
				System.out.println("Quanto gasta com alimentação?");
				alimentacao = scan.nextDouble();
				break;

			case 3:
				System.out.println("Quanto gasta com vestuario?");
				vestuario = scan.nextDouble();
				break;

			case 4:
				System.out.println("Quanto gasta com transporte?");
				transporte = scan.nextDouble();
				break;

			case 5:
				System.out.println("Quanto gasta com educacao?");
				educacao = scan.nextDouble();
				break;

			default:
				System.out.println("Opcao Inválida!");
				break;
			}

			System.out.println("Deseja continuar cadastrando? Digite 1 para sim e 0 para não");
			opcao = scan.nextInt();

		} while (opcao != 0);

		total = moradia + alimentacao + vestuario + transporte + educacao;

		System.out.println("O seu total de gastos é de " + total);
		System.out.println("O FairTax1 aplicado ao seu rendimento é de :" + total * 0.23);
		System.out.println("Com o FairTax2 aplicado ao seu rendimento é de :" + total * 0.30);
		
		scan.close();
	}

}
