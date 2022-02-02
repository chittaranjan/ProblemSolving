/**
* We define f(X, Y) as number of different corresponding bits in binary representation of X and Y.
* For example, f(2, 7) = 2, since binary representation of 2 and 7 are 010 and 111, respectively.
* The first and the third bit differ, so f(2, 7) = 2.
*
* You are given an array of N positive integers, A1, A2 ,..., AN.
* Find sum of f(Ai, Aj) for all pairs (i, j) such that 1 ≤ i, j ≤ N. Return the answer modulo 109+7.
**/

package Bitwise;

import java.util.ArrayList;

public class DifferentBitsSumPairwise {
  private static final int MODULO = 1000000007;
  public int getPairwiseSum(ArrayList<Integer> A) {
    long sum = 0;
    int n = A.size();
    for (int i = 0; i < 31; i++) {
      int setBitCount = 0;
      for (int a : A) {
        if ((a & (1 << i)) != 0) {
          setBitCount++;
        }
      }
      sum += 2 * (long) setBitCount * (n - (long) setBitCount);
      sum = (sum % MODULO);
    }
    return (int) sum % MODULO;
  }
}
