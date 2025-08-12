class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int cc=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            cc+=nums[i];
            if(cc==0){
                c++;
            }
        }
        return c;
    }
}