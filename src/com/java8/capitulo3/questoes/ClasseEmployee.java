package com.java8.capitulo3.questoes;

public class ClasseEmployee {
	String nome;
	String sobrenome;
	double salarioMensal;

	public ClasseEmployee(String nome, String sobrenome, double salarioMensal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setSalario(double salarioMensal) {
		if (salarioMensal <= 0) {
			//deve-se montar o if para que receba a alteração antes de receber o arguemento
		} else {
			this.salarioMensal = salarioMensal;
		}
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public double getSalario() {

		return salarioMensal;
	}

}
