package Bitwise;

/**
*Given an integer array nums where every element appears three times except for one,
*which appears exactly once. Find the single element and return it.
*
*You must implement a solution with a linear runtime complexity and use only constant extra space.

* Leetcode problem #137
*/
class SingleNumberII {
    public int singleNumber(int[] nums) {
      int ans  =0;
      //since given integer array, outer loop runs for 32 bits
      for (int i=0; i<32; i++) {
        int setBitCount = 0;
        for (int n : nums) {
          if ((n & (1 << i)) != 0) {
            setBitCount++;
          }
        }
        if ( (setBitCount % 3) != 0 ) {
          ans |= (1 << i);
        }
      }
      return ans;
    }
}
