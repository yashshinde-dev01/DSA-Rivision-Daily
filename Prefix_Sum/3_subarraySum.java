package PrefixSum;

class Solution {
    public int subarraySum(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        
        int currentSum = 0;
        int count = 0;
        
        for (int num : nums) {
            currentSum += num;
            
            // Check if (currentSum - k) exists
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }
            
            // Store currentSum in map
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
}
// prefix sum
//https://leetcode.com/problems/subarray-sum-equals-k/
