package Arrays;

/**
* Given an integer array nums, find the contiguous subarray (containing at least one number)
* which has the largest sum and return its sum.
*
* A subarray is a contiguous part of an array.

* Leetcode problem # 53
* Scaler Arrays assignment # 3
*/
class Solution {
    public int maxSubArray(int[] nums) {
      int sum = nums[0];
      int max = nums[0];
      for (int i=1; i<nums.length; i++) {
        sum = Math.max(0, sum) + nums[i]; //Discard negative
        max = Math.max(sum, max);
      }
      return max;
    }
}
