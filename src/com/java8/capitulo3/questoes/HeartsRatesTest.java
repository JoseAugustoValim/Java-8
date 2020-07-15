package com.java8.capitulo3.questoes;

import java.util.Scanner;

public class HeartsRatesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		HeartsRate heartsHate = new HeartsRate("null", "null", 0, 0, 0000);

		System.out.println("Calculadora de frequência cardíaca alvo");
		System.out.println("Digite seu nome:");
		String nome = scan.nextLine();
		heartsHate.setNome(nome);

		System.out.println("Digite seu sobrenome:");
		String sobrenome = scan.nextLine();
		heartsHate.setSobrenome(sobrenome);

		System.out.println("Digite o dia em que nasceu");
		int dia = scan.nextInt();
		heartsHate.setDiaNascimento(dia);

		System.out.println("Digite o mes em que nasceu");
		int mes = scan.nextInt();
		heartsHate.setMesNascimento(mes);

		System.out.println("Digite o ano em que nasceu");
		int ano = scan.nextInt();
		heartsHate.setAnoNascimento(ano);

		System.out.println("Nome: " + heartsHate.getNome());
		System.out.println("Sobrenome: " + heartsHate.getSobrenome());
		System.out.println("Data Nascimento: " + heartsHate.getDiaNascimento() + " " + heartsHate.getMesNascimento()
				+ " " + heartsHate.getAnoNascimento());
		System.out.println("Idade: " + heartsHate.calculaIdade());
		System.out.println("Frequencia Cardiaca Máxima: " + heartsHate.calculaFrequenciaCardiacaMaxima());
		System.out.println("Frequencia Cardiaca alvo: " + heartsHate.calculaFrequenciaCardiacaAlvo());

		scan.close();
	}

}
