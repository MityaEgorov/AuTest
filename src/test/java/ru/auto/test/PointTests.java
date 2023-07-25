package ru.auto.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testArea(){
    Point r = new Point (12,6);
    Point s = new Point(14,54);
    Assert.assertEquals(distance(r,s);
  }

  public static double distance(Point p1, Point p2) {

    double result = (p1.p1 - p2.p1) + (p1.p2 - p2.p2);
    return result;
  }
}
