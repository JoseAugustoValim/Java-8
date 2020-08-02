package com.java8.capitulo4.questoes;

public class TabuleiroDamas4_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador1 = 0;
		// Criar o contador dentro do while pois se ele ficar fora ele escrevera apenas
		// uma vez
		// ja que esta como uma variavel global e atingira o 8 apenas uma vez
		// Quando o memso fica como variavel local, quando o laço do contador 1 passa a
		// variavel é
		// zerada e pode escrever do 1 ao 8 novamente
		
		while (contador1 != 8) {
			if (contador1 % 2 == 0) {
				int contador2 = 0;
				while (contador2 != 8) {
					System.out.print("* ");
					contador2 += 1;
				}
			} else {
				int contador3 = 0;
				while (contador3 != 8) {

					System.out.print(" *");
					contador3 += 1;
				}
			}
			System.out.println();
			contador1 += 1;
		}
	}

}
