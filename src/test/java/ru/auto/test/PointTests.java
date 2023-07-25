package ru.auto.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testArea(){
    Point r = new Point (12,6);
    Assert.assertEquals(r.sqrt(),6.0);
  }
  @Test
  public void testSqrt(){
    Point r = new Point (12,6);
    Assert.assertEquals(r.sqrt(),8.0);
  }
}
