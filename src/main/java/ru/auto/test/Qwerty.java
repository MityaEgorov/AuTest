
package ru.auto.test;


public class Qwerty {
	public static void main(String[] args) {


		Point p1 = new Point(12, 6);
		Point p2 = new Point(35, 45);
	  double result = distance(p1, p2);


		System.out.println(" Расстояние между точками = " + result);

	}

	public static double distance(Point p1, Point p2) {
		return (Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y)));
	}
}

