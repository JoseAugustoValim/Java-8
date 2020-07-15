package com.java8.capitulo3.questoes;

import java.util.Scanner;

public class ClasseEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		ClasseEmployee employee1 = new ClasseEmployee("Olga", "Maria", 0);
		ClasseEmployee employee2 = new ClasseEmployee("José", "Augusto", 0);

		System.out.println("Salario Digite o valor do seu salario mensal");
		double salarioMensal = scan.nextDouble();
		employee1.setSalario(salarioMensal);

		System.out.println("Salario Digite o valor do seu salario mensal");
		double salarioMensal2 = scan.nextDouble();
		employee2.setSalario(salarioMensal2);

		System.out.println(employee1.getNome() + " " + employee1.getSobrenome() + " " + employee1.getSalario());
		System.out.println(employee2.getNome() + employee2.getSobrenome() + " " + employee2.getSalario());

		System.out.println("Salario Anual:");
		System.out.println(employee1.getNome() + " " + employee1.getSobrenome() + " " + employee1.getSalario() * 12);
		System.out.println(employee2.getNome() + " " + employee2.getSobrenome() + " " + employee2.getSalario() * 12);

		System.out.println("Salario Aumentado:");
		System.out.println(employee1.getNome() + " " + employee1.getSobrenome() + " " + (employee1.getSalario() * 12	+ (employee1.getSalario() * 12) * 0.10));
		System.out.println(employee2.getNome() + " " + employee2.getSobrenome() + " " + (employee2.getSalario() * 12 + (employee2.getSalario() * 12) * 0.10));
		scan.close();

	}

}
