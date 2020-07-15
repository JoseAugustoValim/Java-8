package com.java8.capitulo3;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// caso usar o nome de classe totalmente qualificado, não haveria pq importar a
		// classe
		// java.util.Scanner
		Scanner scan = new Scanner(System.in);

		Account myAccount = new Account("José Augusto", 50.00);
		Account myAccount2 = new Account("Maria Custodia", -7.53);

		// o nome inicial será null pois ainda não foi passado argumento para a classe
		System.out.println("Initial Name:" + myAccount2.getName());
//
		System.out.println("Enter deposit amount for account1: ");
		double deposit = scan.nextDouble();
		System.out.println("Adding to account 1: " + deposit);
		myAccount.deposit(deposit);

		String theName = scan.nextLine();
		myAccount.setName(theName);
		System.out.println();
		System.out.println("Balance: " + myAccount.getBalance());

		System.out.println("Enter deposit amount for account2: ");
		double deposit1 = scan.nextDouble();
		System.out.println("Adding to account 1: " + deposit1);
		myAccount2.deposit(deposit1);

		String theName1 = scan.nextLine();
		myAccount.setName(theName1);
		System.out.println();

		// usar string de controle como printf, argumentos printf
		// (string_de_controle,lista_de_argumentos);
		System.out.println("Balance: " + myAccount2.getBalance());
		scan.close();

		// classes no mesmo pacote são importadas explicitamente
	}

}
