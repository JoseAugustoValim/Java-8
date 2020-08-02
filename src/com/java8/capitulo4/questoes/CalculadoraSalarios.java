package com.java8.capitulo4.questoes;

import java.util.Scanner;

public class CalculadoraSalarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int horaTrabalhadaEmpregado1 = 0;
		int horaTrabalhadaEmpregado2 = 0;
		int horaTrabalhadaEmpregado3 = 0;
		double valorHoraTrabalhada = 0;
		double valorHoraExtraEmpregado1 = 0;
		double valorHoraExtraEmpregado2 = 0;
		double valorHoraExtraEmpregado3 = 0;
		double salarioBrutoEmpregado1 = 0;

		System.out.println("Digite a quantida de horas trabalhadas do empregado 1:");
		horaTrabalhadaEmpregado1 = scan.nextInt();

		System.out.println("Digite a quantida de horas trabalhadas do empregado 2:");
		horaTrabalhadaEmpregado2 = scan.nextInt();

		System.out.println("\"Digite a quantida de horas trabalhadas do empregado 3:");
		horaTrabalhadaEmpregado3 = scan.nextInt();

		System.out.println("Valor da hora trabalhada:");
		valorHoraTrabalhada = scan.nextDouble();

		if (horaTrabalhadaEmpregado1 > 40) {
			valorHoraExtraEmpregado1 = (horaTrabalhadaEmpregado1 - 40) * (valorHoraTrabalhada * 0.5);
			salarioBrutoEmpregado1 = (horaTrabalhadaEmpregado1 * valorHoraTrabalhada);
			
			System.out.println("Salario Bruto empregado 1:" + (valorHoraExtraEmpregado1 + salarioBrutoEmpregado1));
		} else {
			System.out.println("Salario Bruto empregado 1:" + (horaTrabalhadaEmpregado1 * valorHoraTrabalhada));
		}

		if (horaTrabalhadaEmpregado2 > 40) {
			valorHoraExtraEmpregado2 = (horaTrabalhadaEmpregado2 - 40) * (valorHoraTrabalhada * 0.5);
			System.out.println("Salario Bruto empregado 2:"
					+ ((horaTrabalhadaEmpregado2 * valorHoraTrabalhada) + valorHoraExtraEmpregado2));
		} else {
			System.out.println("Salario Bruto empregado 2:" + (horaTrabalhadaEmpregado2 * valorHoraTrabalhada));
		}

		if (horaTrabalhadaEmpregado3 > 40) {
			valorHoraExtraEmpregado3 = (horaTrabalhadaEmpregado3 - 40) * (valorHoraTrabalhada * 0.5);
			System.out.println("Salario Bruto empregado 3:"
					+ ((horaTrabalhadaEmpregado3 * valorHoraTrabalhada) + valorHoraExtraEmpregado3));
		} else {
			System.out.println("Salario Bruto empregado 3:" + (horaTrabalhadaEmpregado3 * valorHoraTrabalhada));
		}

		scan.close();

	}

}
