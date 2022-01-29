/**
* Given an array of integers A, every element appears twice except for one. Find that single one.
*
* NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
**/
public class Solution {
    public int singleNumber(final List<Integer> A) {
        /**
        * Using Bitisw xor properties :
        * 0^a = a and a^a = 0
        */
        int singleNumber = 0;
        for (Integer a : A) {
            singleNumber ^= a;
        }
        return singleNumber;
    }
}
