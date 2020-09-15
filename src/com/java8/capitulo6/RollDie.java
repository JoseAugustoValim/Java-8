package com.java8.capitulo6;

import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom randomNumbers = new SecureRandom();

		int frequency1 = 0;
		int frequency2 = 0;
		int frequency3 = 0;
		int frequency4 = 0;
		int frequency5 = 0;
		int frequency6 = 0;

		for (int i = 1; i <= 6000000; i++) {
			int face = 1 + randomNumbers.nextInt(6);

			switch (face) {
			case 1:
				frequency1 += 1;
				break;
			case 2:
				frequency2 += 1;
				break;
			case 3:
				frequency3 += 1;
				break;
			case 4:
				frequency4 += 1;
				break;
			case 5:
				frequency5 += 1;
				break;
			case 6:
				frequency6 += 1;
				break;
			}

		}
		System.out.println("Face/Frequencia");
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1, frequency2, frequency3, frequency4,
				frequency5, frequency6);
	}

}
