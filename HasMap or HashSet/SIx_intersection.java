import  java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>lst=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                lst.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[]arr=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            arr[i]=lst.get(i);
        }
        return arr;
    }
}
// hashset
//leetcode-https://leetcode.com/problems/intersection-of-two-arrays/