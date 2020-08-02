package com.java8.capitulo4.questoes;

import java.util.Scanner;

public class CalculadorLimiteCredito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int numeroConta = 0;
		double saldoInicial = 0;
		double totalCobranca = 0;
		double totalCredito = 0;
		double novoSaldo = 0;

		System.out.println("Insira Numero da Conta");
		numeroConta = scan.nextInt();

		System.out.println("Insira Saldo Inicial");
		saldoInicial = scan.nextDouble();

		System.out.println("Cobrança Total");
		totalCobranca = scan.nextDouble();

		System.out.println("Credito Total:");
		totalCredito = scan.nextDouble();

		novoSaldo = saldoInicial + totalCobranca - totalCredito;

		System.out.println("Nuemro da Conta: " + numeroConta);

		System.out.println("O seu novo Saldo é de: " + novoSaldo);

		if (novoSaldo > totalCredito) {
			System.out.println("Limite de Crédito excedido");
		}

		scan.close();

	}

}
