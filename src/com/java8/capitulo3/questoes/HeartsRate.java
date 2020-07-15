package com.java8.capitulo3.questoes;

public class HeartsRate {

	String nome;
	String sobrenome;
	int diaNascimento;
	int mesNascimento;
	int anoNascimento;
	int anoAtual = 2020;
	int frequenciaCardiacaMaxima = 220;
	double frequenciaCardiacaAlvo = 0.5;

	public HeartsRate(String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public int getDiaNascimento() {
		return diaNascimento;
	}

	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public int getMesNascimento() {
		return mesNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public int calculaIdade() {
		return anoAtual - anoNascimento;
	}

	public int calculaFrequenciaCardiacaMaxima() {
		this.frequenciaCardiacaMaxima = frequenciaCardiacaMaxima - calculaIdade();
		return frequenciaCardiacaMaxima;
	}

	public double calculaFrequenciaCardiacaAlvo() {
		this.frequenciaCardiacaAlvo = frequenciaCardiacaMaxima * frequenciaCardiacaAlvo ;
		return frequenciaCardiacaAlvo;
	}
}
