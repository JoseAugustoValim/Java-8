package com.java8.capitulo5.questoes;

import java.util.Scanner;

public class Exercicio5_31 {

	public static void menu() {
		System.out.println("1 - Comecar");
		System.out.println("0 - Encerrar");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int opcao;
		int respostaInput1;
		int respostaInput2;
		int respostaInput3;
		int respostaInput4;
		int respostaInput5;
		String pergunta1 = "1 O que são mudancas climaticas? %t";
		String pergunta2 = "2 O que é o efeito estufa? %t";
		String pergunta3 = "3 Quais evidencias do aquecimento global? %t";
		String pergunta4 = "4 Quanto a temperatura ira subir no futuro? %t";
		String pergunta5 = "5 Como a mudanca ira climatica nos afetar? %t";
		String resposta1 = "a - mudancas no clima e temperatura do planeta b- mudanca na maneira com que os carros circulam c - mudancas no ecossistema global";
		String resposta2 = "a - Concentracao de gases na atmosfera b- Um local para plantas crescerem c - Concentracao do aumento de temperatura";
		String resposta3 = "a - Aumento temperatura do planeta b- baterias de celular descarregando rapido c - Rios e oceanos sujos1";
		String resposta4 = "a - 2 a 3 graus por ano b- 30 graus - c - 40 graus";
		String resposta5 = "a - Cidades invadidas por aguas b- Mudancas do ecossistema c - Barata voando?";

		int pontos = 0;
		int erros = 0;

		// Perguntas
		do {
			System.out.println("Bem vindos ao quiz de Aquecimento Global");
			menu();
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				System.out.println(pergunta1);
				System.out.println(resposta1);
				respostaInput1 = scan.next().charAt(0);

				if (respostaInput1 == 'a') {
					pontos += 1;
				} else {
					erros += 1;
				}

				System.out.println(pergunta2);
				System.out.println(resposta2);
				respostaInput2 = scan.next().charAt(0);

				if (respostaInput2 == 'a') {
					pontos += 1;
				} else {
					erros += 1;
				}

				System.out.println(pergunta3);
				System.out.println(resposta3);
				respostaInput3 = scan.next().charAt(0);

				if (respostaInput3 == 'a') {
					pontos += 1;
				} else {
					erros += 1;
				}

				System.out.println(pergunta4);
				System.out.println(resposta4);
				respostaInput4 = scan.next().charAt(0);

				if (respostaInput4 == 'a') {
					pontos += 1;
				} else {
					erros += 1;
				}

				System.out.println(pergunta5);
				System.out.println(resposta5);
				respostaInput5 = scan.next().charAt(0);

				if (respostaInput5 == 'a') {
					pontos += 1;
				} else {
					erros += 1;
				}
				break;
			}

			System.out.println();
			System.out.println("Deseja continuar? Digite 1 para sim e 2 para finalizar.");
		} while (opcao != 0);

		// Mostra as respostas
		System.out.println();
		System.out.println("A sua pontuacao foi de " + pontos + " e de " + erros);
		if (pontos >= 4) {
			System.out.println("Parabéns!");
		} else if (pontos == 3) {
			System.out.println("Você se interessa por aquecimento global");
		} else if (pontos < 3) {
			System.out.println("É o momento de aprimorar seu conhecimento sobre o aquecimento global");
		}

		scan.close();
	}

}
