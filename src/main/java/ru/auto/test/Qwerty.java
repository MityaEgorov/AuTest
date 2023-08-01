
package ru.auto.test;


public class Qwerty {
	public static void main(String[] args) {


		Point p1 = new Point(12, 6);
		Point p2 = new Point(35, 45);
		double result = distance(p1, p2);


		System.out.println(" Расстояние между точками " + p1.x + " И " + p2.y + " = " + result);

	}

	public static double distance(Point p1, Point p2) {

		double diffX = (p1.x - p2.x) * (p1.x - p2.x);
		double diffY = (p1.y - p2.y) * (p1.y - p2.y);
		return Math.sqrt(diffX + diffY);
	}
}

