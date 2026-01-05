class Solution {
    public void sortColors(int[] nums) {
        int l=0,mid=0,r=nums.length-1;
        while(mid<=r){
            if(nums[mid]==0){
                int temp=nums[l];
                nums[l++]=nums[mid];
                nums[mid++]=temp;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[r];
                nums[r--]=temp;
            }
        }
    }
}


