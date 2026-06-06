class Solution {
    public int numberOfSubstrings(String s) {
        int cnt=0;
       int a=0;
       int b=0;
       int c=0;
       int right=0;
       int left=0;
       while(right<s.length()){
        char ch=s.charAt(right);
        if(ch=='a'){
            a++;
        }else if(ch=='b'){
            b++;
        }else{
            c++;
        }
        while(a>0 && b>0 && c>0){
            cnt+=(s.length()-right);
            char ch2 = s.charAt(left);
            if(ch2 == 'a') a--;
            else if(ch2 == 'b') b--;
            else c--;
            left++;
        }
        right++;
       }
       return cnt;
    }
}
// sliding window 
//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
