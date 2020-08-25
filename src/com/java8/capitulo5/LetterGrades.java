package com.java8.capitulo5;

import java.util.Scanner;

public class LetterGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int total = 0;
		int gradeCounter = 0;
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int eCount = 0;
		int fCount = 0;

		System.out.printf("%s%s%n%s%n %s%n ", "Enter the integer grades in the range 0-100.",
				"Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter", "On Windows type <Ctrl> z then press Enter");

		while (scan.hasNext()) {
			int grade = scan.nextInt();
			total += grade;
			gradeCounter += 1;

			switch (grade / 10) {
			case 9:
			case 10:
				aCount += 1;
				break;
			case 8:
				bCount += 1;
				break;
			case 7:
				cCount += 1;
				break;
			case 6:
				dCount += 1;
				break;
			default:
				fCount += 1;
				break;

			}

		}
		System.out.println("%n Grade Report:%n");

		if (gradeCounter != 0) {
			double average = (double) total / gradeCounter;

			System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
			System.out.printf("%Total of the %d grades entered is %d%n", gradeCounter);
		} else {
			System.out.println("No grades Entered!");
		}

		scan.close();

	}

}
