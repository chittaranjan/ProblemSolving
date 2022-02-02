package Bitwise;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestDifferentBitsSumPairwise{
  private DifferentBitsSumPairwise differentBitsSumPairwise;

  @Before
    public void init() {
      differentBitsSumPairwise = new DifferentBitsSumPairwise();
  }

  @Test
    public void testSuccess() {
      ArrayList<Integer> list = new ArrayList<>();
      list.addAll(Arrays.asList(1, 3, 5));
      int sum = differentBitsSumPairwise.getPairwiseSum(list);
      Assert.assertEquals(8, sum);
  }

  public void testSuccess2() {
    ArrayList<Integer> list = new ArrayList<>();
    list.addAll(Arrays.asList(2, 3));
    int sum = differentBitsSumPairwise.getPairwiseSum(list);
    Assert.assertEquals(2, sum);
  }
}
