
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return AtMost(nums,goal)-AtMost(nums,goal-1);
    }
    private int AtMost(int[]nums,int k){
        if (k < 0) return 0;
        int l=0;
        int cnt=0;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>k){
                sum -= nums[l];
                l++;
            }
            cnt=cnt+(r-l+1);
        }
        return cnt;
    }
}
// sliding window with atmost and atmost -1 problem 
//https://leetcode.com/problems/binary-subarrays-with-sum/