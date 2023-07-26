package ru.auto.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SandBoxTests {

  @Test
  public void testArea(){
    Point r = new Point(12,6);
    Point s = new Point(14,54);
    Assert.assertEquals(distance(r,s);
  }

  public static double distance(Point p1, Point p2) {

    double result = (p1.x - p2.x) + (p1.y - p2.y);
    return result;
  }
}
