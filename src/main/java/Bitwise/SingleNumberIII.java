package Bitwise;

/**
* Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice.
* Find the two elements that appear only once. You can return the answer in any order.

* You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
**/
class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int n: nums) {
            xor ^= n;
        }

        //Xor has xor of 2 single numbers
        //Find the firstset bit;
        int b =0;
        for (int i=0; i<31; i++) {
            if ( (xor & (1 << i)) != 0) {
                b = i;
                break;
            }
        }

        int s1 = 0; //Get the result of xor of all the numbers whose b th bit is set
        int s2 = 0; //Get the result of xor of all the numbers whose b th bit is not set
        for (int n: nums) {
            if ( (n & (1 << b)) != 0 ) {
                s1 ^= n;
            } else {
                s2 ^= n;
            }
        }
        return new int[]{s1, s2};
    }

}
