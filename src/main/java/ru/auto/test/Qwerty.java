package ru.auto.test;

public class Qwerty {
	public static void main(String[] args) {
		hello("world");
		hello("Name");
		hello("User");

		double len = 5;
		System.out.println("Площадь" + len + "что-то" + area(len) );

		double a = 4;
		double b = 6;
		System.out.println("Площадь" + a + "И" + b + "что-то" + area(a, b) );

	}

	public static void hello(String somebody) {
		System.out.println("Hello," + somebody + "!");
	}


	public static double area ( double l) {
		return 1 * 1 ;

	}
	public static double area (double a , double b) {
		return a * b;
	}

}