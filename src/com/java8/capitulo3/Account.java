package com.java8.capitulo3;

public class Account {
	private String name;
	private double balance;

	// contrutor que incializa a classe com um parametro
	// construtor deve ter o mesmo nome da classe
	public Account(String name, double balance) {
		this.name = name;

		if (balance > 0.0) {
			this.balance = balance;
		}
	}

	// atribui o valor do parametro name ao atributo name
	//altera o valor do atributo
	public void setName(String name) {
		this.name = name;
	}

	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {
			balance += depositAmount;
		}
	}

	//pega o valor do atributo
	public double getBalance() {
		return balance;
	}

	// retorna o valor do atributo name para o argumento
	public String getName() {
		return name;
	}
}
