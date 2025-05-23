class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxTriplets=0,maxNums=0,maxDiff=0;
        for(int num:nums){
            maxTriplets=Math.max(maxTriplets,maxDiff*num);
            maxDiff=Math.max(maxDiff,maxNums-num);
            maxNums=Math.max(maxNums,num);
        }
        return maxTriplets;
    }
}