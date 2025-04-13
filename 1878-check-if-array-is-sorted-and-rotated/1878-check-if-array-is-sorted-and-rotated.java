class Solution {
    public boolean check(int[] nums) {
        int a=0;
        if(nums[0]<nums[nums.length-1]){
            a++;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                a++;
            }
        }
        return (a<=1);

    }
}