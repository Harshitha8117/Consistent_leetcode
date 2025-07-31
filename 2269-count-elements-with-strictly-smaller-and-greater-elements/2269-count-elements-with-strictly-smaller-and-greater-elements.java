class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int first=nums[0];
        int c=0;
        int last=nums[nums.length-1];
        for(int num:nums)
        if(num>first && num<last){
            c++;
        }
        return c;
    }
}