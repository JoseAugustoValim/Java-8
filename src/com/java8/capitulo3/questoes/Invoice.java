package com.java8.capitulo3.questoes;

public class Invoice {
	String numero;
	String descricao;
	int quantidadeComprada;
	double preco;

	public Invoice(String numero, String descricao, int quantidadeComprada, double preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidadeComprada = quantidadeComprada;
		this.preco = preco;

	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}

	public void setPreco(double preco2) {
		this.preco = preco2;
	}

	public String getNumero() {
		return numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public double getPreco() {
		return preco;
	}

	public double getInvoiceAmount() {
		double valor = quantidadeComprada * preco;
		if (valor <=0) {
			valor = 0.0;
		}
		return valor;

	}
}
