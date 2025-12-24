class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int dup=0,sum=0,sum1=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                dup=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=1;i<=nums.length;i++){
            sum1+=i;
        }
        int ans=sum-dup;
        int sol=sum1-ans;
        int a[]=new int[2];
        a[0]=dup;
        a[1]=sol;
        return a;
    }
}