class Solution {
    public int arraySign(int[] nums) {
        int count=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count=0;
                break;
            }
            else if(nums[i]<0){
                count*=-1;
            }
        }
        if(count==0)
        return 0;
        else if(count<0)
        return -1;
        else
        return 1;
    }
}