import  java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxcnt=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int curr=num;
                int cnt=1;
                while(set.contains(curr+1)){
                    curr++;
                    cnt++;
                }
                maxcnt=Math.max(maxcnt,cnt);
            }
        }
        return maxcnt;
    }
}
// using hashset 
// leetcode-https://leetcode.com/problems/longest-consecutive-sequence/