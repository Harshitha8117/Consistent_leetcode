class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int c=0;
        long sum=0;
        for(int num:nums){
            if(num==0){
                c++;
            }
            else{
                sum+=(1L*c*(c+1)/2);
                c=0;
            }
        }
        sum+=(1L*c*(c+1)/2);
        return sum;
    }
}



