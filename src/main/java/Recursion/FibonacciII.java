/**
* The Fibonacci numbers are the numbers in the following integer sequence.

* 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

* In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:

* Fn = Fn-1 + Fn-2

* Given a number A, find and return the Ath Fibonacci Number.

* Given that F0 = 0 and F1 = 1.
*/
package Recursion;

public class FibonacciII {
  public int findAthFibonacci(int A) {
        if (A <= 1) {
            return A;
        }
        int[] fib = new int[A+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i =2; i<= A; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[A];
    }
}
