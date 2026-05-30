import java.util.*;
class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer>set=new HashSet<>();
       while(n!=1){
        if(set.contains(n)){
            return false;
        }
        set.add(n);
        int num=0;
        while(n>0){
            int digit=n%10;
            num=num+digit*digit;
            n=n/10;
        }
        n=num;
       }
       return true;
    }
}
// using hashset
//leetcode-https://leetcode.com/problems/happy-number/?utm_source=chatgpt.com
