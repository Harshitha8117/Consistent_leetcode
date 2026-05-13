class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        for(int num:nums){
            if(num!=0){
                nums[c++]=num;
            }
        }
        while(c<nums.length){
            nums[c++]=0;
        }
    }
}