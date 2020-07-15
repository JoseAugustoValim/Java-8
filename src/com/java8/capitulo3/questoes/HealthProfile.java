package com.java8.capitulo3.questoes;

public class HealthProfile {
	String nome;
	String sobrenome;
	String sexo;
	double peso;
	double altura;
	int diaNascimento;
	int mesNascimento;
	int anoNascimento;
	int anoAtual = 2020;
	int frequenciaCardiacaMaxima = 220;
	double frequenciaCardiacaAlvo = 0.5;

	public HealthProfile(String nome, String sobrenome, String sexo, int diaNascimento, int mesNascimento,int anoNascimento, double peso, double altura) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
		this.peso = peso;
		this.altura = altura;
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

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
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
		this.frequenciaCardiacaAlvo = frequenciaCardiacaMaxima * frequenciaCardiacaAlvo;
		return frequenciaCardiacaAlvo;
	}

	public double calculaIMC() {
		double imc = peso * Math.pow(altura, 2);
		return imc;
	}
}
