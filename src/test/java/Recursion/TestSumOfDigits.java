package Recursion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSumOfDigits {
  private SumOfDigits sumOfDigits;

  @Before
  public void init() {
    sumOfDigits = new SumOfDigits();
  }

  @Test
  public void testSuccess() {
    Assert.assertEquals(10, sumOfDigits.sum(46));
  }
}
