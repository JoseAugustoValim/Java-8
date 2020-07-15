package com.java8.capitulo3.questoes;

import java.util.Scanner;

public class HealthProfileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		HealthProfile healthProfile = new HealthProfile("null", "null", "null", 0, 0, 0000, 0.0, 0.0);

		System.out.println("Calculadora de frequência cardíaca alvo");
		System.out.println("Digite seu nome:");
		String nome = scan.nextLine();
		healthProfile.setNome(nome);

		System.out.println("Digite seu sobrenome:");
		String sobrenome = scan.nextLine();
		healthProfile.setSobrenome(sobrenome);
		
		System.out.println("Digite seu sexo:");
		String sexo = scan.nextLine();
		healthProfile.setSexo(sexo);

		System.out.println("Digite o dia em que nasceu");
		int dia = scan.nextInt();
		healthProfile.setDiaNascimento(dia);

		System.out.println("Digite o mes em que nasceu");
		int mes = scan.nextInt();
		healthProfile.setMesNascimento(mes);

		System.out.println("Digite o ano em que nasceu");
		int ano = scan.nextInt();
		healthProfile.setAnoNascimento(ano);
		
		System.out.println("Digite seu peso:");
		double peso = scan.nextDouble();
		healthProfile.setPeso(peso);
		
		System.out.println("Digite sua altura");
		double altura = scan.nextDouble();
		healthProfile.setAltura(altura);

		System.out.println("Nome: " + healthProfile.getNome());
		System.out.println("Sobrenome: " + healthProfile.getSobrenome());
		System.out.println("Data Nascimento: " + healthProfile.getDiaNascimento() + " " + healthProfile.getMesNascimento()	+ " " + healthProfile.getAnoNascimento());
		System.out.println("Idade: " + healthProfile.calculaIdade());
		System.out.println("Sexo: " + healthProfile.getSexo());
		System.out.println("Peso: " + healthProfile.getPeso());
		System.out.println("Altura: " + healthProfile.getAltura());
		System.out.println("Frequencia Cardiaca Máxima: " + healthProfile.calculaFrequenciaCardiacaMaxima());
		System.out.println("Frequencia Cardiaca alvo: " + healthProfile.calculaFrequenciaCardiacaAlvo());
		System.out.println("IMC: " + healthProfile.calculaIMC());

		scan.close();
	}

}
