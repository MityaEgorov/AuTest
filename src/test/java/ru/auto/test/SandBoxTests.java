package ru.auto.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SandBoxTests {

  @Test
  public void testArea(){
    Point r = new Point(12.0,6.0);
    Point s = new Point(35.0,45.0);
    assert Qwerty.distance(r,s) == 45.27692569068709;
    Assert.assertEquals (Qwerty.distance(r,s), 46.27692569068709);
  }

//qwerty
}
