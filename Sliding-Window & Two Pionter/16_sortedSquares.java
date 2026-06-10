class Solution {
    public int[] sortedSquares(int[] nums) {
       int l=0;
       int r=nums.length-1;
       int k=nums.length-1;
       int[]ans=new int[nums.length];
       while(l<=r){
        int sq1=nums[l]*nums[l];
        int sq2=nums[r]*nums[r];
        if(sq1>sq2){
            ans[k]=sq1;
            l++;
        }else{
            ans[k]=sq2;
            r--;
        }
        k--;
       } 
       return ans;
    }
}
// two poniter
//https://leetcode.com/problems/squares-of-a-sorted-array/?utm_source=chatgpt.com
