class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int k=0;
        for(int j:nums){
            if(j!=0){
                nums[k++]=j;
            }
        }
        while(k<nums.length){
            nums[k++]=0;
        }
        return nums;
    }
}