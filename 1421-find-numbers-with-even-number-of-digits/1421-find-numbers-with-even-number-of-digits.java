class Solution {
    public int findNumbers(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            while(nums[i]!=0){
            nums[i]/=10;
            c+=1;
            }
            if(c%2==0){
                sum++;
            }
        }
        return sum;
    }
}