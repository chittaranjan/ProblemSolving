package Recursion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFibonacciII {
  private FibonacciII fib;

  @Before
  public void init() {
    fib = new FibonacciII();
  }
  
  @Test
  public void testNthFibonacci() {
    Assert.assertEquals(8 , fib.findAthFibonacci(6));
  }
}
