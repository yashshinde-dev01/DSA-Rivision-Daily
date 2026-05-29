import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>map=new HashMap<>();
        HashMap<Character,Character>map2=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(map.containsKey(ch1)){
                if(map.get(ch1)!=ch2){
                    return false;
                }
            }else{
                map.put(ch1,ch2);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(map2.containsKey(ch2)){
                if(map2.get(ch2)!=ch1){
                    return false;
                }
            }else{
                map2.put(ch2,ch1);
            }
        }
        return true;
    }
}

// using hashmap
//leetcode-https://leetcode.com/problems/isomorphic-strings/?utm_source=chatgpt.com
