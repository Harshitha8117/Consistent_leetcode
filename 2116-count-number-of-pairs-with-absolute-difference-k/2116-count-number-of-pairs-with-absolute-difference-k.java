class Solution {
    public int countKDifference(int[] nums, int k) {
        int a=nums.length;
        int ab=0;
        for(int i=0;i<a;i++){
            for(int j=1;j<a;j++){
                int sum=nums[i]-nums[j];
                if(k==Math.abs(sum) && i<j)
                    ab++;
            }
        }
        return ab;
    }
}