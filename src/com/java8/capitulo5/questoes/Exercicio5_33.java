package com.java8.capitulo5.questoes;

public class Exercicio5_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0;
		double usuarioInicial = 1000000000;
		double taxaCrescimento = 0.04;
		int mes = 0;

		System.out.println("Facebook atingiu 11 bilhao de usurios em 2016");

		do {
			total = usuarioInicial * Math.pow(1.0 + taxaCrescimento, mes);
			mes += 1;
		} while (total <= 1500000000);
		
		System.out.println("Numero de meses pra atingir 1.500.000.000 sera de " + mes + "meses");
	}

}
