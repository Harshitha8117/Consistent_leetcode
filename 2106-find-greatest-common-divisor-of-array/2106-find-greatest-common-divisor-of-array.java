class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int res=1;
        int max=nums[nums.length-1];
        for(int i=2;i<=max;i++){
            if(min%i==0 && max%i==0){
                res=Math.max(res,i);
            }
        }
        return res;
    }
}