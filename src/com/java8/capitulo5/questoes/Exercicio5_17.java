package com.java8.capitulo5.questoes;

import java.util.Scanner;

public class Exercicio5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int opcao1 = -1;
		int numeroProduto = 0;
		int quantidadeVendida = 0;
		double totalProduto1 = 0;
		double totalProduto2 = 0;
		double totalProduto3 = 0;
		double totalProduto4 = 0;
		double totalProduto5 = 0;

		do {
			System.out.println("Digite o numero do Produto");
			numeroProduto = scan.nextInt();

			System.out.println("Digite a quantidade vendida do Produto");
			quantidadeVendida = scan.nextInt();

			switch (numeroProduto) {
			case 1:
				System.out.println("Produto 1: valor 2,98");
				totalProduto1 = quantidadeVendida * 2.98;
				break;

			case 2:
				System.out.println("Produto 2: valor 4,50");
				totalProduto2 = quantidadeVendida * 4.50;
				break;

			case 3:
				System.out.println("Produto 3: valor 9,98");
				totalProduto3 = quantidadeVendida * 9.98;
				break;

			case 4:
				System.out.println("Produto 4: valor 4,49");
				totalProduto4 = quantidadeVendida * 4.49;
				break;
			case 5:
				System.out.println("Produto 5: valor 6,87");
				totalProduto5 = quantidadeVendida * 6.87;
				break;
			}

			System.out.println("Deseja cancelar? Aperte 0");
			opcao1 = scan.nextInt();
		} while (opcao1 != 0);

		System.out.println("Total do produto 1: " + totalProduto1);
		System.out.println("Total do produto 2: " + totalProduto2);
		System.out.println("Total do produto 3: " + totalProduto3);
		System.out.println("Total do produto 4: " + totalProduto4);
		System.out.println("Total do produto 5: " + totalProduto5);

		scan.close();

	}

}
