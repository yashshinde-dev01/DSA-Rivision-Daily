class Solution {
    public int maxSubarraySumCircular(int[] nums) {
          int totalSum = 0;

        int maxSum = nums[0];
        int currMax = 0;

        int minSum = nums[0];
        int currMin = 0;

        for (int num : nums) {
            totalSum += num;

            // Max subarray (Kadane)
            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            // Min subarray
            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);
        }

        // Edge case: all elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        int circularSum = totalSum - minSum;

        return Math.max(maxSum, circularSum);
    }
}

//kaden's algo
//https://leetcode.com/problems/maximum-sum-circular-subarray/

