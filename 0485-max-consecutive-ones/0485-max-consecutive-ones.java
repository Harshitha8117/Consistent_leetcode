class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int maxC=0;
        for(int num:nums){
            if(num==1)
            c++;
            else
            c=0;
            maxC=Math.max(maxC,c);
        }
        return maxC;
    }
}