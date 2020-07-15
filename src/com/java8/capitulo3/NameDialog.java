package com.java8.capitulo3;

import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// pede para o usuario inserir seu nome
		
		String name = JOptionPane.showInputDialog("What's your name?");
		
		//cria a mensagem
		String message = String.format("Welcome,%s,to Java Programming!", name);
		
		// exibe a mensagem para cumprimentar o usúario pelo nome
		JOptionPane.showMessageDialog(null, message);
	}

}
