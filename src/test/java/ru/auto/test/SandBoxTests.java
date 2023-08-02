package ru.auto.test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SandBoxTests {

  @Test
  public void testArea(){
    Point p1 = new Point(12, 6);
    Point p2 = new Point(35, 45);
    assert p1.distance(p2) == 45.27692569068709;
    Assert.assertEquals (p1.distance(p2), 45.27692569068709);
    //изменил на норм значение
  }

}


