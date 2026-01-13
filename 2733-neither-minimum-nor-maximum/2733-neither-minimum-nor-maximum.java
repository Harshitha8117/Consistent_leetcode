class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min=nums[0],max=nums[0];
        int ans=-1;
        if(nums.length<3)
        return -1;
        for(int i=1;i<nums.length;++i){
            if(nums[i]<min){
                ans=min;
                min=nums[i];
            }
            else if(nums[i]>max){
                ans=max;
                max=nums[i];
            }
            else{
                return nums[i];
            }
        }
        return ans;
    }
}




/*class Solution {
    public int findNonMinOrMax(int[] nums) {
        int a=nums[0],b=nums[0];
        for(int num:nums){
            a=Math.min(num,a);
            b=Math.max(num,b);
        }
        for(int num:nums){
            if(num!=a && num!=b)
            return num;
        }
        return -1;
    }
}*/