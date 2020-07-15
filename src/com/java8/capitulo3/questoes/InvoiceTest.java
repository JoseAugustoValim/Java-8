package com.java8.capitulo3.questoes;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Invoice invoice = new Invoice("001", "Olga Mary", 1, 50.00);
		
		System.out.println("Digite o valor da sua fatura");
		String numeroInvoice = scan.nextLine();
		invoice.setNumero(numeroInvoice);
		
		System.out.println("Digite a descricao do produto");
		String descricao = scan.nextLine();
		invoice.setDescricao(descricao);
		
		System.out.println("Qual quantidade gostaria de comprar?");
		int quantidade = scan.nextInt();
		invoice.setQuantidadeComprada(quantidade);
		
		System.out.println("Qual quantidade preco");
		double preco = scan.nextDouble();
		invoice.setPreco(preco);
		
	
		
		System.out.println(invoice.getNumero());
		System.out.println(invoice.getDescricao());
		System.out.println(invoice.getQuantidadeComprada());
		System.out.println(invoice.getPreco());
		System.out.println(invoice.getInvoiceAmount());
		
		
		
		scan.close();
	}

}
