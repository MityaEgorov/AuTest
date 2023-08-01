package ru.auto.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.auto.test.Qwerty.distance;

public class SandBoxTests {

  @Test
  public void testArea(){
    Point x = new Point(12.0,6.0);
    Point y = new Point(35.0,45.0);
    assert distance(x,y) == 45.27692569068709;
    Assert.assertEquals (distance(x,y), 46.27692569068709);
  }

//qwerty
}
