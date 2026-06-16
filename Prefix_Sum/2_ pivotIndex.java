package PrefixSum;


class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
        int rsum=0;
        int lsum=0;
        for(int i=0;i<n;i++){
            rsum=totalsum-lsum-nums[i];
            if(rsum==lsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}
// prefix sum
//https://leetcode.com/problems/find-pivot-index/
