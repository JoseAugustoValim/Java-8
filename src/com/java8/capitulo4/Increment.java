package com.java8.capitulo4;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// demonstra o operador de pós-incremento
		int c = 5;
		System.out.printf("c before postincrement: %d%n", c); // imprime 5
		System.out.printf("postincrementing c: %d%n", c++); // imprime 5
		System.out.printf(" c after postincrement: %d%n", c); // imprime 6

		System.out.println(); // pula uma linha
		// demonstra o operador de pré-incremento
		c = 5;
		System.out.printf(" c before preincrement: %d%n", c); // imprime 5
		System.out.printf("preincrementing c: %d%n", ++c); // imprime 6
		System.out.printf(" c after preincrement: %d%n", c); // imprime 6
	}

}
