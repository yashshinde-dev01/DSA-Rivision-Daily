class Solution {
    public String minWindow(String s, String t) {
      int m=t.length();
      int n=s.length();
      int[]hash=new int[256];
      int minlen=Integer.MAX_VALUE;
      int sidx=-1;
      for(int i=0;i<m;i++){
        char ch=t.charAt(i);
        hash[ch]++;
      }
      int r=0;
      int l=0;
      int cnt=0;
      while(r<n){
        char ch=s.charAt(r);
        if(hash[ch]>0){
            cnt++;
        }
        hash[ch]--;
        while(cnt==m){
            if(r-l+1<minlen){
                minlen=r-l+1;
                sidx=l;
            }
            char ch2=s.charAt(l);
            hash[ch2]++;
            if(hash[ch2]>0){
                cnt--;
            }
            l++;
        }
        r++;
      }
      return sidx==-1 ? "" : s.substring(sidx,minlen+sidx);
    }
}

// hard problem of sliding window + hash array
//https://leetcode.com/problems/minimum-window-substring/
