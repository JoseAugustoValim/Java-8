package com.java8.capitulo6;

import java.security.SecureRandom;

public class RandomIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom randomNumbers = new SecureRandom();

		for (int i = 1; i <= 20; i++) {
			int face = 1 + randomNumbers.nextInt(6);

			System.out.printf(" %d" , face);

			if (i % 5 == 0) {
				System.out.println();

			}
		}

	}
}
