package Bitwise;

import java.util.ArrayList;
import java.util.Collections;

/**
* Given an integer array A of N integers,
* find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.
**/
public class MinimumXoR {
    public int findMinXor(ArrayList<Integer> A) {
        int n = A.size();
        // Sort given list
        Collections.sort(A);

        int answer = Integer.MAX_VALUE;

        // calculate min xor of consecutive pairs
        for (int i = 0; i < n - 1; i++) {
            int xor = A.get(i) ^ A.get(i + 1);
            answer = Math.min(answer, xor);
        }

        return answer;
    }
}
