class Solution {
    public int largestInteger(int[] nums, int k) {
        int sol[]=new int[51];
        int n=nums.length;
        for(int i=0;i<=n-k;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(nums[j]);
            }
            for(int ele:set){
                sol[ele]++;
            }
        }
        for(int i=50;i>=0;i--){
            if(sol[i]==1)
            return i;
        }
        return -1;
    }
}