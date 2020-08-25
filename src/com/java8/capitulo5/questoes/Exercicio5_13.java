package com.java8.capitulo5.questoes;

public class Exercicio5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fatorial = 1;

		System.out.printf("%s%10s %n", "Numero", "Fatorial");

		for (int i = 2; i <= 20; i++) {
			fatorial=i;
			for (int j = i-1; j > 0; j--) {
				fatorial *= j;
				//System.out.println( fatorial);
			}
			System.out.println(i + "         " + fatorial);
		}

	}

}
