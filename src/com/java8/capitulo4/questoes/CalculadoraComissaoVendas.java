package com.java8.capitulo4.questoes;

import java.util.Scanner;

public class CalculadoraComissaoVendas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		double valorItem = 0;
		double comissao = 0;
		double saida = -1;

		while (saida != 0) {
			System.out.println("Digite o item vendido, digite 0 para parar:");
			valorItem = scan.nextDouble();
			valorItem += valorItem;
			saida = valorItem;
		}

		comissao = (valorItem * 0.9) + 200;

		System.out.println("Valor comissão:" + comissao);
		
		scan.close();
	}

}
