class Solution {
    public int smallestIndex(int[] nums) {
        int ss=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int val=nums[i];
            while(val>0){
                int temp=val%10;
                sum+=temp;
                val/=10;
            }
            if(sum==i){
                ss=sum;
                return ss;
            }
        }
        return -1;
    }
}