class Solution {
    public int findClosestNumber(int[] nums) {
        int a=0;
        int b=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i==0){
            b=Math.abs(nums[i]);
            a=nums[i];
            }
            else{
            if(b>=Math.abs(nums[i])){
                b=Math.abs(nums[i]);
                a=nums[i];
            }
            }
        }
        return a;
            
    }
}