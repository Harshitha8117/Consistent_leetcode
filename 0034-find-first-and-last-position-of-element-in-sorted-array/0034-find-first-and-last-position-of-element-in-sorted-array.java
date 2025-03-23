class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[]={-1,-1};
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                a[0]=i;
                k=i;
                break;
            }
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]==target){
                a[1]=i;
            }
        }
        return a;
    }
}