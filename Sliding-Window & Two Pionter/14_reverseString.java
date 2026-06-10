class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        while(l<=r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            r--;
            l++;
        }
    }
}
// two pointer
//https://leetcode.com/problems/reverse-string/?utm_source=chatgpt.com
