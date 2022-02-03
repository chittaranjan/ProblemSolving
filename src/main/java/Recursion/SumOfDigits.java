/**
 * Given a number A, we need to find sum of its digits using recursion.
 */
package Recursion;

public class SumOfDigits {
    public int sum(int A) {
        if (A == 0) return 0;
        return (A % 10) + sum(A/10);
    }
}
