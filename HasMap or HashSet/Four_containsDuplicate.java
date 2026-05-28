import java.util.*;
class Solution {
    public boolean Four_containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }
}
// use hashset or hashmap 
//leetcode-https://leetcode.com/problems/contains-duplicate/
