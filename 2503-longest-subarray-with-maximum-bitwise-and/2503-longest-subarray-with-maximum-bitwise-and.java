class Solution {
    public int longestSubarray(int[] nums) {
        int great=nums[0];
        int c=0;
        int maxc=0;
        for(int i=0;i<nums.length;i++){
            if(great<nums[i]){
                great=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==great){
                c++;
                maxc=Math.max(maxc,c);
            }
            else{
                c=0;
            }
        }
        return maxc;
    }
}