package com.java8.capitulo5.questoes;

public class Exercicio5_12 {
	public static void main(String[] args) {
		int produto = 1;

		for (int i = 1; i <= 15; i++) {
			if (i % 2 != 0) {
				produto *=  i;
			}
		}
		
		System.out.println(produto);

	}
}
