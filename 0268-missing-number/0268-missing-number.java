class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        int count=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==k++){
                count=count+1;
                continue;
            }
            else
            break;
        }
        if(count==nums.length)
        return count;
        else
        return k-1;
    }
}