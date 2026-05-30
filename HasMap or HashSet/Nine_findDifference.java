import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>s1=new HashSet<>();
        HashSet<Integer>s2=new HashSet<>();
        for(int num:nums1){
            s1.add(num);
        }
        for(int num:nums2){
            s2.add(num);
        }
        ArrayList<List<Integer>>lst=new ArrayList<>();
        ArrayList<Integer>l1=new ArrayList<>();
        for(int num:s1){
            if(!s2.contains(num)){
                l1.add(num);
            }
        }
        ArrayList<Integer>l2=new ArrayList<>();
        for(int num:s2){
            if(!s1.contains(num)){
                l2.add(num);
            }
        }
        lst.add(l1);
        lst.add(l2);
        return lst;
        
    }
}
// using hashset
//leetcode-https://leetcode.com/problems/find-the-difference-of-two-arrays/?utm_source=chatgpt.com