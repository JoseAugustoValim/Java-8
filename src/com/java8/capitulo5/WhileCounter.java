package com.java8.capitulo5;

public class WhileCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 1; // variavel de controle
		while (counter <= 10) { // condicao de continuacao do loop
			System.out.printf("%d ", counter);
			counter += 1;// variavel de incremento
		}
		System.out.println();
	}

}
