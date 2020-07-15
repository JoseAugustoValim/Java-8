package com.java8.capitulo3.questoes;

import java.util.Scanner;

public class ClasseAccountModificadaTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ClasseAccountModificada myAccount = new ClasseAccountModificada("José Augusto", 50.00);

		System.out.println("Enter withdraw for account1: ");
		double withdraw = scan.nextDouble();
		System.out.println("Withdraw to account 1: " + withdraw);
		myAccount.withdraw(withdraw);;

		System.out.println("Balance to account 1 " + myAccount.getBalance());

	scan.close();
	}

}
