class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m-1;
        int r=n-1;
        int k=m+n-1;
        while(l>=0 && r>=0){
            int n1=nums1[l];
            int n2=nums2[r];
            if(n1>=n2){
                nums1[k]=nums1[l];
                l--;
            }else{
                nums1[k]=nums2[r];
                r--;
            }
            k--;
        }
        while(r>=0){
            nums1[k]=nums2[r];
            r--;
            k--;
        }
    }
}
// two pointer
//https://leetcode.com/problems/merge-sorted-array/
