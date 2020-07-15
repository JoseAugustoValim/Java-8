package com.java8.capitulo3.questoes;

public class ClasseAccountModificada {

	private String name;
	private double balance;

	// contrutor que incializa a classe com um parametro
	// construtor deve ter o mesmo nome da classe
	public ClasseAccountModificada(String name, double balance) {
		this.name = name;

		if (balance > 0.0) {
			this.balance = balance;
		}
	}

	// atribui o valor do parametro name ao atributo name
	// altera o valor do atributo
	public void setName(String name) {
		this.name = name;
	}

	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {
			balance += depositAmount;
		}
	}

	public void withdraw(double withdrawAmount) {

		if (withdrawAmount > balance) {
			System.out.println("The withdraw exceed the balance");
		} else {
			balance -= withdrawAmount;
		}
	}

	// pega o valor do atributo
	public double getBalance() {
		return balance;
	}

	// retorna o valor do atributo name para o argumento
	public String getName() {
		return name;
	}
}
