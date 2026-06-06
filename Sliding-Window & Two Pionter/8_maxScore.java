class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
       int lsum=0;
       for(int i=0;i<k;i++){
        lsum+=cardPoints[i];
       }  
       int rsum=0;
       int maxsum=lsum;
       int ridx=n-1;
       for(int i=k-1;i>=0;i--){
        lsum-=cardPoints[i];
        rsum=rsum+cardPoints[ridx];
        ridx--; 
        maxsum=Math.max(maxsum,lsum+rsum);
       }
       return maxsum;
    }
}
// sliding window 
//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/