package com.java8.capitulo6;

public class MethodOverload {

	public static int square(int intValue) {
		System.out.printf("%n Called square with in int argument: %d%n", intValue);
		return intValue * intValue;
	}

	public static double square(double floatValue) {
		System.out.printf("%n Called square with in int argument: %f%n", floatValue);
		return floatValue * floatValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Square of integer 7 is %d%n ", square(7));
		System.out.printf("Square of integer 7 is %f%n ", square(7.5));
	}

}
