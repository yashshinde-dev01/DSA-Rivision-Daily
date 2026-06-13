class Solution {
    public void sortColors(int[] nums) {
      int low=0;
      int mid=0;
      int high=nums.length-1;
      while(mid<=high){
        if(nums[mid]==0){
            swap(nums,low,mid);
            low++;
            mid++;
        }else if(nums[mid]==2){
            swap(nums,high,mid);
            high--;
        }else{
            mid++;
        }
      } 
    }
    private static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
// dutch national flag algorithm
//https://leetcode.com/problems/sort-colors/