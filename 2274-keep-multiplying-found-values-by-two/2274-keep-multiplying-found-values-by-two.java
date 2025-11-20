class Solution {
    public int findFinalValue(int[] nums, int k) {
        int ans=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
            if(nums[j]==k){
                ans=k*2;
                k=ans;
            }
            }
        }
        if(ans<2)
        ans=k;
        return ans;
    }
}