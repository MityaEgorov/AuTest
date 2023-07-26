
package ru.auto.test;

public class Qwerty {
	public static void main(String[] args) {



		Point r = new Point(12, 6);
		Point s = new Point(35, 45);
		double result = distance(r, s);


		System.out.println(" Расстояние между точками " + r.x + " И " + s.y + "=" +  result);

	}

	public static double distance(Point p1, Point p2) {

		double diffX = (p1.x - p2.x) * (p1.x - p2.x);
		double diffY = (p1.y - p2.y) * (p1.y - p2.y);
		return Math.sqrt(diffX + diffY);

	}
}