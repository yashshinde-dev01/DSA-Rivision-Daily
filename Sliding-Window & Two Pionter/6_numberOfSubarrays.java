
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
      return AtMost(nums,k)-AtMost(nums,k-1);
    }
    private int AtMost(int[]nums,int k){
        int l=0;
        int cnt=0;
        int odd=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]%2!=0){
                odd++;
            }
            while(odd>k){
                if(nums[l]%2!=0){
                    odd--;
                }
                l++;
            }
            cnt=cnt+(r-l+1);
        }
        return cnt;
    }
}
// at most k and at most k-1 que 
//https://leetcode.com/problems/count-number-of-nice-subarrays/