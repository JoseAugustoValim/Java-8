package com.java8.capitulo3.questoes;

public class ClasseDate {
	int mes;
	int dia;
	int ano;

	public ClasseDate(int mes, int dia, int ano) {
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}

	public int setDia(int dia) {
		this.dia = dia;
		return dia;
	}

	public int setMes(int mes) {
		this.mes = mes;
		return mes;
	}

	public int setAno(int ano) {
		this.ano = ano;
		return ano;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public void displayDate() {
		System.out.println(dia + "/" + mes + "/" + ano);
	}

}
