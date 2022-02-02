package Bitwise;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestReverseBits {
  private ReverseBits reverseBits;

  @Before
  public void init() {
    reverseBits = new ReverseBits();
  }

  @Test
  public void testSuccess() {
    long result = reverseBits.reverse(0);
    Assert.assertEquals(3, result);
  }

}
