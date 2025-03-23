class Solution {
    public int findNonMinOrMax(int[] nums) {
        int res=0;
        if(nums.length>2){
            Arrays.sort(nums);
            res=nums[1];
        }
        else{
            res=-1;
        }
        return res;
    }
}