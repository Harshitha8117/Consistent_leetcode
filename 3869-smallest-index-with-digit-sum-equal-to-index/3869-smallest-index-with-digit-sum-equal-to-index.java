/*class Solution{
    public static int smallestIndex(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(sumDigit(nums[i])==i){
                return i;
            }
        }
        return -1;
    }

    public static int sumDigit(int n){
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            n/=10;
        }
        return sum;
    }
}*/





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