class Solution {
    public int[] getConcatenation(int[] nums) {
        int size=nums.length*2;
        int ans[]=new int[size];
        int k=0;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[k++];
        }
        k=0;
        for(int i=nums.length;i<size;i++){
            ans[i]=nums[k++];
        }
        return ans;
    }
}